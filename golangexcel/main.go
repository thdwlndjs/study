package main

import (
	"bufio"
	"database/sql"
	"fmt"
	"log"
	"os"
	"time"

	_ "github.com/go-sql-driver/mysql"
	"github.com/xuri/excelize/v2"
)

var writer *bufio.Writer = bufio.NewWriter(os.Stdout)

func getDatabaseData() ([][]string, error) {
	// MariaDB 연결 정보
	dsn := "thdwlndjs:1234@tcp(192.168.171.131:3306)/mydatabase"
	db, err := sql.Open("mysql", dsn)
	if err != nil {
		return nil, err
	}
	defer db.Close()

	// 쿼리 실행
	rows, err := db.Query("seq, id, name, type, deal, contract, site, note, note2, status, activities_type, product_type, dept, sales_manager, engineer, engineer2, severity, priority, rating, support_rating, assigned_to, start_due_date, end_due_date, start_date, end_date, create_at, update_at, owner, del_flag")
	if err != nil {
		return nil, err
	}
	defer rows.Close()

	// 결과를 저장할 슬라이스
	var data [][]string

	// 열 이름 추가
	data = append(data, []string{"고객사", "제목", "지원제품", "지원타입", "등록일자", "예정기간", "진행기간", "엔지니어", "영업", "심각도", "상태"})

	// 데이터 읽기
	for rows.Next() {
		var seq, id, name, tvype, deal, contract, site, note, note3, status, activities_type, product_type, dept, sales_manager, engineer, engineer2, severity, priority, rating, support_rating, assigned_to, start_due_date, end_due_date, start_date, end_date, create_at, update_at, owner, del_flag string
		if err := rows.Scan(&seq, &id, &name, &tvype, &deal, &contract, &site, &note, &note3, &status, &activities_type, &product_type, &dept, &sales_manager, &engineer,
			&engineer2, &severity, &priority, &rating, &support_rating, &assigned_to, &start_due_date, &end_due_date, &start_date, &end_date, &create_at, &update_at, &owner,
			&del_flag); err != nil {
			return nil, err
		}
		data = append(data, []string{id, name, product_type, activities_type, create_at, start_due_date, end_due_date, start_date, end_date, engineer, severity, del_flag, owner})
	}

	return data, nil
}

func getCellStyle(f *excelize.File, style string) int {
	switch style {
	case "header":
		style, err := f.NewStyle(&excelize.Style{
			Font:      &excelize.Font{Bold: true, Size: 16},
			Alignment: &excelize.Alignment{Horizontal: "center"},
			Border: []excelize.Border{
				{Type: "left", Color: "000000", Style: 1},
				{Type: "top", Color: "000000", Style: 1},
				{Type: "bottom", Color: "000000", Style: 2}, // 2 굵은 선
				{Type: "right", Color: "000000", Style: 1},
			},
			Fill: excelize.Fill{Type: "pattern", Color: []string{"999999"}, Pattern: 1},
		})
		if err != nil {
			panic(err)
		}
		return style
	default:
		style, err := f.NewStyle(&excelize.Style{
			Border: []excelize.Border{
				{Type: "left", Color: "000000", Style: 1},
				{Type: "top", Color: "000000", Style: 1},
				{Type: "bottom", Color: "000000", Style: 1},
				{Type: "right", Color: "000000", Style: 1},
			},
			Fill: excelize.Fill{Type: "pattern", Color: []string{"CCCC99"}, Pattern: 1},
		})
		if err != nil {
			panic(err)
		}
		return style
	}
}

func main() {
	data, err := getDatabaseData()
	if err != nil {
		log.Fatalf("Failed to get data from database: %v", err)
	}

	f := excelize.NewFile()

	sheetName := "Sheet1"
	sheet, err := f.NewSheet(sheetName)
	if err != nil {
		fmt.Fprintln(writer, err)
		return
	}

	f.SetColWidth(sheetName, "A", "A", 20) // 시간 컬럼 넓이
	f.SetColWidth(sheetName, "B", "D", 15) // 사용처, 금액, 비고 컬럼 넓이

	styleDefault := getCellStyle(f, "")
	styleHeader := getCellStyle(f, "header")

	// Print header
	for i, header := range data[0] {
		f.SetCellValue(sheetName, fmt.Sprintf("%s%d", string('A'+i), 1), header)
	}
	f.SetCellStyle(sheetName, "A1", fmt.Sprintf("%s1", string('A'+len(data[0])-1)), styleHeader)

	// Print data
	for i, row := range data[1:] {
		for j, cell := range row {
			f.SetCellValue(sheetName, fmt.Sprintf("%s%d", string('A'+j), i+2), cell)
		}
		f.SetCellStyle(sheetName, fmt.Sprintf("A%d", i+2), fmt.Sprintf("%s%d", string('A'+len(row)-1), i+2), styleDefault)
	}

	// Optionally add a chart here if needed

	filename := fmt.Sprintf("%s.xlsx", time.Now().Format("2006-01-02-1504"))

	f.SetActiveSheet(sheet)
	if err := f.SaveAs(filename); err != nil {
		fmt.Fprintln(writer, err)
	}
	fmt.Fprintln(writer, "엑셀 파일이 생성되었습니다:", filename)
}

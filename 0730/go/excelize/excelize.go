package main

import (
	"fmt"

	"github.com/xuri/excelize/v2"
)

// Convert column number to Excel column name
func columnNumberToExcelColumn(n int) string {
	result := ""
	for n > 0 {
		n-- // 1-based index adjustment
		remainder := n % 26
		result = string('A'+remainder) + result
		n /= 26
	}
	return result
}
func main() {
	// 새로운 Excel 파일을 생성합니다.
	f := excelize.NewFile()

	// 기본 시트를 가져옵니다.
	sheet := "Sheet1"

	// 셀에 데이터를 작성합니다.
	f.SetCellValue(sheet, "A1", "a1")
	f.SetCellValue(sheet, "B1", "World")
	f.SetCellValue(sheet, "A2", 123)
	f.SetCellValue(sheet, "B2", 456.78)

	// 새로운 시트를 추가하고 데이터 작성
	newSheet := "Sheet2"
	f.NewSheet(newSheet)
	f.SetCellValue(newSheet, "A1", "New Sheet")
	f.SetCellValue(newSheet, "A2", "Another Value")

	// Excel 파일을 저장합니다.
	if err := f.SaveAs("example.xlsx"); err != nil {
		fmt.Println("Error saving file:", err)
		return
	}

	fmt.Println("Excel file created and saved successfully!")
	// Open the Excel file
	f, err := excelize.OpenFile("example.xlsx")
	if err != nil {
		fmt.Println(err)
		return
	}

	// Get the sheet names
	sheetNames := f.GetSheetList()

	for _, sheetName := range sheetNames {
		// Get all rows from the sheet
		rows, err := f.GetRows(sheetName)
		if err != nil {
			fmt.Println(err)
			return
		}

		// Iterate through rows and cells
		for rowIndex, row := range rows {
			for colIndex, cell := range row {
				// Convert column index to Excel column name
				colName := columnNumberToExcelColumn(colIndex + 1)
				fmt.Printf("Sheet: %s, Cell: %s%d, Value: %s\n",
					sheetName, colName, rowIndex+1, cell)
			}
		}
	}
}

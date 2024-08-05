package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strings"
)

func contains(slice []string, value string) bool { //배열에 값있는지 확인
	for _, item := range slice {
		if item == value {
			return true
		}
	}
	return false
}

func main() {
	reader := bufio.NewReader(os.Stdin)
	writer := bufio.NewWriter(os.Stdout)
	var n int
	fmt.Fscanln(reader, &n) //a를 몇개 입력받을지를 입력받아서
	var a string
	defer writer.Flush()
	s := make([]string, 0)
	m := make(map[string]int)

	for i := 0; i < n; i++ {
		fmt.Fscanln(reader, &a)
		str := strings.Index(a, ".") + 1        //str="."인덱스 반환, ++
		extensionName := a[str:]                //extensionName=확장자명
		if contains(s, extensionName) == true { //확장자명이 배열 안에 있으면
			m[extensionName]++ //맵++
		} else { //없으면 추가
			s = append(s, extensionName)
		}
	}
	sort.Strings(s)           //배열정렬
	for _, eName := range s { //이름, 맵
		fmt.Fprint(writer, eName)
		fmt.Fprintln(writer, " ", m[eName]+1)
	}

}

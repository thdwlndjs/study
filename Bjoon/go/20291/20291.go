package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strings"
)

func contains(slice []string, value string) bool {
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
	fmt.Fscanln(reader, &n)
	var a string
	defer writer.Flush()
	s := make([]string, 0)
	m := make(map[string]int)

	for i := 0; i < n; i++ {
		fmt.Fscanln(reader, &a)
		str := strings.Index(a, ".") + 1
		extensionName := a[str:]
		if contains(s, extensionName) == true {
			m[extensionName]++
		} else {
			s = append(s, extensionName)
		}
	}
	sort.Strings(s)
	for _, eName := range s {
		fmt.Fprint(writer, eName)
		fmt.Fprintln(writer, " ", m[eName]+1)
	}

}

// sort.Slice(s, func(i, j int) bool { return s[i] < s[j] }) //slice로 배열 정렬하기 코드는 짧은데 시간복잡도가 높음

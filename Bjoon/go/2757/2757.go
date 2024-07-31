package main

import (
	"bufio"
	"fmt"
	"os"
)

var reader *bufio.Reader = bufio.NewReader(os.Stdin)
var writer *bufio.Writer = bufio.NewWriter(os.Stdout)

func columnNumberToExcelColumn(n int) string {
	result := ""
	for n > 0 {
		n--
		remainder := n % 26
		result = string('A'+remainder) + result
		n /= 26
	}
	return result
}

func main() {
	defer writer.Flush()
	var m, n int
	for {
		fmt.Fscanf(reader, "R%dC%d\n", &m, &n)
		if m == 0 && n == 0 {
			break
		} else {
			fmt.Fprint(writer, columnNumberToExcelColumn(n), m, "\n")
		}
	}
}

package main

import (
	"bufio"
	"fmt"
	"os"
)

var reader *bufio.Reader = bufio.NewReader(os.Stdin)
var writer *bufio.Writer = bufio.NewWriter(os.Stdout)

func check(s string, i int) string {
	scnt := 0
	bcnt := 0
	var result string
	for _, char := range s {
		// 문자가 s로시작하는지 검사
		if char == 's' {
			scnt++
		}

		// 문자가 b로시작하는지 검사
		if char == 'b' {
			bcnt++
		}
	}
	if bcnt+scnt != i {
		result = "error"
	} else if scnt > bcnt {
		result = "security!"
	} else if scnt < bcnt {
		result = "bigdata?"
	} else if scnt == bcnt {
		result = "bigdata? security!"
	}
	return result
}

func main() {
	defer writer.Flush()
	var m int
	var n string
	fmt.Fscanln(reader, &m)
	fmt.Fscanln(reader, &n)
	fmt.Fprintln(writer, check(n, m))
}

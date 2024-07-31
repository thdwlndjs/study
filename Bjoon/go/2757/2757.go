package main

import (
	"bufio"
	"fmt"
	"os"
)

var reader *bufio.Reader = bufio.NewReader(os.Stdin)
var writer *bufio.Writer = bufio.NewWriter(os.Stdout)

func main() {
	var m, n int
	for {
		fmt.Fscanln(reader, &m, &n)
		if m == 0 && n == 0 {
			break
		}

	}
}

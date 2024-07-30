package main

import (
	"bufio"
	"fmt"
	"os"
)

var reader *bufio.Reader = bufio.NewReader(os.Stdin)
var writer *bufio.Writer = bufio.NewWriter(os.Stdout)

func main() {
	value := make([]int, 0)
	var n int
	var k int
	var x int
	_, err := fmt.Fscanln(reader, &n, &k)
	if err != nil {
		fmt.Println("입력오류:", err)
		return
	} else if (1 > n || n > 10) || (1 > k || k > 100000000) {
		fmt.Println("허용범위 이외의 값입니다.(1 <= n <= 10, 1 <= k <= 100000000)\n 다시 입력해주세요")
	}
	for i := 0; i < n; i++ {
		fmt.Fscanln(reader, &x)
		value = append(value, x)
	}
	for _, arr := range value {
		fmt.Println(arr)
	}
	Ans := 0
	Answer := 0
	for j := n - 1; j >= 0; j-- {
		if (k / value[j]) >= 1 {
			Ans = k / value[j]
			k = k % value[j]
			Answer += Ans
		}
	}
	fmt.Println(Answer)
}

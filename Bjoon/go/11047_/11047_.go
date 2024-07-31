package main

import (
	"bufio"
	"fmt"
	"os"
)

var reader *bufio.Reader = bufio.NewReader(os.Stdin)
var writer *bufio.Writer = bufio.NewWriter(os.Stdout)

func main() {
	value := make([]int, 0) //동전의 가치를 저장하는 배열
	var n int               //동전의 종류수
	var k int               //총액
	var x int               //동전의 가치를 입력받을 변수
	// _, err :=
	fmt.Fscanln(reader, &n, &k) //첫줄 입력받기
	// if err != nil {
	// 	fmt.Println("입력오류:", err)
	// 	return
	// } else if (1 > n || n > 10) || (1 > k || k > 100000000) {
	// 	fmt.Println("허용범위 이외의 값입니다.(1 <= n <= 10, 1 <= k <= 100000000)\n 다시 입력해주세요")
	// }
	for i := 0; i < n; i++ { //동전 가치 배열에 저장
		fmt.Fscanln(reader, &x)
		value = append(value, x)
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

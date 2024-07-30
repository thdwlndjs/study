package main

import (
	"fmt"
	"math/rand"
)

func main() {
	s := make([]int, 5, 5)
	println(len(s), cap(s)) // len 5, cap 10
	//0 채워주기
	for j := 0; j < len(s); j++ {
		ran := rand.Intn(7) + 1
		s[j] = ran
	}
	// 하나 확장
	s = append(s, 2) // 0,0,0,0,0,2
	// 복수 요소들 확장
	s = append(s, 3, 4, 5) // 0,0,0,0,0,2,3,4,5

	fmt.Println(s, "{}")

	// 계속 한 요소씩 추가
	for i := 1; i <= 15; i++ {
		s = append(s, i)
		// 슬라이스 길이와 용량 확인
		fmt.Println(len(s), cap(s))
	}

	fmt.Println(s) // 1 부터 15 까지 숫자 출력
}

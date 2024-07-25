package main

import (
	"errors"
	"fmt"
)

// 특)복잡함
func main() {
	var a = [3]int{1, 2, 3}
	var index int
	fmt.Println("정수를 입력하세요")

	_, err := fmt.Scanf("%d", &index)
	//Scanf는 (값,error)형식으로 반환
	//거기서 두번째 error만 받기
	if err != nil { //error있으면
		fmt.Println("정수 입력이 필요합니다.")
		return
	}

	result, err := getElement(a, index)
	//값이랑 error를 전달받음
	if err != nil { //error있으면
		fmt.Println("에러:", err)
	} else { //없으면
		fmt.Println("결과는:", result)
	}
}

func getElement(a [3]int, index int) (int, error) { //값이랑 error를 전달받음
	if index-1 < 0 || index-1 >= len(a) {
		return 0, errors.New("배열 인덱스가 범위를 초과했습니다.") //에러에 저장
	}
	return a[index-1], nil
}

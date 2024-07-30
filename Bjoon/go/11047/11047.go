package main

import "fmt"

func main() {
	var n int
	var k int
	_, err := fmt.Scanf("%d %d ", &n, &k) //첫줄에 입력받기
	if err != nil {
		fmt.Println("입력오류:", err)
		return
	} else if (1 > n || n > 10) || (1 > k || k > 100000000) {
		fmt.Println("허용범위 이외의 값입니다.(1 <= n <= 10, 1 <= k <= 100000000)\n 다시 입력해주세요")
	} else {
		value := make([]int, n)
		value[0] = 1
		for i := 1; i < n; i++ {
			if i%2 == 0 {
				value[i] = value[i-1] * 2
			} else {
				value[i] = value[i-1] * 5
			}
		}
		for _, arr := range value {
			fmt.Println(arr)
		}
		Ans := 0
		Answer := 0
		//n은 동전수 k는 총액
		for j := n - 1; j >= 0; j-- { //인덱스 j는 n-1에서 0까지 내려감
			if (k / value[j]) >= 1 { //총액을 큰 값부터 나눠가며 1보다 같거나 크면,
				Ans = k / value[j] //몫을 저장하고
				k = k % value[j]   //나머지를 넘겨줌
				Answer += Ans      //저장

				// fmt.Println(value[j], " != ", value[j-1], " ", Answer, "+=", Ans)

			}
		}
		fmt.Println(Answer)
	}
}

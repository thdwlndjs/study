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
		for j := n - 1; j >= 0; j-- {
			if (k / value[j]) >= 1 {
				Ans = k / value[j]
				k = k % value[j]
				if value[j] != value[j-1] {
					Answer += Ans
				}
				// fmt.Println(value[j], " != ", value[j-1], " ", Answer, "+=", Ans)

			}
		}
		fmt.Println(Answer)
	}
}

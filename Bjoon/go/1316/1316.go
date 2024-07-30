package main

import (
	"bufio" //속도가 얘가 더 빠름..
	"fmt"
	"os"
)

var reader *bufio.Reader = bufio.NewReader(os.Stdin)
var writer *bufio.Writer = bufio.NewWriter(os.Stdout)

func main() {
	var n int
	fmt.Fscanln(reader, &n)
	var a string
	defer writer.Flush()
	count := n
	var i int
	var j int
	var k int

	for i = 0; i < n; i++ {
		s := make([]byte, 0)
		fmt.Fscanln(reader, &a)
		c := 0
		// s = append(s, a)
		cnt := 0

		for j = 1; j < len(a); j++ {
			if a[j-1] != a[j] { //문자가 바뀌면, 배열에 저장된 문자인지 확인
				for k = 0; k < len(s); k++ { //얘가 그냥 안됨 실행이
					//범위지정오류(len(a)-1해놓고 "<"사용
					//>>인덱스가 len(a)-2 까지만 반복됨 >> 인덱스 확인
					if a[j] == s[k] {
						c = 1
					}
				}
				if c == 1 { //맞으면 cnt=1로 변환해서 중복배열의 카운트를 -1
					cnt = 1
				} else { //아니면 배열에 변경전 문자를 저장
					check := a[j-1]
					s = append(s, check)
				}

			}
		}
		if cnt == 1 {
			count--
		}
	}
	fmt.Fprintln(writer, count)
}

// package main

// import (
// 	"bufio"
// 	"fmt"
// 	"os"
// )

// func Shape(writer *bufio.Writer, k int) {
// 	var blank string
// 	for i := 0; i < k; i++ {
// 		blank += "  "
// 	}
// 	blank_ := " "
// 	fmt.Fprintln(writer, blank, "  *  ")
// 	fmt.Fprintln(writer, blank, " * * ")
// 	fmt.Fprintln(writer, blank, "*****")
// 	for i := 0; i < k; i++ {
// 		fmt.Fprint(writer, "  *  ", blank_)
// 		fmt.Fprintln(writer, "  *  ")
// 		fmt.Fprint(writer, " * * ", blank_)
// 		fmt.Fprintln(writer, " * * ")
// 		fmt.Fprint(writer, "*****", blank_)
// 		fmt.Fprintln(writer, "*****")
// 	}

// }

//	func main() {
//		writer := bufio.NewWriter(os.Stdout)
//		reader := bufio.NewReader(os.Stdin)
//		var n, k int //n은 3*2^k
//		fmt.Fscanln(reader, &n)
//		defer writer.Flush()
//		k = 0
//		for (n/3)%2 == 0 {
//			n /= 2
//			k++
//		}
//		Shape(writer, k)
//	}
package main

import (
	"bufio"
	"fmt"
	"os"
)

func Shape(writer *bufio.Writer, n int) {
	var blank string
	var r []string
	var a []string
	for i := 0; i < n; i++ {
		blank += "  "
	}
	blank_ := " "
	r[1] = blank + "  *  "
	r[2] = blank + " * * "
	r[3] = blank + "*****"

	for n > 0 {
		n--
		k := n % 3
		a[k] = r[k] + a[k]
		for i := 0; i < k; i++ {

		}
		if n/3 > 1 {
			r[1] = a[1] + blank_ + a[1]
			r[2] = a[2] + blank_ + a[2]
			r[3] = a[3] + blank_ + a[3]
		}
		n /= 3
	}

}

func main() {
	writer := bufio.NewWriter(os.Stdout)
	reader := bufio.NewReader(os.Stdin)
	var n int //n은 3*2^k
	fmt.Fscanln(reader, &n)
	defer writer.Flush()
	Shape(writer, n)
}

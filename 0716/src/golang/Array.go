package golang

import (
	"fmt"
	"math"
)

type Student struct {
	Name  string
	Score [5]int
	avg   int
	total float64
	_avg  float64
}

func (a *Student) ArraySort(arr []int) {
	for i := len(arr) - 1; i > 0; i-- {
		for j := 0; j < i; j++ {
			if arr[j] > arr[j+1] {
				arr[j], arr[j+1] = arr[j+1], arr[j]
			}
		}
	}
}
func (a *Student) ArrayTotal(arr []int) int {
	total := 0
	for _, num := range arr {
		total += num
	}
	return total
}
func (a *Student) Average(length int, total float64) int {
	var avg int
	avg = int(total) / length
	return avg
}
func (a *Student) round(_avg float64) float64 {
	result := math.Round(_avg)
	return result
}
func main() {
	var p = Student{}
	fmt.Println(p)

	var score1 [5]int = [5]int{77, 87, 90, 88, 72}
	var score2 [5]int = [5]int{81, 67, 91, 77, 83}
	p.Score = score1
	p.Name = "루피"
	p.ArraySort(p.Score[:])
	fmt.Println(p.Name, ": ", p.Score[:])
	fmt.Println("총점: ", p.ArrayTotal(p.Score[:]))
	fmt.Println("평균: ", p.Average(len(p.Score), p.total))
	p.Score = score2
	p.Name = "나미"
	p.ArraySort(p.Score[:])
	fmt.Println(p.Name, ": ", p.Score[:])
	fmt.Println("총점: ", p.ArrayTotal(p.Score[:]))
	fmt.Println("평균: ", p.Average(len(p.Score), p.total))
}

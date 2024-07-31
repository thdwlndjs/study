package main

import (
	"bufio"
	"container/heap"
	"fmt"
	"os"
	"sort"
)

var reader *bufio.Reader = bufio.NewReader(os.Stdin)
var writer *bufio.Writer = bufio.NewWriter(os.Stdout)

type Heap interface {
	sort.Interface
	Push(x interface{})
	Pop() interface{}
}
type Sort interface {
	Len() int
	Less(i, j int) bool
	Swap(i, j int)
}
type IntHeap struct {
	ints []int
}

func (h *IntHeap) Less(i, j int) bool {
	return h.ints[i] > h.ints[j] //최대힙
}

func (h *IntHeap) Swap(i, j int) {
	h.ints[i], h.ints[j] = h.ints[j], h.ints[i]
}

func (h *IntHeap) Len() int {
	return len(h.ints)
}

func (h *IntHeap) Pop() interface{} {
	x := h.ints[h.Len()-1]
	h.ints = h.ints[:h.Len()-1]
	return x
}

func (h *IntHeap) Push(x interface{}) {
	h.ints = append(h.ints, x.(int))
}

/*
	func main() {
	    for ints.Len() > 0 {
	        fmt.Printf("%v ", heap.Pop(ints))
	    }
*/
func main() {
	h := &IntHeap{}
	defer writer.Flush()
	var n, x int
	fmt.Fscanln(reader, &n) //x를 몇개 받을지 n으로 받아서 n번 x 입력받음
	for i := 0; i < n; i++ {
		fmt.Fscanln(reader, &x)
		if x == 0 { //0이면 삭제(출력)
			if h.Len() == 0 {
				fmt.Fprintln(writer, "0")
			} else {
				fmt.Fprintln(writer, heap.Pop(h))
			}
		} else { //아니면 삽입
			heap.Push(h, x)
		}
	}
}

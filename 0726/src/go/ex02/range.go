package main

import "fmt"

func main() {
	for i, r := range "→👍👎🌮🗂HelloWorld!안녕세상아!😊🚀🔥📝." {
		fmt.Print(i, " ")
		fmt.Print(string(r))
	}

	for i, r := range "string, just string" {
		fmt.Print(i, " ")
		fmt.Print(string(r))
	}
}

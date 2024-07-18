package main

import "fmt"

type Person struct {
	name string
	age  int
}

type Customer struct {
	*Person
	memberID int
}

func (c Customer) enter() {
	fmt.Println("회원번호: ", c.memberID, " ", c.name+" , ", c.age, "세 입장")
}

func NewPerson(name string, age int) *Person {
	return &Person{name: name, age: age}
}

func NewCustomer(name string, age, memberID int) *Customer {
	return &Customer{
		Person:   NewPerson(name, age), // Person 객체 생성하여 Embedding
		memberID: memberID,
	}
}

func main() {
	c := NewCustomer("박자바", 25, 1111)
	c.enter()
	d := NewCustomer("송코딩", 20, 2222)
	d.enter()
}

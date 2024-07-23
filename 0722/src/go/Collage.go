package main

import "fmt"

type Student struct {
	name    string
	grade   int
	teacher string
}
type Collage struct {
	name    string
	grade   int
	teacher string
	course  int
}
type Mid struct {
	name    string
	grade   int
	teacher string
}

type infor interface {
	getName() string
	getTeacher() string
	getgrade() int
}

func (m Mid) getName() string {
	return m.name
}
func (m Mid) getgrade() int {
	return m.grade
}

func (c Collage) getName() string {
	return c.name
}
func (c Collage) getgrade() int {
	return c.grade
}

func (m Mid) getTeacher() string {
	return "담임선생님: 손흥민"
}
func (c Collage) getTeacher() string {
	return "지도 교수님: " + c.getTeacher() + "담임선생님: 손흥민"
}

var mainA *Mid = &Mid{"홍길동", 2, "차범근"}
var mainB *Collage = &Collage{"홍길동", 2, "차범근", 22}

func (s Student) getStudInfo(info infor) {
	fmt.Println("Student 클래스의 getStdInfo() 호출")
	fmt.Println("이름: ", info.getName(), " 학년: ", info.getgrade())
}
func (s Student) getTeacher(info infor) {
	fmt.Println(info.getTeacher())
}

package main

import "fmt"

type Student interface {
	getName() string
	getGrade() int
	getStudInfo()
	getTeacherInfo() string
}
type Collage struct {
	name    string
	grade   int
	teacher string
	course  int
	infor
}
type Mid struct {
	name    string
	grade   int
	teacher string
	infor
}

type infor interface {
	getName() string
	getTeacher() string
	getgrade() int
	getStudInfo(info infor)
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
	return "지도 교수님: " + c.teacher + "담임선생님: 손흥민"
}

func getStudInfo(info infor) {
	fmt.Println("Student 클래스의 getStdInfo() 호출")
	fmt.Println("이름: ", info.getName(), " 학년: ", info.getgrade())
}
func getTeacher(info infor) {
	fmt.Println(info.getTeacher())
}

func main() {
	var c Collage = Collage{name: "홍길동", grade: 2, teacher: "차범근", course: 22}
	c.getStudInfo(c)

}

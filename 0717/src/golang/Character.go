package main

import "fmt"

func main() {
	m := new(mage)
	m.HP = 100
	w := new(warrior)
	w.HP = 120

	w.attack(m)
	m.attack(w)
	w.defend()
	m.defend()
}

type Character interface {
	attack(target Character)
	defend()
	getHealth() int
	takeDamage(damage int)
}

type mage struct {
	HP int
	Character
}
type warrior struct {
	HP int
	Character
}

func (m mage) attack(target Character) {
	fmt.Println("마법사가 파이어볼을 던짐")
	target.takeDamage(20)
}
func (m mage) defend() {
	fmt.Println("마법사가 보호 버프 사용")

}
func (m mage) getHealth() int {
	return m.HP
}
func (m mage) takeDamage(damage int) {
	m.HP -= damage
	fmt.Println("마법사가 ", damage, "피해를 받았습니다, 남은체력: ", m.getHealth())
}
func (w warrior) attack(target Character) {
	fmt.Println("전사가 검으로 공격함")
	target.takeDamage(15)
}
func (w warrior) defend() {
	fmt.Println("전사가 방패로 방어")
}
func (w warrior) getHealth() int {
	return w.HP
}
func (w warrior) takeDamage(damage int) {
	w.HP -= damage
	fmt.Println("전사가 ", damage, "피해를 받았습니다, 남은체력: ", w.getHealth())
}

// func NewCharacter(initialHealth int) *Character {
// 	return &Character{
// 		health: initialHealth,
// 	}
// } //생성자함수

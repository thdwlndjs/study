package golang

import "fmt"

func main() {
	var warrior = Character
	var mage = Character

	warrior.attack(mage)
	mage.attack(warrior)
	warrior.defend()
	mage.defend()
}

type mage interface {
	attack()
	defend()
	getHealth() int
	takeDamage(damage int)
}

type warrior interface {
	attack()
	defend()
	getHealth() int
	takeDamage(damage int)
}

type Character struct {
	health int
} //구조체는 초기화 선언이 불가

func NewCharacter(initialHealth int) *Character {
	return &Character{
		health: initialHealth,
	}
} //생성자함수

func (m *Character) attack(target Character) {
	fmt.Println("마법사가 파이어볼을 던짐")
	takeDamage(mage, 20)
}
func (m *Character) defend() {
	fmt.println("마법사가 보호 버프 사용")
}
func (m *Character) getHealth() {
	return m.health
}
func (m *Character) takeDamage(target Character, damage int) {
	target.health -= damage
	fmt.Println("마법사가" + damage + "피해를 받았습니다, 남은체력: " + getHealth())
}
func (w *Character) attack(target Character) {
	fmt.Println("전사가 검으로 공격함")
	takeDamage(warrior, 15)
}
func (w Character) defend() {

}
func (w Character) getHealth() string {
	return w.health
}
func (w Character) takeDamage(damage int) {
	w.attack()
}

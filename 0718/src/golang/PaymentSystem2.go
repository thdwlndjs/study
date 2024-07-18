package main

import (
	"fmt"
	"time"
)

type Payment2 struct {
	paymentDate   string
	paymentMethod string
	paymentAmount int
}

type CreditCard2 struct {
	Payment2
}

type Kakaopay2 struct {
	Payment2
}

type Naverpay2 struct {
	Payment2
}

func Payment(paymentMethod string) *Payment2 {
	return &Payment2{paymentMethod: paymentMethod}
}

/**
* 영수증 출력
 */
func (p *Payment2) printReceipt() {
	fmt.Printf("\n[%s] %s - %,d원\n", p.paymentDate, p.paymentMethod, p.paymentAmount)
} /**
* 결제 정보 업데이트 (결제 금액과 결제 시간을 갱신)
*
* @param paymentAmount 결제 금액
 */
func (p *Payment2) updatePaymentInfo(paymentAmount int) {
	p.paymentAmount = paymentAmount
	p.paymentDate = time.Now().Format(time.RFC3339)
} /**
* 결제 진행 (추상 메서드로 자식 클래스에서 구현해야 합니다.)
* @param paymentAmount 결제 금액
 */
func (c *CreditCard2) pay(paymentAmount int) {
	fmt.Printf("신용카드로 %,d원을 결제합니다.\n", paymentAmount)
	c.updatePaymentInfo(paymentAmount)
}
func (k *Kakaopay2) pay(paymentAmount int) {
	fmt.Printf("카카오페이로 %,d원을 결제합니다.\n", paymentAmount)
	k.updatePaymentInfo(paymentAmount)
}
func (n *Naverpay2) pay(paymentAmount int) {
	fmt.Printf("네이버페이로 %,d원을 결제합니다.\n", paymentAmount)
	n.updatePaymentInfo(paymentAmount)
}

func main() {
	// c := new(Customer)
	// c.name = "박자바"
	// c.age = 25
	// c.memberID = 1111
	// c.enter()
	// d := new(Customer)
	// d.name = "송코딩"
	// d.age = 20
	// d.memberID = 2222
	// d.enter()

}

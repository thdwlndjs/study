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
} //생성자

/**
* 영수증 출력
 */
func (p *Payment2) printReceipt() {
	fmt.Printf("\n[%s] %s - %d원\n", p.paymentDate, p.paymentMethod, p.paymentAmount)
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
	fmt.Printf("신용카드로 %d원을 결제합니다.\n", paymentAmount)
	c.updatePaymentInfo(paymentAmount)
}
func (k *Kakaopay2) pay(paymentAmount int) {
	fmt.Printf("카카오페이로 %d원을 결제합니다.\n", paymentAmount)
	k.updatePaymentInfo(paymentAmount)
}
func (n *Naverpay2) pay(paymentAmount int) {
	fmt.Printf("네이버페이로 %d원을 결제합니다.\n", paymentAmount)
	n.updatePaymentInfo(paymentAmount)
}

type InputViewImpl struct{}

func (i *InputViewImpl) inputPaymentAmount() int {
	fmt.Println("결제 금액을 입력하세요. (결제 금액은 100원 이상이어야 하고, 100원 단위로 입력해야 합니다. [e.g. 1,100원은 가능하지만 1,010원은 불가능])")
	for {
		fmt.Println("결제 금액: ")
		var input int
		fmt.Scanln(&input)
		if input < 100 || input%100 != 0 {
			fmt.Println("[ERROR] 잘못된 값입니다! 다시 입력해주세요.")
			continue
		}
		fmt.Printf("결제 금액 %d원을 입력했습니다.\n\n", input)
		return input
	}
}

func (i *InputViewImpl) inputPaymentMethod() int {
	var paymentMethods = [...]string{"신용카드", "카카오페이", "네이버페이"}
	for {
		fmt.Println("결제 방식을 선택하세요.")
		for i := 0; i < len(paymentMethods); i++ {
			fmt.Printf("%d-%s   ", i+1, paymentMethods[i])
		}
		fmt.Println("\n결제 방식: ")
		var input int
		fmt.Scanln(&input)
		if input < 1 || input > len(paymentMethods)+1 {
			fmt.Println("[ERROR] 잘못된 값입니다! 다시 선택해주세요.")
			continue
		}
		return input
	}
}

func main() {
	i := new(InputViewImpl)
	paymentAmount := i.inputPaymentAmount() // 결제 금액
	paymentMethod := i.inputPaymentMethod() // 결제 방식 (1-신용카드, 2-카카오페이, 3-네이버페이)

	// TODO LEVEL1과 동일한 기능을 하도록 코드를 작성해 봅시다!
	// 추상 클래스를 도입했으니 코드 중복을 줄이고 조금은 더 유연한 구조로 작성할 수 있겠죠 ㅎㅎ
	if paymentMethod == 1 {
		c := new(CreditCard2)
		c.pay(paymentAmount)
		c.printReceipt()
	} else if paymentMethod == 2 {
		k := new(Kakaopay2)
		k.pay(paymentAmount)
		k.printReceipt()
	} else if paymentMethod == 3 {
		n := new(Naverpay2)
		n.pay(paymentAmount)
		n.printReceipt()
	}

}

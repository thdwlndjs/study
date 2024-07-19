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
}//생성자

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


type InputView struct {
	inputPaymentAmount()
	inputPaymentMethod()
}

func inputPaymentAmount() int{
	fmt.Println("결제 금액을 입력하세요. (결제 금액은 100원 이상이어야 하고, 100원 단위로 입력해야 합니다. [e.g. 1,100원은 가능하지만 1,010원은 불가능])")
	for {
		fmt.Println("결제 금액: ")
		var input := scanner.nextInt()
		if (input < 100 || input % 100 != 0) {
			fmt.println("[ERROR] 잘못된 값입니다! 다시 입력해주세요.");
			continue;
		}
		fmt.printf("결제 금액 %,d원을 입력했습니다.\n\n", input);
            return input;
	}
}

func inputPaymentAmount() int{
	for{
		fmt.Println("결제 방식을 선택하세요.")
		for (int i = 0; i < paymentMethods.length; i++) {
			fmt.println("%d-%s   ", i + 1, paymentMethods[i]);
		}
			fmt.Println("\n결제 방식: ")
			var input := scanner.nextInt()
			if (input < 1 || input > paymentMethods.length + 1) {
				fmt.println("[ERROR] 잘못된 값입니다! 다시 선택해주세요.")
				continue
			}
				return input;
	}
}

func main() {
	

}

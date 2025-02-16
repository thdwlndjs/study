package problem3.level1;

import problem3.view.InputView;

/**
 * 결제 시스템
 */
public class PaymentSystem1 {

    public static void main(String[] args) {
        int paymentAmount = InputView.inputPaymentAmount(); // 결제 금액
        int paymentMethod = InputView.inputPaymentMethod(); // 결제 방식 (1-신용카드, 2-카카오페이, 3-네이버페이)

        CreditCard1 c = new CreditCard1();
        KakaoPay1 k = new KakaoPay1();
        NaverPay1 n = new NaverPay1();
        if (paymentMethod == 1) {
            c.pay(paymentAmount);
            c.printReceipt();
        } else if (paymentMethod == 2) {
            k.pay(paymentAmount);
            k.printReceipt();
        } else if (paymentMethod == 3) {
            n.pay(paymentAmount);
            k.printReceipt();
        }
    }

}

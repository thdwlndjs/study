package problem3.level3;

import problem3.view.InputView;

/**
 * 결제 시스템
 */
public class PaymentSystem3 {

    public static void main(String[] args) {
        int paymentAmount = InputView.inputPaymentAmount(); // 결제 금액
        int paymentMethod = InputView.inputPaymentMethod(); // 결제 방식 (1-신용카드, 2-카카오페이, 3-네이버페이)

        // LEVEL2와 코드가 비슷하겠지만 특정 결제 방식에는 할인이 적용되어야 하겠죠?
        // 나중에 새로운 결제 방식이 추가될 수 있으며, 할인 적용 여부도 변경될 수 있음을 주의하세요!
        // 힌트는 instanceof 키워드를 사용하는 것입니당 (이것도 분명 수업 시간에 배운 내용입니다 ㅎㅎ)

        /*
         * 만약 다형성을 활용하지 않으면 코드가 얼마나 길고 지저분해질까요?
         * 객체지향 다형성의 장점을 인지하고 잘 활용한다면 좋은 코드를 작성할 수 있습니다!
         */
        Payment3 p = null;
        if (paymentMethod == 1) {
            p = new CreditCard3();
        } else if (paymentMethod == 2) {
            p = new KakaoPay3();
        } else if (paymentMethod == 3) {
            p = new NaverPay3();
        } // 이거 그건데

        if (p instanceof KakaoPay3) {
            KakaoPay3 k = new KakaoPay3();
            k.discount(paymentAmount);
        }

        if (p instanceof NaverPay3) {
            p.printReceipt();
            p.pay(paymentAmount);

        }

    }
}
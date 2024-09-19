package chapter08.interface_exam;

public class CreditCard implements Payment {
    private String cardNo;

    public CreditCard(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("신용카드로 결재- 카드번호 : " +cardNo + " / 결재 금액 : " + amount);
    }
}

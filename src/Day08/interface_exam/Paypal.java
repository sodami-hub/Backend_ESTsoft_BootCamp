package Day08.interface_exam;

public class Paypal implements Payment{

    private String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("paypal로 결재- email : " + email + " / 결재 금액 : " + amount);
    }
}

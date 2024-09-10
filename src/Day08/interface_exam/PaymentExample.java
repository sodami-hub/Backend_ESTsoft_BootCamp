package Day08.interface_exam;

public class PaymentExample {
    public static void main(String[] args) {
        CreditCard cc = new CreditCard("123-1234");
        cc.processPayment(10000);

        Paypal pp = new Paypal("hi@net");
        pp.processPayment(30000);


    }
}

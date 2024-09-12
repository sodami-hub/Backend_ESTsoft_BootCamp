package Day09.custom;

public class BankTransaction {

    public static void main(String[] args) {
        Account a = new Account(1000000);
        Account b = new Account(1500000);

        System.out.println("a 잔액 : " + a.balance);
        System.out.println("b 잔액 : " + b.balance);

        try {
            a.sendMoney(60000, b);
        } catch(BalanceInsufficientException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("a 잔액 : " + a.balance);
        System.out.println("b 잔액 : " + b.balance);

    }
}

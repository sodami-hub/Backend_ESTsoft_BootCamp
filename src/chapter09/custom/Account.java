package chapter09.custom;

public class Account {
    long balance;

    Account(long balance) {
        this.balance =balance;
    }


    void deposit(long money) {
        balance+=money;
    }

    void withdraw(long money) throws BalanceInsufficientException {
        if(balance<money) {
            throw new BalanceInsufficientException("잔액이 부족합니다. 출금 가능 금액 : " + balance);
        } else {
            balance -= money;
        }
    }

    void sendMoney(long money, Account other) throws BalanceInsufficientException{
        if(balance<money) {
            throw new BalanceInsufficientException("잔액이 부족합니다. 출금 가능 금액 : " + balance);
        } else {
            System.out.println(money + "원을 송금합니다.");
            balance -= money;
            other.balance += money;
        }
    }
}

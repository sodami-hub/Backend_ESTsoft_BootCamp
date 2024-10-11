package com.example.springjpawalletaccountproject.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

@Table(name ="wallet")
@Entity(name="CustomerWallet")
@DiscriminatorValue("CUSTOMER")
@NoArgsConstructor
@Getter
@Setter
public class CustomerWallet extends Wallet{
    // select * from wallet; -> 이렇게 사용하지 않겠다.
    // select * from wallet where type = 'CUSTOMER' and user_id = "___";
    // -> 이렇게 사용하겠다는 전제를 가지는 구조이다.

    public CustomerWallet(String userId) {
        super(userId);
    }

    @Transient
    private Account cashback, prepaid, emoney;  // CustomerWallet 은 세가지 유형의 계좌를 갖는다.

    public Account cashback() {
        if(cashback != null) {
            return cashback;
        }
        this.cashback = findAccountByType(AccountType.CASHBACK).orElseThrow(
                ()->new RuntimeException("CASHBACK not found")
        );
        return this.cashback;
    }
    public Account prepaid() {
        if(prepaid != null) {
            return prepaid;
        }
        this.prepaid = findAccountByType(AccountType.PREPAID).orElseThrow(
                ()->new RuntimeException("PREPAID not found")
        );
        return this.prepaid;
    }
    public Account emoney() {
        if(emoney != null) {
            return emoney;
        }
        this.emoney = findAccountByType(AccountType.EMONEY).orElseThrow(
                ()->new RuntimeException("EMONEY not found")
        );
        return this.emoney;
    }

    public Optional<Account> findAccountByType(AccountType type) {
        return accounts.stream().filter(a->a.getType() == type).findFirst();
    }

    @Override
    public long getTotalBalance() {
        Long sum = cashback().getBalance().getAmounts()
                + emoney().getBalance().getAmounts()
                + prepaid().getBalance().getAmounts();

        return sum;
    }

    public Account charageableAccount(AccountType accountType) {
        if (accountType == AccountType.CASHBACK) {
            return cashback();
        } else if (accountType == AccountType.PREPAID) {
            return prepaid();
        } else if (accountType == AccountType.EMONEY) {
            return emoney();
        } else {
            throw new RuntimeException("Invalid account type: " + accountType);
        }
    }


}

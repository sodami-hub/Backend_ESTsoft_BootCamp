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
@Entity(name="MerchatWallet")
@DiscriminatorValue("MERCHANT")
@NoArgsConstructor
@Getter
@Setter
public class MerchantWallet extends Wallet{
    // 같은 테이블을 사용하지만.. wallet의 타입별로 서로다른 서비스를 한다.

    public MerchantWallet(String userId) {
        super(userId);
    }

    @Transient
    private Account emoney;

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
        return emoney().getBalance().getAmounts();
    }
}

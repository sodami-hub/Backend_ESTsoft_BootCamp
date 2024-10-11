package com.example.springjpawalletaccountproject.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Embeddable // 내재화된 값을 정의하는 어노테이션
@Getter
@Setter
public class Money {
    @Enumerated(EnumType.STRING)
    private Currency currency;
    private Long amounts;

    public Money() {}

    public Money(Long amounts) {
        this.currency = Currency.WON;   //일단 원화로만 사용
        this.amounts = amounts;         //account를 생성할 때는 기본 금액을 넣어야 됨.
    }

    public Money(Currency currency, long l) {
        this.currency=currency;
        this.amounts=l;
    }

    public Money add(Money money) {
        if (!money.currency.equals(this.currency))
            throw new RuntimeException("not the same currency");
        return new Money(currency, amounts + money.getAmounts());
    }
}

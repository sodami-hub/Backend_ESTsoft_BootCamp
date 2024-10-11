package com.example.springjpawalletaccountproject.entity;

import com.example.springjpawalletaccountproject.model.AccountDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private AccountType type;

    @Column(name = "visible")
    private boolean visible = false;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "wallet_id")
    private Wallet wallet;

    @Embedded
    private Money balance;  // 계좌의 잔액(화폐 정보와 금액정보)

    @Version
    private int version;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(columnDefinition = "TEXT") // Json 형식의 데이타 -> 실행하면 에러 스키마에는 Json이다. 컨버터해야됨
    @Convert(converter = WalletMapConverter.class)
    private Map<String, Object> metadata = new HashMap<>();


    public Account(Wallet wallet, AccountType type, boolean visible) {
        this.wallet = wallet;
        this.type = type;
        this.balance = new Money(0L);
        this.visible = visible;
    }

    public AccountDTO convertToDTO() {
        return new AccountDTO(id, visible, balance.getCurrency().name(), balance.getAmounts(), type.name());
    }

    public Money balance() {
        return this.balance;
    }

    public void credit(Money amount) {
        this.balance = this.balance.add(amount);
    }

}

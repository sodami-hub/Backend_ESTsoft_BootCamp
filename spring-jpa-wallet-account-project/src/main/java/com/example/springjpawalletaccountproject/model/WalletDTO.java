package com.example.springjpawalletaccountproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collection;

@Getter
@AllArgsConstructor
public class WalletDTO {
    private Long id;
    private String walletOwnerId;
    private String walletType;
    private Long balance;
    private Collection<AccountDTO> accounts;
}

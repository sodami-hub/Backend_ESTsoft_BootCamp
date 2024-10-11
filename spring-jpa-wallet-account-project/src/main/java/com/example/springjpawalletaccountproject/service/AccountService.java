package com.example.springjpawalletaccountproject.service;

import com.example.springjpawalletaccountproject.entity.*;
import com.example.springjpawalletaccountproject.repository.CustomerWalletRepository;
import com.example.springjpawalletaccountproject.repository.TransactionRepository;
import com.fasterxml.uuid.Generators;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;

@Service
public class AccountService {
    @Autowired
    private CustomerWalletRepository customerWalletRepository;
    @Autowired
    private TransactionRepository transactionRepository;

    @Transactional
    public void credit(String userId, AccountType accountType, Money amount) {
        if (amount.getAmounts() <= 0) {
            throw new RuntimeException("credit amount must be greater than 0");
        }

        CustomerWallet customerWallet = customerWalletRepository.findByUserId(userId);
        Account account = customerWallet.charageableAccount(accountType);
        account.credit(amount);

        CentralWallet centralWallet = new CentralWallet();//centralWalletRepository.findByIdAndUserId(1L, "0").get();

        // uid생성하는걸 fasterxml.uuid lib사용함. 아래 코드 build.gradle에 추가.
        //    implementation 'com.fasterxml.uuid:java-uuid-generator:5.1.0'
        Long pid = Generators.timeBasedGenerator().generate().timestamp();
        // central wallet account
        Transaction tx = new Transaction(pid,
                centralWallet.getId(),
                Currency.WON, amount.getAmounts(),
                centralWallet.getUserId(),
                centralWallet.getAmounts(),
                AccountType.SOURCE,
                account.getId(),
                Currency.WON,
                amount.getAmounts(),
                customerWallet.getUserId(),
                account.balance().getAmounts(),
                accountType,
                new HashMap());

        transactionRepository.save(tx);
    }
}

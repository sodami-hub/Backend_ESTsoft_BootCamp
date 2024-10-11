package com.example.springjpawalletaccountproject.service;

import com.example.springjpawalletaccountproject.entity.Account;
import com.example.springjpawalletaccountproject.entity.AccountType;
import com.example.springjpawalletaccountproject.entity.CustomerWallet;
import com.example.springjpawalletaccountproject.entity.MerchantWallet;
import org.springframework.stereotype.Service;

@Service
public class WalletFactoryService {
    // Wallet을 만들어주는 공장역할을 하는 클래스

    public CustomerWallet createCustomerWallet(String userId) {
        CustomerWallet customerWallet = new CustomerWallet(userId);
        customerWallet.createAccount(new Account(customerWallet, AccountType.CASHBACK, true));
        customerWallet.createAccount(new Account(customerWallet, AccountType.PREPAID, true));
        customerWallet.createAccount(new Account(customerWallet, AccountType.EMONEY, true));
        return customerWallet;
    }

    public MerchantWallet createMerchantWallet(String userId) {
        MerchantWallet merchantWallet = new MerchantWallet(userId);
        merchantWallet.createAccount(new Account(merchantWallet, AccountType.EMONEY,true));
        return merchantWallet;
    }
}

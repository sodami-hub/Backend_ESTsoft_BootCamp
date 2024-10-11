package com.example.springjpawalletaccountproject.service;

import com.example.springjpawalletaccountproject.entity.CustomerWallet;
import com.example.springjpawalletaccountproject.entity.MerchantWallet;
import com.example.springjpawalletaccountproject.entity.Wallet;
import com.example.springjpawalletaccountproject.model.WalletDTO;
import com.example.springjpawalletaccountproject.repository.WalletRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletService {
    @Autowired
    private WalletFactoryService walletFactoryService;
    @Autowired
    private WalletRepository walletRepository;

    public WalletDTO saveWallet(String userId, String type) {
        Wallet wallet = null;
        if(type.equals("CUSTOMER")) {
            wallet = this.createCustomerWallet(userId);
        } else if(type.equals("MERCHANT")) {
            wallet = this.createMerchantWallet(userId);
        } else {
            throw new RuntimeException("NOT SUPPORT WALLET TYPE : " + type);
        }

        return wallet.convertToDTO();
    }


    @Transactional
    public Wallet createCustomerWallet(String userId) {
        CustomerWallet wallet = walletFactoryService.createCustomerWallet(userId);

        Wallet result = walletRepository.save(wallet);

        return result;
    }

    @Transactional
    public Wallet createMerchantWallet(String userId) {
        MerchantWallet wallet = walletFactoryService.createMerchantWallet(userId);

        Wallet result = walletRepository.save(wallet);

        return result;
    }
}

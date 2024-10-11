package com.example.springjpawalletaccountproject.controller;

import com.example.springjpawalletaccountproject.entity.AccountType;
import com.example.springjpawalletaccountproject.entity.Money;
import com.example.springjpawalletaccountproject.model.WalletDTO;
import com.example.springjpawalletaccountproject.service.AccountService;
import com.example.springjpawalletaccountproject.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {
    @Autowired
    private WalletService walletService;
    @Autowired
    private AccountService accountService;

    @PostMapping("/api/wallet/customer/{userId}")
    public ResponseEntity<WalletDTO> createCustomerWallet(@PathVariable String userId) {
        WalletDTO result =walletService.saveWallet(userId, "CUSTOMER");
        return ResponseEntity.ok(result);
    }
    @PostMapping("/api/wallet/merchant/{userId}")
    public ResponseEntity<WalletDTO> createMerchantWallet(@PathVariable String userId) {
        WalletDTO result = walletService.saveWallet(userId, "MERCHANT");
        return ResponseEntity.ok(result);
    }

    @PostMapping("/api/wallet/{accountType}/credit/{userId}")
    public ResponseEntity<String> creditCustomerWallet(
            @PathVariable(name = "accountType") AccountType accountType,
            @PathVariable(name = "userId") String userId,
            @RequestParam(name = "amount") Long amount) {

        accountService.credit(userId, accountType, new Money(amount));

        return ResponseEntity.ok("Success");
    }
}

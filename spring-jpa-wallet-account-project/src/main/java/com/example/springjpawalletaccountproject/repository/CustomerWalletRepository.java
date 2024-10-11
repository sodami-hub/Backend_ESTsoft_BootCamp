package com.example.springjpawalletaccountproject.repository;

import com.example.springjpawalletaccountproject.entity.CustomerWallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerWalletRepository extends JpaRepository<CustomerWallet, Long> {
    CustomerWallet findByUserId(String userId);
}

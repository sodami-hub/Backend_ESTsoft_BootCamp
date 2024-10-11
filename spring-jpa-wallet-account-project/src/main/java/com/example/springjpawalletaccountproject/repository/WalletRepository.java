package com.example.springjpawalletaccountproject.repository;

import com.example.springjpawalletaccountproject.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<Wallet,Long> {
}

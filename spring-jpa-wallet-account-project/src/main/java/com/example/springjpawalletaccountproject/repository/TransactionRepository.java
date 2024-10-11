package com.example.springjpawalletaccountproject.repository;

import com.example.springjpawalletaccountproject.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
}

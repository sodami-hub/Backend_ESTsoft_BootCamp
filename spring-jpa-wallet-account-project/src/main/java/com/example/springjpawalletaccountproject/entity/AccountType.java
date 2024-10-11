package com.example.springjpawalletaccountproject.entity;

import jakarta.persistence.Enumerated;

public enum AccountType {
    SOURCE,
    CASHBACK,
    PREPAID,
    EMONEY;
}

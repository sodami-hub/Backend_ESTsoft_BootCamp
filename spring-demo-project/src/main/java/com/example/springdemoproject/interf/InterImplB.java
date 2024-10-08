package com.example.springdemoproject.interf;

import org.springframework.stereotype.Service;

@Service
public class InterImplB implements Inter{
    @Override
    public void interMethod() {
        System.out.println("Run InterImplB Method");
    }
}

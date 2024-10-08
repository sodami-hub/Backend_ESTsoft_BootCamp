package com.example.springdemoproject.interf;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
@Service
public class InterImplA implements Inter{
    @Override
    public void interMethod() {
        System.out.println("Run InterImplA Method");
    }
}

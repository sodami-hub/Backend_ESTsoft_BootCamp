package com.example.springdemoproject.lombok;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LombokTest {
    @Test
    public void test() {
        People people = new People(123L,"sodam",6, Arrays.asList("cry","scared"));
        System.out.println(people);
    }
}

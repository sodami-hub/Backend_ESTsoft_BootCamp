package com.example.springdemoproject.lombok;

import lombok.*;

import java.util.List;

// @RequiredArgsConstructor // 반드시 필요한 요소(final 필드)만 생성자의 매개변수로 생성
@AllArgsConstructor // 모든 필드에 대한 생성자.
@NoArgsConstructor  // 기본 생성자
@Getter
@Setter // 모든 필드의 Getter와 Setter를 자동으로 생성
public class People {
    private Long id;
    private String name;
    private int age;
    private List<String> hobbies;


    /* @AllArgsConstructor
    public People(Long id, String name, int age, List<String> hobbies) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }
    */
}

package com.example.springjpaproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private Integer age;
    @Column(name="desc")
    private String desc;
    @Column(name="create_at", updatable = false, nullable = false)
    @CreatedDate // 스프링이 자동으로 날짜를 생성해서 넣어준다.
    private LocalDateTime createAt;

    /*  @CreatedDate 와 같은 기능
    @PrePersist
    public void prePersist() {
        this.createAt = LocalDateTime.now();
    }
    */

    @Transient  // entity에 속한 필드가 아님(DB 컬럼에는 없음)
                // 하지만 이 entity class에서는 개발자가 사용할 필드이다.
    private String nickName;

    public String getNickName() {
        return this.name+"_("+this.age+")";
    }

}

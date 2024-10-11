package com.example.springjpawalletaccountproject.entity;

import jakarta.persistence.*;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

// 반복되는 컬럼들을 하나의 클래스로 생성
@MappedSuperclass
public class WalletEntityObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Version
    private int version;

    @UpdateTimestamp
    @Column(name="updated_at")
    private Date updatedAt;

    @Column(columnDefinition = "TEXT") // Json 형식의 데이타 -> 실행하면 에러 스키마에는 Json이다. 컨버터해야됨
    @Convert(converter = WalletMapConverter.class)
    @Setter
    private Map<String,Object> metadata = new HashMap<>();
}

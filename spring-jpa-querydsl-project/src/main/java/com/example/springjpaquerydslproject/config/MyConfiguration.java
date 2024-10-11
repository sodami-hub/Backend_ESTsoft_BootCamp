package com.example.springjpaquerydslproject.config;

import com.querydsl.jpa.JPQLTemplates;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MyConfiguration {
    @PersistenceContext
    private EntityManager entityManager;
    // querydsl이 내부적으로(db랑 통신하는 단계) entitymanager를 활용하는데
    // entity -> query로 만들기 위한 단계에서는 entity를 wrapping한 Q___, JPAQUERYFACTORY
    @Bean
    public JPAQueryFactory jpaQueryFactory() {
        return new JPAQueryFactory(JPQLTemplates.DEFAULT, entityManager);
    }

}

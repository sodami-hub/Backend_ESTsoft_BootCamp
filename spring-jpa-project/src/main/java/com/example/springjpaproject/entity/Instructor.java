package com.example.springjpaproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="instructor")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column(name = "`left`")
    @ColumnDefault("false")
    private boolean left;

    @Column(name="`desc`")
    private String desc;

    @Column(name="`created_at`", updatable = false, nullable = false)
    private LocalDateTime createAt;

    @PrePersist
    public void prePersist() {
        this.createAt = LocalDateTime.now();
    }
}

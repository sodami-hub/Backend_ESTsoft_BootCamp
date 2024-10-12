package com.example.springjpaproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="lecture_course")
public class LectureCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column(name="instructor_id")
    private Long instructorId;

    @Column
    private Integer capacity;

    @Column(name="`from`")
    private LocalDate from;

    @Column(name="`to`")
    private LocalDate to;

    @Column(name="`desc`")
    private String desc;

    @Column(name = "created_at", updatable = false, columnDefinition = "datetime(3)")
    private LocalDateTime createdAt;

    @Column(name = "updated_at", updatable = false, columnDefinition = "datetime(3)")
    private LocalDateTime updatedAt;

    @PrePersist
    public void prePersis() {
        this.createdAt=LocalDateTime.now();
        this.updatedAt=LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();
    }


}

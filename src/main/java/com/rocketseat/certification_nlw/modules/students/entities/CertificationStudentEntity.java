package com.rocketseat.certification_nlw.modules.students.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "certifications")
public class CertificationStudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @JoinColumn(name = "student_id", insertable = false, updatable = false)
    private UUID studentID;

    @Column(length = 100)
    private String technology;

    @Column(length = 10)
    private int grade;

    @ManyToOne
    @JoinColumn(name = "student_id", insertable = false, updatable = false)
    private StudentEntity studentEntity;

    @OneToMany
    @JoinColumn(name = "answe_certification_id")
    List<AnswersCertificationsEntity> answersCertificationsEntity;

    @CreationTimestamp
    private LocalDateTime createdAt;
}

package com.rocketseat.certification_nlw.modules.students.entities;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificationStudentEntity {
    private UUID id;
    private UUID studentID;
    private String technology;
    private int grade;
    List<AnswersCertificationsEntity> answersCertificationsEntity;
}

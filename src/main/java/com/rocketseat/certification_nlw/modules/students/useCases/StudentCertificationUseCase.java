package com.rocketseat.certification_nlw.modules.students.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rocketseat.certification_nlw.modules.students.dto.StudentCertificationDTO;
import com.rocketseat.certification_nlw.modules.students.repositories.StudentRepository;

@Service
public class StudentCertificationUseCase {
    @Autowired
    private StudentRepository studentRepository;

    public void execute(StudentCertificationDTO studentCertificationDTO) {

    }
}

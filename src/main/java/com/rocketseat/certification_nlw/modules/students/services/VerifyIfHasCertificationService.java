package com.rocketseat.certification_nlw.modules.students.services;

import org.springframework.stereotype.Service;

import com.rocketseat.certification_nlw.modules.students.dto.VerifyIfHasCertificationDTO;

@Service
public class VerifyIfHasCertificationService {
    public boolean execute(VerifyIfHasCertificationDTO dto) {
        if (dto.getEmail().equals("asod") && dto.getTechnology().equals("JAVA")) {
            return true;
        }
        return false;
    }
}

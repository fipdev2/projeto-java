package com.rocketseat.certification_nlw.modules.students.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rocketseat.certification_nlw.modules.students.dto.VerifyIfHasCertificationDTO;
import com.rocketseat.certification_nlw.modules.students.services.VerifyIfHasCertificationService;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private VerifyIfHasCertificationService VerifyIfHasCertificationService;

    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyIfHasCertificationDTO VerifyIfHasCertificationDTO) {
        var result = this.VerifyIfHasCertificationService.execute(VerifyIfHasCertificationDTO);
        if (result) {
            return "Usuário já fez a prova";
        }
        return "Usuário pode fazer a prova";
    }
}

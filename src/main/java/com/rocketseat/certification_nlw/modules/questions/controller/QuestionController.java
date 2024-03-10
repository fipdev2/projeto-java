package com.rocketseat.certification_nlw.modules.questions.controller;

import org.springframework.web.bind.annotation.RestController;

import com.rocketseat.certification_nlw.modules.questions.dto.AlternativesResultDTO;
import com.rocketseat.certification_nlw.modules.questions.dto.QuestionResultDTO;
import com.rocketseat.certification_nlw.modules.questions.dto.AlternativesResultDTO.AlternativesResultDTOBuilder;
import com.rocketseat.certification_nlw.modules.questions.entities.AlternativesEntity;
import com.rocketseat.certification_nlw.modules.questions.entities.QuestionEntity;
import com.rocketseat.certification_nlw.modules.questions.repositories.QuestionRepository;
import com.rocketseat.certification_nlw.modules.questions.services.QuestionService;

import lombok.Builder;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private QuestionService questionService;

    @GetMapping(value = "/getall")
    public List<QuestionEntity> findAllQuestions() {
        List<QuestionEntity> response = questionService.findAll();
        return response;
    }

    @GetMapping(value = "/technology/{technology}")
    public List<QuestionResultDTO> findByTechnology(@PathVariable String technology) {

        var response = this.questionRepository.findByTechnology(technology);
        var toMap = response.stream().map(question -> mapQuestionToDTO(question)).collect(Collectors.toList());
        return toMap;
    }

    static QuestionResultDTO mapQuestionToDTO(QuestionEntity question) {
        var questionResultDTO = QuestionResultDTO.builder().id(question.getId()).technology(question.getTechnology())
                .description(question.getDescription())
                .build();

        List<AlternativesResultDTO> alternativesResultDTOs = question.getAlternatives().stream()
                .map(alternative -> mapAlternativeDTO(alternative)).collect(Collectors.toList());

        questionResultDTO.setAlternative(alternativesResultDTOs);
        return questionResultDTO;
    }

    static AlternativesResultDTO mapAlternativeDTO(AlternativesEntity alternativesResultDTO) {
        return AlternativesResultDTO.builder().id(alternativesResultDTO.getId())
                .description(alternativesResultDTO.getDescription()).build();
    }
}

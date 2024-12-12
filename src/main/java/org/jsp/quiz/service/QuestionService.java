package org.jsp.quiz.service;

import org.jsp.quiz.entity.Quiz;
import org.springframework.http.ResponseEntity;

public interface QuestionService {

	ResponseEntity<?> saveQuestion(Quiz quiz);

	ResponseEntity<?> findAllQuestions();

}

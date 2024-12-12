package org.jsp.quiz.controller;


import org.jsp.quiz.dto.QuizeResponse;
import org.jsp.quiz.entity.Quiz;
import org.jsp.quiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions")
public class QuizController {
	@Autowired
	private QuestionService service;
	
	@PostMapping
	public  ResponseEntity<?> saveQusetion(@RequestBody Quiz quiz) {
		return service.saveQuestion(quiz);
	}
	
	@GetMapping
	public ResponseEntity<?> findAllQuestions(){
		return service.findAllQuestions();
	}
	@GetMapping("/{id}")
	public ResponseEntity<?> findQuestionById(@PathVariable int id){
		return service.FindQuestionBtId(id);
	}
	@PostMapping("/submit-quiz")
	public ResponseEntity<?> submitQuiz(List<@RequestBody List<QuizeResponse> quizResponses>){
		for(QuizResponse q:)
	}
	
	
	
	

}



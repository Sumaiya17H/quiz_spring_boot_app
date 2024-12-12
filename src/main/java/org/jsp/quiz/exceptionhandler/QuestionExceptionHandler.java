package org.jsp.quiz.exceptionhandler;

import org.jsp.quiz.exceptionclasses.InvalidQuestionIdException;
import org.jsp.quiz.exceptionclasses.NoQuestionFoundException;
import org.jsp.student.responcestructure.ResponseStructure;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionExceptionHandler {
	@ExceptionHandler(NoQuestionFoundException.class)
	public ResponseEntity<?> noQuestionFoundExceptionHandler(NoQuestionFoundException e) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body(ResponseStructure.builder().getHttpStatus(HttpStatus.NOT_FOUND.value())
						.message("No Question found").body("No question found in the database").builder());
	}
	@ExceptionHandler(InvalidQuestionIdException.class)
	public ResponseEntity<?> InvalidQuestionIdExacaptionHandle

}

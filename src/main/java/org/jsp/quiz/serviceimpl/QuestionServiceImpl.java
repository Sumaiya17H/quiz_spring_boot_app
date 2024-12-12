package org.jsp.quiz.serviceimpl;

import java.util.List;

import org.jsp.quiz.dao.QuestionDao;
import org.jsp.quiz.entity.Quiz;
import org.jsp.quiz.exceptionclasses.NoQuestionFoundException;
import org.jsp.quiz.responsestructure.ResponseStructure;
import org.jsp.quiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService{
	@Autowired
	private QuestionDao dao;

	@Override
	public ResponseEntity<?> saveQuestion(Quiz quiz) {
		//re-initialization
		quiz=dao.saveQuestion(quiz);
		ResponseStructure<Quiz> structure=new ResponseStructure<Quiz>();
		structure.setHttpStatus(HttpStatus.OK.value());
		structure.setMessage("Question saved SuccessFully");
		structure.setBody(quiz);
		return new ResponseEntity<>(structure,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> findAllQuestions() {
		List<Quiz> questions=dao.findAllQuestions();
		if(questions.isEmpty())
		{
//			throw new NoQuestionFoundException();
			throw NoQuestionFoundException.builder().message("No question found in the Database").build();
		 
			
		}
		
		return null ;
	}

}

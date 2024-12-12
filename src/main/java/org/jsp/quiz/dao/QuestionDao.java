package org.jsp.quiz.dao;

import java.util.List;

import org.jsp.quiz.entity.Quiz;

public interface QuestionDao {

	Quiz saveQuestion(Quiz quiz);

	List<Quiz> findAllQuestions();

}



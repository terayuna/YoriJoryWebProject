package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;
import com.yorijory.webprj.vo.Question;



public interface QuestionDao {
	public List<Question> getQuestions() throws SQLException;
	public List<Question> getQuestions(int page) throws SQLException;
	public List<Question> getQuestions(int page, String field, String query) throws SQLException;
	public int update(Question question) throws SQLException; 
	public int delete(String members_mid) throws SQLException; 
	public int insert(Question question) throws SQLException; 
}
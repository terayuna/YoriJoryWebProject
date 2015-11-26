package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.QuestionAdminister;

public interface QuestionAdministerDao {
	public List<QuestionAdminister> getQuestionsAdminister() throws SQLException;
	public List<QuestionAdminister> getQuestionsAdminister(int page) throws SQLException;
	public List<QuestionAdminister> getQuestionsAdminister(int page, String field, String query) throws SQLException;
	public int update(QuestionAdminister questionsAdminister) throws SQLException; 
	public int delete(String mid) throws SQLException; 
	public int insert(QuestionAdminister questionsAdminister) throws SQLException;
}

package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.QuestionRecommand;


public interface QuestionRecommandDao {
	public List<QuestionRecommand> getQuestionsRecommand() throws SQLException;
	public List<QuestionRecommand> getQuestionsRecommand(int page) throws SQLException;
	public List<QuestionRecommand> getQuestionsRecommand(int page, String field, String query) throws SQLException;
	public int update(QuestionRecommand questionsRecommand) throws SQLException; 
	public int delete(String members_mid) throws SQLException; 
	public int insert(QuestionRecommand questionsRecommand) throws SQLException; 
}

package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.QuestionComment;


public interface QuestionCommentDao {
	public List<QuestionComment> getQuestionsComment() throws SQLException;
	public List<QuestionComment> getQuestionsComment(int page) throws SQLException;
	public List<QuestionComment> getQuestionsComment(int page, String field, String query) throws SQLException;
	public int update(QuestionComment questionsComment) throws SQLException; 
	public int delete(String members_mid) throws SQLException; 
	public int insert(QuestionComment questionsComment) throws SQLException; 
}

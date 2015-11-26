package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.QuestionReport;


public interface QuestionReportDao {
	public List<QuestionReport> getQuestionsReport() throws SQLException;
	public List<QuestionReport> getQuestionsReport(int page) throws SQLException;
	public List<QuestionReport> getQuestionsReport(int page, String field, String query) throws SQLException;
	public int update(QuestionReport questionsReport) throws SQLException; 
	public int delete(String members_mid) throws SQLException; 
	public int insert(QuestionReport questionsReport) throws SQLException; 
}

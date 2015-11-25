package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.RecipesReport;



public interface RecipesReportDao {
	public List<RecipesReport> getRecipesReport() throws SQLException;
	public List<RecipesReport> getRecipesReport(int page) throws SQLException;
	public List<RecipesReport> getRecipesReport(int page, String field, String query) throws SQLException;
	public int update(RecipesReport recipesreport) throws SQLException; 
	public int delete(String mid) throws SQLException; 
	public int insert(RecipesReport recipesreport) throws SQLException;
	
}

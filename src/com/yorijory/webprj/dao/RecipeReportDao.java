package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.RecipeReport;



public interface RecipeReportDao {
	public List<RecipeReport> getRecipeReports() throws SQLException;
	public List<RecipeReport> getRecipeReports(int page) throws SQLException;
	public List<RecipeReport> getRecipeReports(int page, String field, String query) throws SQLException;
	public int update(RecipeReport recipereports) throws SQLException; 
	public int delete(String mid) throws SQLException; 
	public int insert(RecipeReport recipereports) throws SQLException;
	
}

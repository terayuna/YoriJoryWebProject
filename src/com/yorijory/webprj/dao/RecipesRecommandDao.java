package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.RecipesRecommand;

public interface RecipesRecommandDao {
	public List<RecipesRecommand> getRecipesRecommand() throws SQLException;
	public List<RecipesRecommand> getRecipesRecommand(int page) throws SQLException;
	public List<RecipesRecommand> getRecipesRecommand(int page, String field, String query) throws SQLException;
	public int update(RecipesRecommand recipesrecommand) throws SQLException; 
	public int delete(String mid) throws SQLException; 
	public int insert(RecipesRecommand recipesrecommand) throws SQLException;
	

}

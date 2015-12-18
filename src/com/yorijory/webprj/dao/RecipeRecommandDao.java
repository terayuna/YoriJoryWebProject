package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.RecipeRecommand;

public interface RecipeRecommandDao {
	public List<RecipeRecommand> getRecipeRecommands() throws SQLException;
	public List<RecipeRecommand> getRecipeRecommands(int page) throws SQLException;
	public List<RecipeRecommand> getRecipeRecommands(int page, String field, String query) throws SQLException;
	public int update(RecipeRecommand reciperecommands) throws SQLException; 
	public int delete(String mid) throws SQLException; 
	public int insert(RecipeRecommand reciperecommands) throws SQLException;
	

}

package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.RecipeAdminister;

public interface RecipeAdministerDao {
	public List<RecipeAdminister> getRecipeAdminister() throws SQLException;
	public List<RecipeAdminister> getRecipeAdminister(int page) throws SQLException;
	public List<RecipeAdminister> getRecipeAdminister(int page, String field, String query) throws SQLException;
	public int update(RecipeAdminister recipeadminister) throws SQLException; 
	public int delete(String mid) throws SQLException; 
	public int insert(RecipeAdminister recipeadminister) throws SQLException;

}

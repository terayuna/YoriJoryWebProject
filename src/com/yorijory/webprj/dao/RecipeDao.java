package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.Recipe;

public interface RecipeDao {
	public List<Recipe> getRecipes() throws SQLException;
	public List<Recipe> getRecipes(int page) throws SQLException;
	public List<Recipe> getRecipes(int page, String field, String query) throws SQLException;
	public int update(Recipe recipes) throws SQLException;
	public int delete(String members_mid) throws SQLException;
	public int insert(Recipe recipes) throws SQLException;

}

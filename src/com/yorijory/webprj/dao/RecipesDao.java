package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.Recipes;

public interface RecipesDao {
	public List<Recipes> getRecipes() throws SQLException;
	public List<Recipes> getRecipes(int page) throws SQLException;
	public List<Recipes> getRecipes(int page, String field, String query) throws SQLException;
	public int update(Recipes recipes) throws SQLException;
	public int delete(String members_mid) throws SQLException;
	public int insert(Recipes recipes) throws SQLException;

}

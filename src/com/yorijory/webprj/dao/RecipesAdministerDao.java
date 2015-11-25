package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.RecipesAdminister;

public interface RecipesAdministerDao {
	public List<RecipesAdminister> getRecipesAdminister() throws SQLException;
	public List<RecipesAdminister> getRecipesAdminister(int page) throws SQLException;
	public List<RecipesAdminister> getRecipesAdminister(int page, String field, String query) throws SQLException;
	public int update(RecipesAdminister recipesadminister) throws SQLException; 
	public int delete(String mid) throws SQLException; 
	public int insert(RecipesAdminister recipesadminister) throws SQLException;

}

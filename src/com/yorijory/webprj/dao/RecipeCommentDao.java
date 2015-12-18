package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.RecipeComment;

public interface RecipeCommentDao {
	public List<RecipeComment> getRecipeComments() throws SQLException;
	public List<RecipeComment> getRecipeComments(int page) throws SQLException;
	public List<RecipeComment> getRecipeComments(int page, String field, String query) throws SQLException;
	public int update(RecipeComment recipescomments) throws SQLException; 
	public int delete(String mid) throws SQLException; 
	public int insert(RecipeComment recipecomments) throws SQLException;
	

}

package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.RecipesComment;

public interface RecipesCommentDao {
	public List<RecipesComment> getRecipesComment() throws SQLException;
	public List<RecipesComment> getRecipesComment(int page) throws SQLException;
	public List<RecipesComment> getRecipesComment(int page, String field, String query) throws SQLException;
	public int update(RecipesComment recipescomment) throws SQLException; 
	public int delete(String mid) throws SQLException; 
	public int insert(RecipesComment recipescomment) throws SQLException;
	

}

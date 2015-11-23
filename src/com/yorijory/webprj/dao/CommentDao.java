package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.Comment;

public interface CommentDao {
	public List<Comment> getComments() throws SQLException;
	public List<Comment> getComments(int page) throws SQLException;
	public List<Comment> getComments(int page, String field, String query) throws SQLException;
	public int update(Comment comment) throws SQLException;
	public int delete(String mid);
	public int insert(Comment comment);
}

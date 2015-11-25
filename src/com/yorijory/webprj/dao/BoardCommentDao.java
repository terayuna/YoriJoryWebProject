package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.Board;
import com.yorijory.webprj.vo.BoardComment;
import com.yorijory.webprj.vo.Member;



public interface BoardCommentDao {
	public List<BoardComment> getBoardComments() throws SQLException;
	public List<BoardComment> getBoardComments(int page) throws SQLException;
	public List<BoardComment> getBoardComments(int page, String field, String query) throws SQLException;
	public int update(BoardComment boardComment) throws SQLException; 
	public int delete(String mid) throws SQLException; 
	public int insert(BoardComment boardComment) throws SQLException; 

}

package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.Board;
import com.yorijory.webprj.vo.Member;



public interface BoardDao {
	public List<Board> getBoards() throws SQLException;
	public List<Board> getBoards(int page) throws SQLException;
	public List<Board> getBoards(int page, String field, String query) throws SQLException;
	public int update(Board board) throws SQLException; 
	public int delete(String mid) throws SQLException; 
	public int insert(Board board) throws SQLException; 

}

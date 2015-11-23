package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.Boards;

public interface BoardsDao {
	public List<Boards> getBoards() throws SQLException;
	public List<Boards> getBoards(int page) throws SQLException;
	public List<Boards> getBoards(int page,String field,String query) throws SQLException;
	public int update(Boards boards);
	public int delete(Boards boards);
	public int insert(Boards boards);

}

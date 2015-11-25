package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.Board;
import com.yorijory.webprj.vo.BoardAdminister;
import com.yorijory.webprj.vo.Member;



public interface BoardAdministerDao {
	public List<BoardAdminister> getBoardAdministers() throws SQLException;
	public List<BoardAdminister> getBoardAdministers(int page) throws SQLException;
	public List<BoardAdminister> getBoardAdministers(int page, String field, String query) throws SQLException;
	
}

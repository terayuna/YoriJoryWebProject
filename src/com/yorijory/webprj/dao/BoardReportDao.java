package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;
import com.yorijory.webprj.vo.BoardReport;




public interface BoardReportDao {
	public List<BoardReport> getBoardReports() throws SQLException;
	public List<BoardReport> getBoardReports(int page) throws SQLException;
	public List<BoardReport> getBoardReports(int page, String field, String query) throws SQLException;
	

}

package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.Member;
import com.yorijory.webprj.vo.Notice;

public interface NoticeDao {
	public List<Notice> getNotices() throws SQLException;
	public List<Notice> getNotices(int page) throws SQLException;
	public List<Notice> getNotices(int page, String field, String query) throws SQLException;

	public int update(Notice notice) throws SQLException; 
	public int delete(String mid) throws SQLException; 
	public int insert(Notice notice) throws SQLException;
	
	

}

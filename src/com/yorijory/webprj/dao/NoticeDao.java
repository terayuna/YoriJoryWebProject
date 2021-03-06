package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.Notice;

public interface NoticeDao {
	public List<Notice> getNotices() throws SQLException;
	public List<Notice> getNotices(int page) throws SQLException;
	public List<Notice> getNotices(int page, String field, String query) throws SQLException;
	public Notice getNotice(String code);
	public Notice getPrevNotice(String code);
	public Notice getNextNotice(String code);
	public int update(Notice notice) throws SQLException;
	public int delete(int code);
	public int insert(Notice notice);
	public String getLastCode();
	public int getNoticeCount(String field, String query);
}

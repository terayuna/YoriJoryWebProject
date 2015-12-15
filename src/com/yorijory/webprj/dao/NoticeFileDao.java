package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.NoticeFile;


public interface NoticeFileDao {
	public List<NoticeFile> getNoticeFiles(String noticeCode);
	public int insert(NoticeFile n) throws SQLException;
	
}

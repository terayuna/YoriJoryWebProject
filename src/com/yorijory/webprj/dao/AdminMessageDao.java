package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.AdminMessage;

public interface AdminMessageDao {
	public List<AdminMessage> getAdminMessage() throws SQLException;
	public List<AdminMessage> getAdminMessage(int page) throws SQLException;
	public List<AdminMessage> getAdminMessage(int page, String field, String query) throws SQLException;
	public int update(AdminMessage adminMessage) throws SQLException;
	public int delete(int code);
	public int insert(AdminMessage adminMessage);
}

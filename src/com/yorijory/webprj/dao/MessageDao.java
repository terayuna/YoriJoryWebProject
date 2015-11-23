package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.Message;

public interface MessageDao {
	public List<Message> getMessages() throws SQLException;
	public List<Message> getMessages(int page) throws SQLException;
	public List<Message> getMessages(int page, String field, String query) throws SQLException;
	public int update(Message message) throws SQLException;
	public int delete(String code);
	public int insert(Message message);
}

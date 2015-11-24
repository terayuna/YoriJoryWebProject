package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.Admin;

public interface AdminDao {
	public List<Admin> getAdmin() throws SQLException;
	public List<Admin> getAdmin(int page) throws SQLException;
	public List<Admin> getAdmin(int page, String field, String query) throws SQLException;
	public int update(Admin admin) throws SQLException;
	public int delete(String mid);
	public int insert(Admin admin);
}

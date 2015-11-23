package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.Admin;

public interface AdminDao {
	public List<Admin> getAdmins() throws SQLException;
	public List<Admin> getAdmins(int page) throws SQLException;
	public List<Admin> getAdmins(int page, String field, String query) throws SQLException;

}

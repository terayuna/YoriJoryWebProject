package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.Administer;
import com.yorijory.webprj.vo.Member;



public interface AdministerDao {
	public List<Administer> getAdministers() throws SQLException;
	public List<Administer> getAdministers(int page) throws SQLException;
	public List<Administer> getAdministers(int page, String field, String query) throws SQLException;
	

}

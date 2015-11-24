package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.Scrap;

public interface ScrapDao {
	public List<Scrap> getScraps() throws SQLException;
	public List<Scrap> getScraps(int page) throws SQLException;
	public List<Scrap> getScraps(int page, String field, String query) throws SQLException;
	public int update(Scrap scrap) throws SQLException;
	public int delete(int code);
	public int insert(Scrap scrape);
}

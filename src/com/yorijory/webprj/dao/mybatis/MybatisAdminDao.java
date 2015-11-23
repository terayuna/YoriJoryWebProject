package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.AdminDao;

import com.yorijory.webprj.vo.Admin;


public class MybatisAdminDao implements AdminDao{
	SqlSessionFactory ssf = SqlYojoSessionFactoryBuilder.getSqlSessionFactory();
	
	@Override
	public List<Admin> getAdmins() throws SQLException {
		// TODO Auto-generated method stub
		return getAdmins(1, "MID", "");
	}

	@Override
	public List<Admin> getAdmins(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getAdmins(page, "MID", "");
	}

	@Override
	public List<Admin> getAdmins(int page, String field, String query) throws SQLException {
		SqlSession session = ssf.openSession();
		AdminDao dao = session.getMapper(AdminDao.class); 
		List<Admin> list = dao.getAdmins(page, field, query);
		session.close();
		return list;
	}

	
}

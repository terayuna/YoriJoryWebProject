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
	public List<Admin> getAdmin() throws SQLException {
		// TODO Auto-generated method stub
		return getAdmin(1, "MID", "");
	}

	@Override
	public List<Admin> getAdmin(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getAdmin(page, "MID", "");
	}

	@Override
	public List<Admin> getAdmin(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		AdminDao dao = session.getMapper(AdminDao.class);
		List<Admin> list = dao.getAdmin(page, field, query);

		session.close();
		return list;
	}

	@Override
	public int update(Admin admin) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String mid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Admin admin) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

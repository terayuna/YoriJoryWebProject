package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.AdministerDao;
import com.yorijory.webprj.dao.MemberDao;
import com.yorijory.webprj.vo.Administer;
import com.yorijory.webprj.vo.Member;

public class MybatisAdministerDao implements AdministerDao{
	SqlSessionFactory ssf = SqlYojoSessionFactoryBuilder.getSqlSessionFactory();
	
	@Override
	public List<Administer> getAdministers() throws SQLException {
		// TODO Auto-generated method stub
		return getAdministers(1, "MEMBERID", "");
	}

	@Override
	public List<Administer> getAdministers(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getAdministers(page, "MEMBERID", "");
	}

	@Override
	public List<Administer> getAdministers(int page, String field, String query) throws SQLException {
		SqlSession session = ssf.openSession();
		AdministerDao dao = session.getMapper(AdministerDao.class); 
		List<Administer> list = dao.getAdministers(page, field, query);
		session.close();
		return list;
	}


	
}

package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.yorijory.webprj.dao.AdminMessageDao;
import com.yorijory.webprj.vo.AdminMessage;

public class MybatisAdminMessageDao implements AdminMessageDao {
	// SqlSessionFactory ssf =
	// YojoSqlSessionFactoryBuilder.getSqlSessionFactory();
	@Autowired
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<AdminMessage> getAdminMessage() throws SQLException {
		// TODO Auto-generated method stub
		return getAdminMessage(1, "CODE", "");
	}

	@Override
	public List<AdminMessage> getAdminMessage(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getAdminMessage(page, "CODE", "");
	}

	@Override
	public List<AdminMessage> getAdminMessage(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		//SqlSession session = ssf.openSession();
		AdminMessageDao dao = sqlSession.getMapper(AdminMessageDao.class);
		List<AdminMessage> list = dao.getAdminMessage(page, field, query);

		//session.close();
		return list;
	}

	@Override
	public int update(AdminMessage adminMessage) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int code) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(AdminMessage adminMessage) {
		// TODO Auto-generated method stub
		return 0;
	}
}

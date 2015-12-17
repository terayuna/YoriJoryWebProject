package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.yorijory.webprj.dao.BoardAdministerDao;
import com.yorijory.webprj.dao.BoardDao;

import com.yorijory.webprj.vo.Board;
import com.yorijory.webprj.vo.BoardAdminister;


public class MybatisBoardAdministerDao implements BoardAdministerDao{
	//SqlSessionFactory ssf = YojoSqlSessionFactoryBuilder.getSqlSessionFactory();
	
	@Autowired //
	private SqlSession sqlSession;

	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<BoardAdminister> getBoardAdministers() throws SQLException {
		// TODO Auto-generated method stub
		return getBoardAdministers(1, "MEMBERS_MID", "");
	}

	@Override
	public List<BoardAdminister> getBoardAdministers(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getBoardAdministers(page, "MEMBERS_MID", "");
	}

	@Override
	public List<BoardAdminister> getBoardAdministers(int page, String field, String query) throws SQLException {
		//SqlSession session = ssf.openSession();
		BoardAdministerDao dao = sqlSession.getMapper(BoardAdministerDao.class); 
		List<BoardAdminister> list = dao.getBoardAdministers(page, field, query);
		//session.close();
		return list;
	}
	
}

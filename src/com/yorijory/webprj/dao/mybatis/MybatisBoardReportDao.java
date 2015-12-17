package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.yorijory.webprj.dao.BoardReportDao;

import com.yorijory.webprj.vo.BoardReport;


public class MybatisBoardReportDao implements BoardReportDao{
	//SqlSessionFactory ssf = YojoSqlSessionFactoryBuilder.getSqlSessionFactory();
	@Autowired //
	private SqlSession sqlSession;

	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public List<BoardReport> getBoardReports() throws SQLException {
		// TODO Auto-generated method stub
		return getBoardReports(1, "MID", "");
	}

	
	public List<BoardReport> getBoardReports(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getBoardReports(page, "MID", "");
	}

	public List<BoardReport> getBoardReports(int page, String field, String query) throws SQLException {
		//SqlSession session = ssf.openSession();
		BoardReportDao dao = sqlSession.getMapper(BoardReportDao.class); 
		List<BoardReport> list = dao.getBoardReports(page, field, query);
		//session.close();
		return list;
	}

	
}

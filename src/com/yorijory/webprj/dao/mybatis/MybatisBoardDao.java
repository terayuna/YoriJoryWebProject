package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.BoardDao;

import com.yorijory.webprj.vo.Board;


public class MybatisBoardDao implements BoardDao{
	SqlSessionFactory ssf = YojoSqlSessionFactoryBuilder.getSqlSessionFactory();
	
	@Override
	public List<Board> getBoards() throws SQLException {
		// TODO Auto-generated method stub
		return getBoards(1, "TITLE", "");
	}

	@Override
	public List<Board> getBoards(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getBoards(page, "TITLE", "");
	}

	@Override
	public List<Board> getBoards(int page, String field, String query) throws SQLException {
		SqlSession session = ssf.openSession();
		BoardDao dao = session.getMapper(BoardDao.class); 
		List<Board> list = dao.getBoards(page, field, query);
		session.close();
		return list;
	}

	@Override
	public int update(Board board) throws SQLException {
		SqlSession session = ssf.openSession();
		BoardDao dao = session.getMapper(BoardDao.class); 
		int count = dao.update(board);
		session.commit();
		session.close(); 
		return count;
	}

	@Override
	public int delete(String mid) throws SQLException {
		SqlSession session = ssf.openSession();
		BoardDao dao = session.getMapper(BoardDao.class); 
		int count = dao.delete(mid);
		session.commit();
		session.close(); 
		return count;
	}

	@Override
	public int insert(Board board) throws SQLException {
		SqlSession session = ssf.openSession();
		BoardDao dao = session.getMapper(BoardDao.class); 
		int count = dao.insert(board);
		session.commit();
		session.close(); 
		return count;
	}
	
}

package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


import com.yorijory.webprj.dao.BoardsDao;
import com.yorijory.webprj.vo.Boards;

public class MybatisBoardsDao implements BoardsDao {
	SqlSessionFactory ssf = SqlYojoSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<Boards> getBoards() throws SQLException {
		// TODO Auto-generated method stub
		return  getBoards(1, "Writer", "");
	}

	@Override
	public List<Boards> getBoards(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getBoards(page, "Writer", "");
	}

	@Override
	public List<Boards> getBoards(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
	    SqlSession session = ssf.openSession();
		BoardsDao dao = session.getMapper(BoardsDao.class); 
		List<Boards> list = dao.getBoards(page, field, query);
		session.close();
		return list;
	}

	@Override
	public int update(Boards boards) {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		BoardsDao dao = session.getMapper(BoardsDao.class); 
		int count = dao.update(boards);
		session.commit();
		session.close(); 
		return count;
	}

	@Override
	public int delete(Boards boards) {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		BoardsDao dao = session.getMapper(BoardsDao.class); 
		int count = dao.delete(boards);
		session.commit();
		session.close(); 
		return count;
	}

	@Override
	public int insert(Boards boards) {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		BoardsDao dao = session.getMapper(BoardsDao.class); 
		int count = dao.insert(boards);
		session.commit();
		session.close(); 
		return count;
	}

}

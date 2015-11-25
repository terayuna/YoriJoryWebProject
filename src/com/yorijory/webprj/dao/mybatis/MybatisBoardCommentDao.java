package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.BoardCommentDao;
import com.yorijory.webprj.vo.BoardComment;


public class MybatisBoardCommentDao implements BoardCommentDao{
	SqlSessionFactory ssf = YojoSqlSessionFactoryBuilder.getSqlSessionFactory();
	
	@Override
	public List<BoardComment> getBoardComments() throws SQLException {
		// TODO Auto-generated method stub
		return getBoardComments(1, "MEMBERS_MID", "");
	}

	@Override
	public List<BoardComment> getBoardComments(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getBoardComments(page, "MEMBERS_MID", "");
	}

	@Override
	public List<BoardComment> getBoardComments(int page, String field, String query) throws SQLException {
		SqlSession session = ssf.openSession();
		BoardCommentDao dao = session.getMapper(BoardCommentDao.class); 
		List<BoardComment> list = dao.getBoardComments(page, field, query);
		session.close();
		return list;
	}

	@Override
	public int update(BoardComment boardComment) throws SQLException {
		SqlSession session = ssf.openSession();
		BoardCommentDao dao = session.getMapper(BoardCommentDao.class); 
		int count = dao.update(boardComment);
		session.commit();
		session.close(); 
		return count;
	}

	@Override
	public int delete(String mid) throws SQLException {
		SqlSession session = ssf.openSession();
		BoardCommentDao dao = session.getMapper(BoardCommentDao.class); 
		int count = dao.delete(mid);
		session.commit();
		session.close(); 
		return count;
	}

	@Override
	public int insert(BoardComment boardComment) throws SQLException {
		SqlSession session = ssf.openSession();
		BoardCommentDao dao = session.getMapper(BoardCommentDao.class); 
		int count = dao.insert(boardComment);
		session.commit();
		session.close(); 
		return count;
	}
	
}

package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.yorijory.webprj.dao.BoardCommentDao;
import com.yorijory.webprj.vo.BoardComment;


public class MybatisBoardCommentDao implements BoardCommentDao{
	//SqlSessionFactory ssf = YojoSqlSessionFactoryBuilder.getSqlSessionFactory();
	@Autowired //
	private SqlSession sqlSession;

	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<BoardComment> getBoardComments() throws SQLException {
		// TODO Auto-generated method stub
		return getBoardComments(1, "");
	}

	@Override
	public List<BoardComment> getBoardComments(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getBoardComments(page, "");
	}

	@Override
	public List<BoardComment> getBoardComments(int page, String query) throws SQLException {
		//SqlSession session = ssf.openSession();
		BoardCommentDao dao = sqlSession.getMapper(BoardCommentDao.class); 
		List<BoardComment> list = dao.getBoardComments(page, query);
		//session.close();
		return list;
	}

	@Override
	public int update(BoardComment boardComment) throws SQLException {
		//SqlSession session = ssf.openSession();
		BoardCommentDao dao = sqlSession.getMapper(BoardCommentDao.class); 
		int count = dao.update(boardComment);
		//session.commit();
		//session.close(); 
		return count;
	}

	@Override
	public int delete(String mid) throws SQLException {
		//SqlSession session = ssf.openSession();
		BoardCommentDao dao = sqlSession.getMapper(BoardCommentDao.class); 
		int count = dao.delete(mid);
		//session.commit();
		//session.close(); 
		return count;
	}

	@Override
	public int insert(BoardComment boardComment) throws SQLException {
		// TODO Auto-generated method stub
		BoardCommentDao dao = sqlSession.getMapper(BoardCommentDao.class); 
		int count = dao.insert(boardComment);
		return 0;
	}
	
}

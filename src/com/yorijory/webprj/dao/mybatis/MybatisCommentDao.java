package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.CommentDao;
import com.yorijory.webprj.vo.Comment;

public class MybatisCommentDao implements CommentDao{
	SqlSessionFactory ssf = SqlYojoSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<Comment> getComments() throws SQLException {
		// TODO Auto-generated method stub
		return getComments(1, "CODE", "");
	}

	@Override
	public List<Comment> getComments(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getComments(page, "CODE", "");
	}

	@Override
	public List<Comment> getComments(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		CommentDao dao = session.getMapper(CommentDao.class);
		List<Comment> list = dao.getComments(page, field, query);

		session.close();
		return list;
	}

	@Override
	public int update(Comment comment) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String mid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Comment comment) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}

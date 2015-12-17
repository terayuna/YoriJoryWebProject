package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.yorijory.webprj.dao.RecipesCommentDao;
import com.yorijory.webprj.dao.RecipesRecommandDao;
import com.yorijory.webprj.vo.RecipesComment;

public class MybatisRecipesCommentDao implements RecipesCommentDao {
	
	//SqlSessionFactory ssf = YojoSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Autowired //
	private SqlSession sqlSession;

	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<RecipesComment> getRecipesComment() throws SQLException {
		// TODO Auto-generated method stub
		return getRecipesComment(1, "Mid", "");
	}

	@Override
	public List<RecipesComment> getRecipesComment(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getRecipesComment(page, "Mid", "");
	}

	@Override
	public List<RecipesComment> getRecipesComment(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		//SqlSession session = ssf.openSession();
		RecipesCommentDao dao = sqlSession.getMapper(RecipesCommentDao.class); 
		List<RecipesComment> list = dao.getRecipesComment(page, field, query);
		//session.close();
		return list;
	}

	@Override
	public int update(RecipesComment recipescomment) throws SQLException {
		// TODO Auto-generated method stub
		//SqlSession session = ssf.openSession();
		RecipesCommentDao dao = sqlSession.getMapper(RecipesCommentDao.class); 
		int count = dao.update(recipescomment);
		//session.commit();
		//session.close(); 
		return count;
	}

	@Override
	public int delete(String mid) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(RecipesComment recipescomment) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}

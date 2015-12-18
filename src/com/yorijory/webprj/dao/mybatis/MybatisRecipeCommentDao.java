package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.yorijory.webprj.dao.RecipeCommentDao;
import com.yorijory.webprj.dao.RecipeRecommandDao;
import com.yorijory.webprj.vo.RecipeComment;

public class MybatisRecipeCommentDao implements RecipeCommentDao {
	
	//SqlSessionFactory ssf = YojoSqlSessionFactoryBuilder.getSqlSessionFactory();
	@Autowired //
	private SqlSession sqlSession;
	@Override
	public List<RecipeComment> getRecipeComments() throws SQLException {
		// TODO Auto-generated method stub
		return getRecipeComments(1, "Mid", "");
	}

	@Override
	public List<RecipeComment> getRecipeComments(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getRecipeComments(page, "Mid", "");
	}

	@Override
	public List<RecipeComment> getRecipeComments(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		//SqlSession session = ssf.openSession();
		RecipeCommentDao dao = sqlSession.getMapper(RecipeCommentDao.class); 
		List<RecipeComment> list = dao.getRecipeComments(page, field, query);
		//session.close();
		return list;
	}

	@Override
	public int update(RecipeComment recipecomments) throws SQLException {
		// TODO Auto-generated method stub
		//SqlSession session = ssf.openSession();
		RecipeCommentDao dao = sqlSession.getMapper(RecipeCommentDao.class); 
		int count = dao.update(recipecomments);
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
	public int insert(RecipeComment recipecomments) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}

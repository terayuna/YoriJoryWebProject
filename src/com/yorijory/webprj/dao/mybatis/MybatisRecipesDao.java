package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.yorijory.webprj.dao.RecipesDao;
import com.yorijory.webprj.vo.Recipes;

public class MybatisRecipesDao implements RecipesDao {

	//SqlSessionFactory ssf = YojoSqlSessionFactoryBuilder.getSqlSessionFactory();
	
	@Autowired //
	private SqlSession sqlSession;

	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Recipes> getRecipes() throws SQLException {
		// TODO Auto-generated method stub
		return getRecipes(1, "Member_Mid", "");
	}

	@Override
	public List<Recipes> getRecipes(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getRecipes(page, "Member_Mid", "");
	}

	@Override
	public List<Recipes> getRecipes(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		//SqlSession session = ssf.openSession();
		RecipesDao dao = sqlSession.getMapper(RecipesDao.class); 
		List<Recipes> list = dao.getRecipes(page, field, query);
		//session.close();
		return list;	}

	@Override
	public int update(Recipes recipes) throws SQLException {
		// TODO Auto-generated method stub
		//SqlSession session = ssf.openSession();
		RecipesDao dao = sqlSession.getMapper(RecipesDao.class); 
		int count = dao.update(recipes);
		//session.commit();
		//session.close(); 
		return count;
	}

	@Override
	public int delete(String members_mid) throws SQLException {
		// TODO Auto-generated method stub
		//SqlSession session = ssf.openSession();
		RecipesDao dao = sqlSession.getMapper(RecipesDao.class); 
		int count = dao.delete(members_mid);
		//session.commit();
		//session.close(); 
		return count;
	}

	@Override
	public int insert(Recipes recipes) throws SQLException {
		// TODO Auto-generated method stub
		//SqlSession session = ssf.openSession();
		RecipesDao dao = sqlSession.getMapper(RecipesDao.class); 
		int count = dao.insert(recipes);
		//session.commit();
		//session.close(); 
		return count;
	}

}

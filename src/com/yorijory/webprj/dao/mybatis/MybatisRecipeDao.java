package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.RecipeDao;
import com.yorijory.webprj.vo.Recipe;

public class MybatisRecipeDao implements RecipeDao {

	SqlSessionFactory ssf = YojoSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<Recipe> getRecipes() throws SQLException {
		// TODO Auto-generated method stub
		return getRecipes(1, "Member_Mid", "");
	}

	@Override
	public List<Recipe> getRecipes(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getRecipes(page, "Member_Mid", "");
	}

	@Override
	public List<Recipe> getRecipes(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		RecipeDao dao = session.getMapper(RecipeDao.class); 
		List<Recipe> list = dao.getRecipes(page, field, query);
		session.close();
		return list;	}

	@Override
	public int update(Recipe recipes) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		RecipeDao dao = session.getMapper(RecipeDao.class); 
		int count = dao.update(recipes);
		session.commit();
		session.close(); 
		return count;
	}

	@Override
	public int delete(String members_mid) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		RecipeDao dao = session.getMapper(RecipeDao.class); 
		int count = dao.delete(members_mid);
		session.commit();
		session.close(); 
		return count;
	}

	@Override
	public int insert(Recipe recipes) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		RecipeDao dao = session.getMapper(RecipeDao.class); 
		int count = dao.insert(recipes);
		session.commit();
		session.close(); 
		return count;
	}

}

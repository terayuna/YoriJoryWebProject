package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.RecipeAdministerDao;
import com.yorijory.webprj.dao.RecipeCommentDao;
import com.yorijory.webprj.vo.RecipeAdminister;

public class MybatisRecipeAdministerDao implements RecipeAdministerDao{
	SqlSessionFactory ssf = YojoSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<RecipeAdminister> getRecipeAdminister() throws SQLException {
		// TODO Auto-generated method stub
		return getRecipeAdminister(1, "Members_Mid", "");

	}

	@Override
	public List<RecipeAdminister> getRecipeAdminister(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getRecipeAdminister(page, "Members_Mid", "");
	}

	@Override
	public List<RecipeAdminister> getRecipeAdminister(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		RecipeAdministerDao dao = session.getMapper(RecipeAdministerDao.class); 
		List<RecipeAdminister> list = dao.getRecipeAdminister(page, field, query);
		session.close();
		return list;
	}

	@Override
	public int update(RecipeAdminister recipeadminister) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		RecipeAdministerDao dao = session.getMapper(RecipeAdministerDao.class); 
		int count = dao.update(recipeadminister);
		session.commit();
		session.close(); 
		return count;
	}

	@Override
	public int delete(String mid) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(RecipeAdminister recipeadminister) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
}

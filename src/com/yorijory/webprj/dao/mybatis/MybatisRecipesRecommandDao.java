package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.RecipesRecommandDao;
import com.yorijory.webprj.dao.RecipesReportDao;
import com.yorijory.webprj.vo.RecipesRecommand;

public class MybatisRecipesRecommandDao implements RecipesRecommandDao {
	SqlSessionFactory ssf = SqlYojoSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<RecipesRecommand> getRecipesRecommand() throws SQLException {
		// TODO Auto-generated method stub
		return getRecipesRecommand(1, "Members_mid", "");
	}

	@Override
	public List<RecipesRecommand> getRecipesRecommand(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getRecipesRecommand(page, "Mid", "");
	}

	@Override
	public List<RecipesRecommand> getRecipesRecommand(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		RecipesRecommandDao dao = session.getMapper(RecipesRecommandDao.class); 
		List<RecipesRecommand> list = dao.getRecipesRecommand(page, field, query);
		session.close();
		return list;
	}

	@Override
	public int update(RecipesRecommand recipesrecommand) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		RecipesRecommandDao dao = session.getMapper(RecipesRecommandDao.class); 
		int count = dao.update(recipesrecommand);
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
	public int insert(RecipesRecommand recipesrecommand) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}

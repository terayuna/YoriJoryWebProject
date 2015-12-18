package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.RecipeRecommandDao;
import com.yorijory.webprj.dao.RecipeReportDao;
import com.yorijory.webprj.vo.RecipeRecommand;

public class MybatisRecipeRecommandDao implements RecipeRecommandDao {
	SqlSessionFactory ssf = YojoSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<RecipeRecommand> getRecipeRecommands() throws SQLException {
		// TODO Auto-generated method stub
		return getRecipeRecommands(1, "Members_mid", "");
	}

	@Override
	public List<RecipeRecommand> getRecipeRecommands(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getRecipeRecommands(page, "Mid", "");
	}

	@Override
	public List<RecipeRecommand> getRecipeRecommands(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		RecipeRecommandDao dao = session.getMapper(RecipeRecommandDao.class); 
		List<RecipeRecommand> list = dao.getRecipeRecommands(page, field, query);
		session.close();
		return list;
	}

	@Override
	public int update(RecipeRecommand reciperecommands) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		RecipeRecommandDao dao = session.getMapper(RecipeRecommandDao.class); 
		int count = dao.update(reciperecommands);
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
	public int insert(RecipeRecommand reciperecommands) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}

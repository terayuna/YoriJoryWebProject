package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.yorijory.webprj.dao.RecipeDao;
import com.yorijory.webprj.dao.RecipeReportDao;
import com.yorijory.webprj.vo.RecipeReport;

public class MybatisRecipeReportDao implements RecipeReportDao{
	
	SqlSessionFactory ssf = YojoSqlSessionFactoryBuilder.getSqlSessionFactory();
	@Autowired //
	private SqlSession sqlSession;
	@Override
	public List<RecipeReport> getRecipeReports() throws SQLException {
		// TODO Auto-generated method stub
		return getRecipeReports(1, "Mid", "");
	}

	@Override
	public List<RecipeReport> getRecipeReports(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getRecipeReports(page, "Mid", "");
	}

	@Override
	public List<RecipeReport> getRecipeReports(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		//SqlSession session = ssf.openSession();
		RecipeReportDao dao = sqlSession.getMapper(RecipeReportDao.class); 
		List<RecipeReport> list = dao.getRecipeReports(page, field, query);
		//session.close();
		return list;
	}

	@Override
	public int update(RecipeReport recipereports) throws SQLException {
		// TODO Auto-generated method stub
		//SqlSession session = ssf.openSession();
		RecipeReportDao dao = sqlSession.getMapper(RecipeReportDao.class); 
		int count = dao.update(recipereports);
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
	public int insert(RecipeReport recipereports) throws SQLException {
		// TODO Auto-generated method stub
		
		return 0;
	}
	

	

}

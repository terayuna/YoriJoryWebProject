package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.RecipesDao;
import com.yorijory.webprj.dao.RecipesReportDao;
import com.yorijory.webprj.vo.RecipesReport;

public class MybatisRecipesReportDao implements RecipesReportDao{
	
	SqlSessionFactory ssf = SqlYojoSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<RecipesReport> getRecipesReport() throws SQLException {
		// TODO Auto-generated method stub
		return getRecipesReport(1, "Mid", "");
	}

	@Override
	public List<RecipesReport> getRecipesReport(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getRecipesReport(page, "Mid", "");
	}

	@Override
	public List<RecipesReport> getRecipesReport(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		RecipesReportDao dao = session.getMapper(RecipesReportDao.class); 
		List<RecipesReport> list = dao.getRecipesReport(page, field, query);
		session.close();
		return list;
	}

	@Override
	public int update(RecipesReport recipesreport) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		RecipesReportDao dao = session.getMapper(RecipesReportDao.class); 
		int count = dao.update(recipesreport);
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
	public int insert(RecipesReport recipesreport) throws SQLException {
		// TODO Auto-generated method stub
		
		return 0;
	}
	

	

}

package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.yorijory.webprj.dao.RecipesAdministerDao;
import com.yorijory.webprj.dao.RecipesCommentDao;
import com.yorijory.webprj.vo.RecipesAdminister;

public class MybatisRecipesAdministerDao implements RecipesAdministerDao{
	//SqlSessionFactory ssf = YojoSqlSessionFactoryBuilder.getSqlSessionFactory();
	
	@Autowired //
	private SqlSession sqlSession;

	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<RecipesAdminister> getRecipesAdminister() throws SQLException {
		// TODO Auto-generated method stub
		return getRecipesAdminister(1, "Members_Mid", "");

	}

	@Override
	public List<RecipesAdminister> getRecipesAdminister(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getRecipesAdminister(page, "Members_Mid", "");
	}

	@Override
	public List<RecipesAdminister> getRecipesAdminister(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		//SqlSession session = ssf.openSession();
		RecipesAdministerDao dao = sqlSession.getMapper(RecipesAdministerDao.class); 
		List<RecipesAdminister> list = dao.getRecipesAdminister(page, field, query);
		//session.close();
		return list;
	}

	@Override
	public int update(RecipesAdminister recipesadminister) throws SQLException {
		// TODO Auto-generated method stub
		//SqlSession session = ssf.openSession();
		RecipesAdministerDao dao = sqlSession.getMapper(RecipesAdministerDao.class); 
		int count = dao.update(recipesadminister);
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
	public int insert(RecipesAdminister recipesadminister) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
}

package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.QuestionAdministerDao;
import com.yorijory.webprj.dao.QuestionDao;
import com.yorijory.webprj.dao.RecipesAdministerDao;
import com.yorijory.webprj.vo.QuestionAdminister;

public class MybatisQuestionAdministerDao implements QuestionAdministerDao {
	SqlSessionFactory ssf = YojoSqlSessionFactoryBuilder.getSqlSessionFactory();

	
	@Override
	public List<QuestionAdminister> getQuestionsAdminister() throws SQLException {
		return getQuestionsAdminister(1, "Member_Mid", "");
	}

	@Override
	public List<QuestionAdminister> getQuestionsAdminister(int page) throws SQLException {
		return getQuestionsAdminister(page, "Member_Mid", "");
	}

	@Override
	public List<QuestionAdminister> getQuestionsAdminister(int page, String field, String query) throws SQLException {
		SqlSession session = ssf.openSession();
		QuestionAdministerDao dao = session.getMapper(QuestionAdministerDao.class); 
		List<QuestionAdminister> list = dao.getQuestionsAdminister(page, field, query);
		session.close();
		return list;
	}

	@Override
	public int update(QuestionAdminister questionsadminister) throws SQLException {
		SqlSession session = ssf.openSession();
		QuestionAdministerDao dao = session.getMapper(QuestionAdministerDao.class); 
		int count = dao.update(questionsadminister);
		session.commit();
		session.close(); 
		return count;
	}

	@Override
	public int delete(String members_mid) throws SQLException {
		SqlSession session = ssf.openSession();
		QuestionAdministerDao dao = session.getMapper(QuestionAdministerDao.class); 
		int count = dao.delete(members_mid);
		session.commit();
		session.close(); 
		return count;
	}

	@Override
	public int insert(QuestionAdminister questionsadminister) throws SQLException {
		SqlSession session = ssf.openSession();
		QuestionAdministerDao dao = session.getMapper(QuestionAdministerDao.class); 
		int count = dao.insert(questionsadminister);
		session.commit();
		session.close(); 
		return count;
	}
	
	
}

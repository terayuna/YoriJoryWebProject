package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.yorijory.webprj.dao.NoticeDao;
import com.yorijory.webprj.dao.QuestionDao;
import com.yorijory.webprj.vo.Notice;
import com.yorijory.webprj.vo.Question;

public class MybatisQuestionDao implements QuestionDao {
	//SqlSessionFactory ssf = YojoSqlSessionFactoryBuilder.getSqlSessionFactory();
	
	@Autowired //
	private SqlSession sqlSession;

	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Question> getQuestions(int page, String field, String query) throws SQLException {
		//SqlSession session = ssf.openSession();
		QuestionDao dao = sqlSession.getMapper(QuestionDao.class); 
		List<Question> list = dao.getQuestions(page, field, query);
		//session.close();
		return list;
	}
	
	@Override
	public List<Question> getQuestions() throws SQLException {
		return getQuestions(1, "Member_Mid", "") ;
	}
	
	@Override
	public List<Question> getQuestions(int page) throws SQLException {
		return getQuestions(page, "Member_Mid", "") ;
	}
	
	@Override
	public int insert(Question question) throws SQLException {
		//SqlSession session = ssf.openSession();
		QuestionDao dao = sqlSession.getMapper(QuestionDao.class); 
		int count = dao.insert(question);
		//session.commit();
		//session.close(); 
		return count;
	}



	@Override
	public int update(Question question) throws SQLException {
		//SqlSession session = ssf.openSession();
		QuestionDao dao = sqlSession.getMapper(QuestionDao.class); 
		int count = dao.update(question);
		//session.commit();
		//session.close(); 
		return count;
	}

	@Override
	public int delete(String members_mid) throws SQLException {
		//SqlSession session = ssf.openSession();
		QuestionDao dao = sqlSession.getMapper(QuestionDao.class); 
		int count = dao.delete(members_mid);
		//session.commit();
		//session.close(); 
		return count;
	}

}

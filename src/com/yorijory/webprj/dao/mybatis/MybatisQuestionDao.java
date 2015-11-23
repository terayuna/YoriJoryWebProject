package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.QuestionDao;

import com.yorijory.webprj.vo.Question;

public class MybatisQuestionDao implements QuestionDao {
	SqlSessionFactory ssf = SqlYojoSessionFactoryBuilder.getSqlSessionFactory();


	public List<Question> getQuestions(int page, String field, String query) throws SQLException {
		SqlSession session = ssf.openSession();
		QuestionDao dao = session.getMapper(QuestionDao.class); 
		List<Question> list = dao.getQuestions(page, field, query);
		session.close();
		return list;
	}

}

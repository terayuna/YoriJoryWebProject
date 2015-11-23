package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.NoticeDao;
import com.yorijory.webprj.dao.QuestionDao;
import com.yorijory.webprj.vo.Notice;
import com.yorijory.webprj.vo.Question;

public class MybatisQuestionDao implements QuestionDao {
	SqlSessionFactory ssf = YojoSqlSessionFactoryBuilder.getSqlSessionFactory();


	public List<Question> getQuestions(int page, String field, String query) throws SQLException {
		SqlSession session = ssf.openSession();
		QuestionDao dao = session.getMapper(QuestionDao.class); 
		List<Question> list = dao.getQuestions(page, field, query);
		session.close();
		return list;
	}
	
	public int insert(Question question) throws SQLException {
		SqlSession session = ssf.openSession();
		QuestionDao dao = session.getMapper(QuestionDao.class); 
		int count = dao.insert(question);
		session.commit();
		session.close(); 
		return count;
	}

}

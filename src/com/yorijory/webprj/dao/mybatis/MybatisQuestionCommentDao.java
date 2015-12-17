package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.yorijory.webprj.dao.QuestionAdministerDao;
import com.yorijory.webprj.dao.QuestionCommentDao;
import com.yorijory.webprj.vo.QuestionAdminister;
import com.yorijory.webprj.vo.QuestionComment;

public class MybatisQuestionCommentDao implements QuestionCommentDao {
	//SqlSessionFactory ssf = YojoSqlSessionFactoryBuilder.getSqlSessionFactory();
	@Autowired //
	private SqlSession sqlSession;

	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<QuestionComment> getQuestionsComment() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<QuestionComment> getQuestionsComment(int page) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<QuestionComment> getQuestionsComment(int page, String field, String query) throws SQLException {
		//SqlSession session = ssf.openSession();
		QuestionCommentDao dao = sqlSession.getMapper(QuestionCommentDao.class); 
		List<QuestionComment> list = dao.getQuestionsComment(page, field, query);
		//session.close();
		return list;
	}

	@Override
	public int update(QuestionComment questionsComment) throws SQLException {
		//SqlSession session = ssf.openSession();
		QuestionCommentDao dao = sqlSession.getMapper(QuestionCommentDao.class); 
		int count = dao.update(questionsComment);
		//session.commit();
		//session.close(); 
		return count;
	}

	@Override
	public int delete(String members_mid) throws SQLException {
		//SqlSession session = ssf.openSession();
		QuestionCommentDao dao = sqlSession.getMapper(QuestionCommentDao.class); 
		int count = dao.delete(members_mid);
		//session.commit();
		//session.close(); 
		return count;
	}

	@Override
	public int insert(QuestionComment questionsComment) throws SQLException {
		//SqlSession session = ssf.openSession();
		QuestionCommentDao dao = sqlSession.getMapper(QuestionCommentDao.class); 
		int count = dao.insert(questionsComment);
		//session.commit();
		//session.close(); 
		return count;
	}

	
}

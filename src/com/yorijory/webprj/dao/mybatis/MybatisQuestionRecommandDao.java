package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.QuestionCommentDao;
import com.yorijory.webprj.dao.QuestionRecommandDao;
import com.yorijory.webprj.vo.QuestionComment;
import com.yorijory.webprj.vo.QuestionRecommand;

public class MybatisQuestionRecommandDao implements QuestionRecommandDao{
	SqlSessionFactory ssf = YojoSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<QuestionRecommand> getQuestionsRecommand() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<QuestionRecommand> getQuestionsRecommand(int page) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<QuestionRecommand> getQuestionsRecommand(int page, String field, String query) throws SQLException {
		SqlSession session = ssf.openSession();
		QuestionRecommandDao dao = session.getMapper(QuestionRecommandDao.class); 
		List<QuestionRecommand> list = dao.getQuestionsRecommand(page, field, query);
		session.close();
		return list;
	}

	@Override
	public int update(QuestionRecommand questionsRecommand) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String members_mid) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(QuestionRecommand questionsRecommand) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}

package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.QuestionCommentDao;
import com.yorijory.webprj.dao.QuestionReportDao;
import com.yorijory.webprj.vo.QuestionComment;
import com.yorijory.webprj.vo.QuestionReport;

public class MybatisQuestionReportDao implements QuestionReportDao{
	SqlSessionFactory ssf = YojoSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Override
	public List<QuestionReport> getQuestionsReport() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<QuestionReport> getQuestionsReport(int page) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<QuestionReport> getQuestionsReport(int page, String field, String query) throws SQLException {
		SqlSession session = ssf.openSession();
		QuestionReportDao dao = session.getMapper(QuestionReportDao.class); 
		List<QuestionReport> list = dao.getQuestionsReport(page, field, query);
		session.close();
		return list;
	}

	@Override
	public int update(QuestionReport questionsReport) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String members_mid) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(QuestionReport questionsReport) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

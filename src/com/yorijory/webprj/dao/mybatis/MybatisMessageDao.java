package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.yorijory.webprj.dao.MessageDao;
import com.yorijory.webprj.vo.Message;

public class MybatisMessageDao implements MessageDao{
	//SqlSessionFactory ssf = YojoSqlSessionFactoryBuilder.getSqlSessionFactory();
	@Autowired //
	private SqlSession sqlSession;

	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Message> getMessages() throws SQLException {
		// TODO Auto-generated method stub
		return getMessages(1, "CODE", "");
	}

	@Override
	public List<Message> getMessages(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getMessages(page, "CODE", "");
	}

	@Override
	public List<Message> getMessages(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		//SqlSession session = ssf.openSession();
		MessageDao dao = sqlSession.getMapper(MessageDao.class);
		List<Message> list = dao.getMessages(page, field, query);

		//session.close();
		return list;
	}

	@Override
	public int update(Message message) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int code) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Message message) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

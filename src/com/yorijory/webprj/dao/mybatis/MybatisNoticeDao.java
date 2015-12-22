package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.yorijory.webprj.dao.AdminDao;
import com.yorijory.webprj.dao.NoticeDao;
import com.yorijory.webprj.vo.Admin;
import com.yorijory.webprj.vo.Notice;

public class MybatisNoticeDao implements NoticeDao{	
	//SqlSessionFactory ssf = YojoSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Autowired
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Notice> getNotices() throws SQLException {
		// TODO Auto-generated method stub
		return getNotices(1, "CODE", "");
	}

	@Override
	public List<Notice> getNotices(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getNotices(page, "CODE", "");
	}

	@Override
	public List<Notice> getNotices(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		//SqlSession session = ssf.openSession();
		NoticeDao dao = sqlSession.getMapper(NoticeDao.class);
		List<Notice> list = dao.getNotices(page, field, query);

		//sqlSession.close();
		return list;
	}
	
	@Override
	public Notice getNotice(String code) {
		// TODO Auto-generated method stub
		NoticeDao dao = sqlSession.getMapper(NoticeDao.class);
		Notice notice = dao.getNotice(code);
		
		return notice;
	}
	
	@Override
	public Notice getPrevNotice(String code) {
		// TODO Auto-generated method stub
		NoticeDao dao = sqlSession.getMapper(NoticeDao.class);
		
		return dao.getPrevNotice(code);
	}

	@Override
	public Notice getNextNotice(String code) {
		// TODO Auto-generated method stub
		NoticeDao dao = sqlSession.getMapper(NoticeDao.class);
		
		return dao.getNextNotice(code);
	}

	@Override
	public int update(Notice notice) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int code) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int insert(Notice notice) {
		// TODO Auto-generated method stub
		NoticeDao dao = sqlSession.getMapper(NoticeDao.class);
		int result = 0;
		result = dao.insert(notice);
		
		return result;
	}

	@Override
	public String getLastCode() {
		//SqlSession session = ssf.openSession();
		NoticeDao dao = sqlSession.getMapper(NoticeDao.class);
		String code = dao.getLastCode();
		
		//session.close();
		
		return code;
	}
}

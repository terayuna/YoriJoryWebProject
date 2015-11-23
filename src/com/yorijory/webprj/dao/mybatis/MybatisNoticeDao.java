package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.MemberDao;
import com.yorijory.webprj.dao.NoticeDao;
import com.yorijory.webprj.vo.Member;
import com.yorijory.webprj.vo.Notice;

public class MybatisNoticeDao implements NoticeDao{
	
	SqlSessionFactory ssf = SqlYojoSessionFactoryBuilder.getSqlSessionFactory();


	@Override
	public List<Notice> getNotices(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		NoticeDao dao = session.getMapper(NoticeDao.class);
		List<Notice> list=dao.getNotices(page,field,query);
		session.close();
	
		return list;
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
	public int update(Notice notice) throws SQLException {
		SqlSession session = ssf.openSession();
		NoticeDao dao = session.getMapper(NoticeDao.class); 
		int count = dao.update(notice);
		session.commit();
		session.close(); 
		return count;
	}

	@Override
	public int delete(String mid) throws SQLException {
		SqlSession session = ssf.openSession();
		NoticeDao dao = session.getMapper(NoticeDao.class); 
		int count = dao.delete(mid);
		session.commit();
		session.close(); 
		return count;
	}

	@Override
	public int insert(Notice notice) throws SQLException {
		SqlSession session = ssf.openSession();
		NoticeDao dao = session.getMapper(NoticeDao.class); 
		int count = dao.insert(notice);
		session.commit();
		session.close(); 
		return count;
	}


}

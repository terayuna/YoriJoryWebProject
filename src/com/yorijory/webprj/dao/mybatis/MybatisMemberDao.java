package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.MemberDao;
import com.yorijory.webprj.vo.Member;

public class MybatisMemberDao implements MemberDao{
	SqlSessionFactory ssf = SqlYojoSessionFactoryBuilder.getSqlSessionFactory();
	
	@Override
	public List<Member> getMembers() throws SQLException {
		// TODO Auto-generated method stub
		return getMembers(1, "MID", "");
	}

	@Override
	public List<Member> getMembers(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getMembers(page, "MID", "");
	}

	@Override
	public List<Member> getMembers(int page, String field, String query) throws SQLException {
		SqlSession session = ssf.openSession();
		MemberDao dao = session.getMapper(MemberDao.class); 
		List<Member> list = dao.getMembers(page, field, query);
		session.close();
		return list;
	}

	@Override
	public int update(Member member) throws SQLException {
		SqlSession session = ssf.openSession();
		MemberDao dao = session.getMapper(MemberDao.class); 
		int count = dao.update(member);
		session.commit();
		session.close(); 
		return count;
	}

	@Override
	public int delete(String mid) throws SQLException {
		SqlSession session = ssf.openSession();
		MemberDao dao = session.getMapper(MemberDao.class); 
		int count = dao.delete(mid);
		session.commit();
		session.close(); 
		return count;
	}

	@Override
	public int insert(Member member) throws SQLException {
		SqlSession session = ssf.openSession();
		MemberDao dao = session.getMapper(MemberDao.class); 
		int count = dao.insert(member);
		session.commit();
		session.close(); 
		return count;
	}
	
}

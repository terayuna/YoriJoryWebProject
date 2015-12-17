package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.lf5.util.ResourceUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.yorijory.webprj.dao.NoticeFileDao;
import com.yorijory.webprj.vo.NoticeFile;



public class MybatisNoticeFileDao implements NoticeFileDao {

	//SqlSessionFactory ssf = YojoSqlSessionFactoryBuilder.getSqlSessionFactory();

	@Autowired //
	private SqlSession sqlSession;

	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<NoticeFile> getNoticeFiles(String noticeCode) {
		//SqlSession session = ssf.openSession();
		NoticeFileDao dao = sqlSession.getMapper(NoticeFileDao.class); // mapper按眉 积己
		
		List<NoticeFile> list = dao.getNoticeFiles(noticeCode);
		
		//session.close(); // 技记 辆丰.

		return list;
	}

	@Override
	public int insert(NoticeFile file) throws SQLException {
		//SqlSession session = ssf.openSession();
	      NoticeFileDao dao = sqlSession.getMapper(NoticeFileDao.class);
	      int result=0;
	      result = dao.insert(file);
	      /*try{
	    	  
	      }
	      catch(Exception e)
	      {
	         System.out.println(e.getMessage());
	         session.rollback();
	      }
	      
	      session.commit();      
	      session.close();*/
	      
	      return result;
	}


}


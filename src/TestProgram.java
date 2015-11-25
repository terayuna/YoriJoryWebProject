import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


import com.yorijory.webprj.dao.BoardAdministerDao;
import com.yorijory.webprj.dao.BoardCommentDao;
import com.yorijory.webprj.dao.BoardDao;
import com.yorijory.webprj.dao.BoardReportDao;

import com.yorijory.webprj.dao.mybatis.MybatisBoardAdministerDao;
import com.yorijory.webprj.dao.mybatis.MybatisBoardCommentDao;
import com.yorijory.webprj.dao.mybatis.MybatisBoardDao;
import com.yorijory.webprj.dao.mybatis.MybatisBoardReportDao;

import com.yorijory.webprj.dao.JdbcMemberDao;
import com.yorijory.webprj.dao.MemberDao;

import com.yorijory.webprj.dao.mybatis.MybatisMemberDao;


import com.yorijory.webprj.dao.mybatis.SqlYojoSessionFactoryBuilder;


import com.yorijory.webprj.vo.Board;
import com.yorijory.webprj.vo.BoardAdminister;
import com.yorijory.webprj.vo.BoardComment;
import com.yorijory.webprj.vo.BoardReport;

import com.yorijory.webprj.vo.Member;


public class TestProgram {

	public static void main(String[] args) throws SQLException {
		/*
		 * JdbcMemberDao dao = new JdbcMemberDao(); List<Member> list =
		 * dao.getMembers(2);
		 */

		SqlSessionFactory ssf = SqlYojoSessionFactoryBuilder.getSqlSessionFactory(); // 공장에서
																						// 세션객체
																						// 얻어옴
		SqlSession session = ssf.openSession();
		// MemberDao dao = session.getMapper(MemberDao.class); //인터페이스 구현한 클래스
		// 얻어옴

		
		 /*MemberDao dao = new MybatisMemberDao(); 
		  * List<Member> list = dao.getMembers(1, "MID", "");*/
		BoardAdministerDao dao = new MybatisBoardAdministerDao();
		List<BoardAdminister> list = dao.getBoardAdministers(1, "MEMBERS_MID", "");

		System.out.println("검색결과 : " + list.size());

		for (BoardAdminister m : list) {
			System.out.printf("mid : %s, title : %s \n", m.getMembers_Mid(), m.getBoards_Code());

		}

	}
}

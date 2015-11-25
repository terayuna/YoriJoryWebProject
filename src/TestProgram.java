
import java.sql.SQLException;
import java.util.Date;
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


import com.yorijory.webprj.dao.mybatis.YojoSqlSessionFactoryBuilder;


import com.yorijory.webprj.vo.Board;
import com.yorijory.webprj.vo.BoardAdminister;
import com.yorijory.webprj.vo.BoardComment;
import com.yorijory.webprj.vo.BoardReport;

import com.yorijory.webprj.vo.Member;


import javax.annotation.Generated;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.AdminMessageDao;
import com.yorijory.webprj.dao.mybatis.MybatisAdminMessageDao;
import com.yorijory.webprj.vo.AdminMessage;

import com.yorijory.webprj.dao.RecipesAdministerDao;
import com.yorijory.webprj.dao.RecipesCommentDao;
import com.yorijory.webprj.dao.RecipesDao;
import com.yorijory.webprj.dao.RecipesRecommandDao;
import com.yorijory.webprj.dao.RecipesReportDao;
import com.yorijory.webprj.dao.mybatis.MybatisRecipesAdministerDao;
import com.yorijory.webprj.dao.mybatis.MybatisRecipesCommentDao;
import com.yorijory.webprj.dao.mybatis.MybatisRecipesDao;
import com.yorijory.webprj.dao.mybatis.MybatisRecipesRecommandDao;
import com.yorijory.webprj.dao.mybatis.MybatisRecipesReportDao;
import com.yorijory.webprj.vo.Recipes;
import com.yorijory.webprj.vo.RecipesAdminister;
import com.yorijory.webprj.vo.RecipesComment;
import com.yorijory.webprj.vo.RecipesRecommand;

import com.yorijory.webprj.vo.RecipesReport;


import com.yorijory.webprj.vo.RecipesReport;


public class TestProgram {


	public static void main(String[] args) throws SQLException {

		 /*MemberDao dao = new MybatisMemberDao(); 
		  * List<Member> list = dao.getMembers(1, "MID", "");*/
		MemberDao dao = new MybatisMemberDao();
		List<Member> list = dao.getMembers(1, "MID", "");

		System.out.println("검색결과 : " + list.size());

		for (Member m : list) {
			System.out.printf("mid : %s, title : %s \n", m.getMid(), m.getName());

		}
	}
}

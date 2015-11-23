import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.annotation.Generated;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.AdminDao;

import com.yorijory.webprj.dao.mybatis.MybatisAdminDao;

import com.yorijory.webprj.dao.CommentDao;
import com.yorijory.webprj.dao.MemberDao;
import com.yorijory.webprj.dao.MessageDao;
import com.yorijory.webprj.dao.mybatis.MybatisCommentDao;
import com.yorijory.webprj.dao.NoticeDao;
import com.yorijory.webprj.dao.QuestionDao;
import com.yorijory.webprj.dao.mybatis.MybatisMemberDao;
import com.yorijory.webprj.dao.mybatis.MybatisMessageDao;
import com.yorijory.webprj.dao.mybatis.MybatisNoticeDao;

import com.yorijory.webprj.dao.mybatis.MybatisQuestionDao;

import com.yorijory.webprj.dao.mybatis.YojoSqlSessionFactoryBuilder;

import com.yorijory.webprj.vo.Admin;

import com.yorijory.webprj.vo.Comment;
import com.yorijory.webprj.vo.Member;
import com.yorijory.webprj.vo.Message;
import com.yorijory.webprj.vo.Notice;

import com.yorijory.webprj.vo.Question;

public class TestProgram {

	public static void main(String[] args) throws SQLException {
	
		SqlSessionFactory ssf = YojoSqlSessionFactoryBuilder.getSqlSessionFactory(); 
		SqlSession session = ssf.openSession();
		
		
/******************************여기부터 수정해서 테스트*************************************/
		
		NoticeDao dao = new MybatisNoticeDao();
		List<Notice> list = dao.getNotices(1, "TITLE", "");
		for(Notice n : list)
			System.out.printf("Title : %s, Mid : %s \n", n.getTitle(), n.getMid());


		

	}
}

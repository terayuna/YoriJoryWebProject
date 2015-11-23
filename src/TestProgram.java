import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.CommentDao;
import com.yorijory.webprj.dao.JdbcMemberDao;
import com.yorijory.webprj.dao.MemberDao;
import com.yorijory.webprj.dao.mybatis.MybatisCommentDao;
import com.yorijory.webprj.dao.mybatis.MybatisMemberDao;
import com.yorijory.webprj.dao.mybatis.SqlYojoSessionFactoryBuilder;
import com.yorijory.webprj.vo.Comment;
import com.yorijory.webprj.vo.Member;

public class TestProgram {

	public static void main(String[] args) throws SQLException {
		
		
		/*MemberDao dao = new MybatisMemberDao();
		List<Member> list = dao.getMembers(1);
		Member member = new Member();
		
		
		for(Member m : list)
		{
			System.out.printf("mid = %s, name = %s, %s\n", m.getMid(), m.getName(), m.getRegDate());
		}*/
		
		CommentDao dao = new MybatisCommentDao();
		List<Comment> list = dao.getComments(1);
		Comment comment = new Comment();
		
		
		for(Comment m : list)
		{
			System.out.printf("mid = %s, name = %s, %s\n", m.getMid(), m.getContent(), m.getRegDate());
		}
		
	}

}

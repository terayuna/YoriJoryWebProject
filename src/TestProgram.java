import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.CommentDao;
import com.yorijory.webprj.dao.JdbcMemberDao;
import com.yorijory.webprj.dao.MemberDao;
import com.yorijory.webprj.dao.MessageDao;
import com.yorijory.webprj.dao.mybatis.MybatisCommentDao;
import com.yorijory.webprj.dao.NoticeDao;
import com.yorijory.webprj.dao.mybatis.MybatisMemberDao;
import com.yorijory.webprj.dao.mybatis.MybatisMessageDao;
import com.yorijory.webprj.dao.mybatis.MybatisNoticeDao;
import com.yorijory.webprj.dao.mybatis.SqlYojoSessionFactoryBuilder;
import com.yorijory.webprj.vo.Comment;
import com.yorijory.webprj.vo.Member;
import com.yorijory.webprj.vo.Message;
import com.yorijory.webprj.vo.Notice;

public class TestProgram {

	public static void main(String[] args) throws SQLException {
	
		MessageDao dao = new MybatisMessageDao();
		List<Message> list = dao.getMessages(1);
		Message message = new Message();
		
		
		for(Message n : list)
		{
			System.out.printf("mid = %s, name = %s\n", n.getCode(), n.getTitle());
		}
	}
}

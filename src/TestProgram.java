import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.AdminMessageDao;
import com.yorijory.webprj.dao.mybatis.MybatisAdminMessageDao;
import com.yorijory.webprj.vo.AdminMessage;

public class TestProgram {

	public static void main(String[] args) throws SQLException {
	
		AdminMessageDao dao = new MybatisAdminMessageDao();
		List<AdminMessage> list = dao.getAdminMessage(1);
		AdminMessage message = new AdminMessage();
		
		for(AdminMessage n : list)
		{
			System.out.printf("mid = %s, name = %d\n", n.getMember_Mid(), n.getCode());
		}
	}
}

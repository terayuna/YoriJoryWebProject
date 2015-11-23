import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.JdbcMemberDao;
import com.yorijory.webprj.dao.MemberDao;
import com.yorijory.webprj.dao.NoticeDao;
import com.yorijory.webprj.dao.mybatis.MybatisMemberDao;
import com.yorijory.webprj.dao.mybatis.MybatisNoticeDao;
import com.yorijory.webprj.dao.mybatis.SqlYojoSessionFactoryBuilder;
import com.yorijory.webprj.vo.Member;
import com.yorijory.webprj.vo.Notice;

public class TestProgram {

	public static void main(String[] args) throws SQLException {
		/*JdbcMemberDao dao = new JdbcMemberDao();
		List<Member> list = dao.getMembers(2);*/
				
 		SqlSessionFactory ssf = SqlYojoSessionFactoryBuilder.getSqlSessionFactory(); //°øÀå¿¡¼­ ¼¼¼Ç°´Ã¼ ¾ò¾î¿È
		SqlSession session = ssf.openSession();
		//MemberDao dao = session.getMapper(MemberDao.class); //ÀÎÅÍÆäÀÌ½º ±¸ÇöÇÑ Å¬·¡½º ¾ò¾î¿È
 		
		/*MemberDao dao = new MybatisMemberDao();
		List<Member> list = dao.getMembers(1, "MID", "");*/
		NoticeDao dao2 = new MybatisNoticeDao();
		List<Notice> list2 = dao2.getNotices(1, "MID", "");
		
/*		Member upM = new Member();
		upM.setMid("GOD");
		upM.setName("Å©Å©Å©");
		upM.setPassword("333");
		dao.update(upM);
		*/
		/*Member inM = new Member();
		inM.setMid("hayun");
		inM.setName("Ä¼Ä¼");
		inM.setPassword("1234");
		dao.insert(inM);
		
		dao.delete("GOD");
	*/

		
		System.out.println("°Ë»ö°á°ú : " + list2.size());
	
		for(Notice m : list2){
			System.out.printf("mid : %s, content : %s \n", m.getMid(), m.getContent());
		}
		
		
	}

}

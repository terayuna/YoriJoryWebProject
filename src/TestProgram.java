import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.AdminDao;

import com.yorijory.webprj.dao.mybatis.MybatisAdminDao;

import com.yorijory.webprj.dao.mybatis.SqlYojoSessionFactoryBuilder;
import com.yorijory.webprj.vo.Admin;

public class TestProgram {

	public static void main(String[] args) throws SQLException {
		/*JdbcMemberDao dao = new JdbcMemberDao();
		List<Member> list = dao.getMembers(2);*/
				
 		SqlSessionFactory ssf = SqlYojoSessionFactoryBuilder.getSqlSessionFactory(); //���忡�� ���ǰ�ü ����
		SqlSession session = ssf.openSession();
		//MemberDao dao = session.getMapper(MemberDao.class); //�������̽� ������ Ŭ���� ����
 		
		/*MemberDao dao = new MybatisMemberDao();
		List<Member> list = dao.getMembers(1, "MID", "");*/
		/*NoticeDao dao2 = new MybatisNoticeDao();
		List<Notice> list2 = dao2.getNotices(1, "MID", "");*/
		AdminDao dao2 = new MybatisAdminDao();
		List<Admin> list2 = dao2.getAdmins(1, "MID", "");
		
/*		Member upM = new Member();
		upM.setMid("GOD");
		upM.setName("ũũũ");
		upM.setPassword("333");
		dao.update(upM);
		*/
		/*Member inM = new Member();
		inM.setMid("hayun");
		inM.setName("ļļ");
		inM.setPassword("1234");
		dao.insert(inM);
		
		dao.delete("GOD");
	*/

		
		System.out.println("�˻���� : " + list2.size());
	
		for(Admin m : list2){
			System.out.printf("mid : %s, password : %s \n", m.getMid(), m.getPwd());
		}
		
		
	}

}

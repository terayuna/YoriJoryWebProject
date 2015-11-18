import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.JdbcMemberDao;
import com.yorijory.webprj.dao.MemberDao;
import com.yorijory.webprj.dao.mybatis.MybatisMemberDao;
import com.yorijory.webprj.dao.mybatis.SqlYojoSessionFactoryBuilder;
import com.yorijory.webprj.vo.Member;

public class TestProgram {

	public static void main(String[] args) throws SQLException {
		JdbcMemberDao dao = new JdbcMemberDao();
		List<Member> list = dao.getMembers(2);
		
		Member upM = new Member();
		upM.setMid("mid");
		upM.setName("ũũũ");
		upM.setPassword("333");
		dao.update(upM);
		
		dao.delete("hayun");
		
/*		Member inM = new Member();
		inM.setMid("hayun12");
		inM.setName("ļļ");
		inM.setPassword("1234");
		dao.insert(inM);*/
		
		
/********************Mybatis�̿�******************************	
 		
 		SqlSessionFactory ssf = SqlYojoSessionFactoryBuilder.getSqlSessionFactory(); //���忡�� ���ǰ�ü ����
		SqlSession session = ssf.openSession();
		MemberDao dao = session.getMapper(MemberDao.class); //�������̽� ������ Ŭ���� ����
 		
		MemberDao dao = new MybatisMemberDao();
		List<Member> list = dao.getMembers(1, "MID", "");
		
		Member upM = new Member();
		upM.setMid("GOD");
		upM.setName("ũũũ");
		upM.setPassword("333");
		dao.update(upM);
		
		Member inM = new Member();
		inM.setMid("hayun");
		inM.setName("ļļ");
		inM.setPassword("1234");
		dao.insert(inM);
		
		dao.delete("GOD");
	
*****************************************************************************/
		
		System.out.println("�˻���� : " + list.size());
	
		for(Member m : list){
			System.out.printf("mid : %s, name : %s \n", m.getMid(), m.getName());
		}
		
		
	}

}


import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.*;
import com.yorijory.webprj.dao.mybatis.*;
import com.yorijory.webprj.dao.*;
import com.yorijory.webprj.vo.*;
import com.yorijory.webprj.dao.mybatis.YojoSqlSessionFactoryBuilder;

import javax.annotation.Generated;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;




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

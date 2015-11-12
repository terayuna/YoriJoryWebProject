import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.dao.MemberDao;
import com.yorijory.webprj.vo.Member;

public class TestProgram {

	public static void main(String[] args) throws SQLException {
		MemberDao dao = new MemberDao();
		List<Member> list = dao.getMembers(2);
		
	
		for(Member m : list){
			System.out.printf("mid : %s, name : %s \n", m.getMid(), m.getName());
		}

	}

}

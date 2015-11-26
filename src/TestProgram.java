
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.*;
import com.yorijory.webprj.dao.mybatis.*;
import com.yorijory.webprj.dao.*;
import com.yorijory.webprj.vo.*;

import javax.annotation.Generated;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;




public class TestProgram {
	public static void main(String[] args) throws SQLException {

		QuestionReportDao dao = new MybatisQuestionReportDao();
		List<QuestionReport> list = dao.getQuestionsReport(1, "MEMBERS_MID", "");

		System.out.println("�˻���� : " + list.size());

		for (QuestionReport m : list) {
			System.out.printf("mid : %s, title : %d \n", m.getMembers_mid(), m.getContent());
		}
	}
}

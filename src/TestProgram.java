
import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.dao.RecipesAdministerDao;
import com.yorijory.webprj.dao.RecipesCommentDao;
import com.yorijory.webprj.dao.RecipesDao;
import com.yorijory.webprj.dao.RecipesRecommandDao;
import com.yorijory.webprj.dao.RecipesReportDao;
import com.yorijory.webprj.dao.mybatis.MybatisRecipesAdministerDao;
import com.yorijory.webprj.dao.mybatis.MybatisRecipesCommentDao;
import com.yorijory.webprj.dao.mybatis.MybatisRecipesDao;
import com.yorijory.webprj.dao.mybatis.MybatisRecipesRecommandDao;
import com.yorijory.webprj.dao.mybatis.MybatisRecipesReportDao;
import com.yorijory.webprj.vo.Recipes;
import com.yorijory.webprj.vo.RecipesAdminister;
import com.yorijory.webprj.vo.RecipesComment;
import com.yorijory.webprj.vo.RecipesRecommand;
import com.yorijory.webprj.vo.RecipesReport;

public class TestProgram {


	public static void main(String[] args) throws SQLException {
		
		RecipesDao dao = new MybatisRecipesDao();
		List<Recipes> list = dao.getRecipes();
		Recipes report = new Recipes();
		
		for(Recipes r : list)
		{
			System.out.printf("mid = %s" ,r.getMember_Mid());
		}	
	
	
	}
}

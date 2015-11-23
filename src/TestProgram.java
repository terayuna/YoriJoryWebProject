import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.dao.BoardsDao;
import com.yorijory.webprj.dao.RecipesDao;
import com.yorijory.webprj.dao.mybatis.MybatisBoardsDao;
import com.yorijory.webprj.dao.mybatis.MybatisRecipesDao;
import com.yorijory.webprj.vo.Boards;
import com.yorijory.webprj.vo.Recipes;


public class TestProgram {

	public static void main(String[] args) throws SQLException {
	
		BoardsDao dao = new MybatisBoardsDao();
		List<Boards> list = dao.getBoards(1);
		Boards boards = new Boards();
		
		
		for(Boards b : list)
		{
			System.out.printf("mid = %s, name = %s\n", b.getTitle(), b.getCode());
		}
	}
}

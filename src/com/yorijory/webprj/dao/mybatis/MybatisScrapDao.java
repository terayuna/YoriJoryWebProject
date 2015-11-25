package com.yorijory.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yorijory.webprj.dao.ScrapDao;
import com.yorijory.webprj.vo.Scrap;

public class MybatisScrapDao implements ScrapDao{
	SqlSessionFactory ssf = YojoSqlSessionFactoryBuilder.getSqlSessionFactory();
	
	@Override
	public List<Scrap> getScraps() throws SQLException {
		// TODO Auto-generated method stub
		return getScraps(1, "MEMBERS_MID", "");
	}

	@Override
	public List<Scrap> getScraps(int page) throws SQLException {
		// TODO Auto-generated method stub
		return getScraps(page, "MEMBERS_MID", "");
	}

	@Override
	public List<Scrap> getScraps(int page, String field, String query) throws SQLException {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		ScrapDao dao = session.getMapper(ScrapDao.class);
		List<Scrap> list = dao.getScraps(page, field, query);

		session.close();
		return list;
	}

	@Override
	public int update(Scrap scrap) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int code) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Scrap scrape) {
		// TODO Auto-generated method stub
		return 0;
	}

}

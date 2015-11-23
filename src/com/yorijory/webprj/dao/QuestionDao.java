package com.yorijory.webprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.yorijory.webprj.vo.Member;
import com.yorijory.webprj.vo.Question;

public interface QuestionDao {
	public List<Question> getQuestions(int page, String field, String query) throws SQLException;

}

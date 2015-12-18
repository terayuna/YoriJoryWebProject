package com.yorijory.webprj.controllers;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yorijory.webprj.dao.AdminDao;
import com.yorijory.webprj.dao.BoardDao;
import com.yorijory.webprj.dao.MemberDao;
import com.yorijory.webprj.dao.NoticeDao;
import com.yorijory.webprj.dao.QuestionDao;
import com.yorijory.webprj.dao.RecipeDao;
import com.yorijory.webprj.dao.mybatis.MybatisAdminDao;
import com.yorijory.webprj.dao.mybatis.MybatisBoardDao;
import com.yorijory.webprj.dao.mybatis.MybatisMemberDao;
import com.yorijory.webprj.dao.mybatis.MybatisNoticeDao;
import com.yorijory.webprj.dao.mybatis.MybatisQuestionDao;
import com.yorijory.webprj.dao.mybatis.MybatisRecipeDao;
import com.yorijory.webprj.vo.Admin;
import com.yorijory.webprj.vo.Board;
import com.yorijory.webprj.vo.Member;
import com.yorijory.webprj.vo.Notice;
import com.yorijory.webprj.vo.Question;
import com.yorijory.webprj.vo.Recipe;


@Controller
@RequestMapping("/admin/")
public class AdminController {
	
	@Autowired
	private MemberDao memberDao;
	@Autowired
	private NoticeDao noticeDao;
	@Autowired
	private BoardDao boardDao;
	@Autowired
	private QuestionDao questionDao;
	@Autowired
	private RecipeDao recipeDao;
	
	@RequestMapping("admin")
	private String admin(PrintWriter out, Model model) throws SQLException {
		MemberDao dao = new MybatisMemberDao();
		List<Member> list = memberDao.getMembers(1, "MID", "");
		
		model.addAttribute("mlist", list);
		
		for(Member n : list){
			out.println("MID : " + n.getMid());
		}
		return "admin/admin";
	}
	
	@RequestMapping("adminNotices")
	private String adminNotices(PrintWriter out, Model model) throws SQLException {
		NoticeDao dao = new MybatisNoticeDao();
		List<Notice> list = noticeDao.getNotices(1, "TITLE", "");
		
		model.addAttribute("nlist", list);
		
		for(Notice n : list){
			out.println("TITLE : " + n.getTitle());
		}
		return "admin/adminNotices";
	}
	
	@RequestMapping("adminBoards")
	private String adminBoard(PrintWriter out, Model model) throws SQLException {
		BoardDao dao = new MybatisBoardDao();
		List<Board> list = boardDao.getBoards(1, "TITLE", "");
		
		model.addAttribute("blist", list);
		
		for(Board n : list){
			out.println("TITLE : " + n.getTitle());
		}
		return "admin/adminBoards";
	}
	
	@RequestMapping("adminQA")
	private String adminQA(PrintWriter out, Model model) throws SQLException {
		QuestionDao dao = new MybatisQuestionDao();
		List<Question> list = questionDao.getQuestions(1, "TITLE", "");
		
		model.addAttribute("qlist", list);
		
		for(Question n : list){
			out.println("TITLE : " + n.getTitle());
		}
		return "admin/adminQA";
	}
	
	@RequestMapping("adminRecipes")
	private String adminRecipes(PrintWriter out, Model model) throws SQLException {
		RecipeDao dao = new MybatisRecipeDao();
		List<Recipe> list = recipeDao.getRecipes(1, "TITLE", "");
		
		model.addAttribute("rlist", list);
		
		for(Recipe n : list){
			out.println("TITLE : " + n.getTitle());
		}
		return "admin/adminRecipes";
	}
	
}

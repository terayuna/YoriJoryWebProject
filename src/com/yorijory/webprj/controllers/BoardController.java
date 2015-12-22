package com.yorijory.webprj.controllers;

import java.io.PrintWriter;
import java.security.Principal;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yorijory.webprj.dao.BoardDao;
import com.yorijory.webprj.dao.mybatis.MybatisBoardDao;
import com.yorijory.webprj.vo.Board;


@Controller
@RequestMapping("/board/")
public class BoardController {
	
	@Autowired
	private BoardDao boardDao;
	
	
	@RequestMapping("board")
	private String adminBoard(PrintWriter out, Model model) throws SQLException {
		BoardDao dao = new MybatisBoardDao();
		List<Board> list = boardDao.getBoards(1, "TITLE", "");
		
		model.addAttribute("blist", list);
		
		for(Board n : list){
			out.println("TITLE : " + n.getTitle());
		}
		return "board/board";
	}
	
	@RequestMapping(value="boardReg", method=RequestMethod.GET)
	public String BoardReg(HttpSession session)
	{
		/*if(session.getAttribute("mid") == null)
			return "redirect:../joinus/login?returnUrl=/customer/noticeReg";*/
		
		return "board/boardReg"; // view를 제공해야 하지만
	}
	
	@RequestMapping(value="boardReg", method=RequestMethod.POST)
	public String BoardReg(HttpServletRequest request, Board n) throws SQLException
	{
		Principal principal = request.getUserPrincipal();
		String userName = principal.getName();
		n.setMembers_Mid(userName);
		boardDao.insert(n);
		
		
		System.out.println("title : "+n.getTitle());
		System.out.println("content : "+n.getContent());
		System.out.println("writer : "+n.getMembers_Mid());
		
		return "redirect:board"; // 다른 Controller로 가야 한다
	}
	
}

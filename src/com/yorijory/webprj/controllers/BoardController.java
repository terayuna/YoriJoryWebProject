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

import com.yorijory.webprj.dao.BoardCommentDao;
import com.yorijory.webprj.dao.BoardDao;
import com.yorijory.webprj.dao.mybatis.MybatisBoardDao;
import com.yorijory.webprj.vo.Board;
import com.yorijory.webprj.vo.BoardComment;


@Controller
@RequestMapping("/board/")
public class BoardController {
	
	@Autowired
	private BoardDao boardDao;
	@Autowired
	private BoardCommentDao boardCommentDao;
	
	
	@RequestMapping("board")
	private String adminBoard(String pg, String f, String q,PrintWriter out, Model model) throws SQLException {
		//BoardDao dao = new MybatisBoardDao();
		
		int page  = 1;
		String field = "TITLE";
		String query = "";
		
		  if(pg!=null && !pg.equals("")){
			  page = Integer.parseInt(pg);
		  }
		  
		  if(f!=null && !f.equals("")){
			  field = f;
		  }
		  
		  if(q!=null && !q.equals("")){
			  query = q;
		  }
		  
		  
		List<Board> list = boardDao.getBoards(page, field, query);
		
		int recordCount = boardDao.getBoardCount(field, query);
		
		model.addAttribute("blist", list);
		model.addAttribute("recordCount", recordCount);
		
		/*for(Board n : list){
			out.println("TITLE : " + n.getTitle());
		}*/
		return "board/board";
	}
	
	@RequestMapping("boardDetail")
	public String boardDetail(String c, Model model) throws SQLException {
		
		Board board = boardDao.getBoard(c);
		Board prev = boardDao.getPrevBoard(c);
		Board next = boardDao.getNextBoard(c);
		
		model.addAttribute("board", board);
		model.addAttribute("prev", prev);
		model.addAttribute("next", next);
		model.addAttribute("c", c);
		
		List<BoardComment> clist = boardCommentDao.getBoardComments(1, c);
		model.addAttribute("bclist", clist);
		
		return "board/boardDetail";
	}
	
	@RequestMapping(value="boardReg", method=RequestMethod.GET)
	public String boardReg(HttpSession session)
	{
		/*if(session.getAttribute("mid") == null)
			return "redirect:../joinus/login?returnUrl=/customer/noticeReg";*/
		
		return "board/boardReg"; // view를 제공해야 하지만
	}
	
	@RequestMapping(value="boardReg", method=RequestMethod.POST)
	public String boardReg(HttpServletRequest request, Board n) throws SQLException
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
	
	@RequestMapping(value="boardCommentReg", method=RequestMethod.POST)
	public String boardCommentReg(HttpServletRequest request, BoardComment n, String c) throws SQLException
	{
		Principal principal = request.getUserPrincipal();
		String userName = principal.getName();
		
		n.setMembers_Mid(userName);
		n.setBoards_Code(c);
		System.out.println(c);
		boardCommentDao.insert(n);
		
		System.out.println("content : "+n.getContent());
		System.out.println("Boards_Code : "+n.getBoards_Code());
		System.out.println("Members_Mid : "+n.getMembers_Mid());
		
		
		return "redirect:boardDetail?c="+c; // 다른 Controller로 가야 한다
	}
}

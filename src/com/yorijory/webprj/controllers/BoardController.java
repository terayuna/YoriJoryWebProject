package com.yorijory.webprj.controllers;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	
}

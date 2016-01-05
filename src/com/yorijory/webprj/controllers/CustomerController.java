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

import com.yorijory.webprj.dao.NoticeDao;
import com.yorijory.webprj.vo.Notice;

@Controller
@RequestMapping("/customer/")
public class CustomerController {
	
	@Autowired
	private NoticeDao noticeDao;
	
	@RequestMapping("notice")
	public String notice(String pg, String f, String q, PrintWriter out, Model model) throws SQLException{
		out.println("hello!!!!!!!!!!!!!!!!");
		/*NoticeDao dao = new MyBatisNoticeDao();*/
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
		
		List<Notice> list = noticeDao.getNotices(page, field,query);
		
		model.addAttribute("list", list);
		//model.addAttribute("n", list.get(0));
		
		/*for(Notice n : list){
			out.println("title : " + n.getTitle());
		}*/
		
		return "customer/notice";
	}
	
	@RequestMapping("noticeDetail")
	public String noticeDetail(String c, Model model) {
		
		Notice notice = noticeDao.getNotice(c);
		Notice prev = noticeDao.getPrevNotice(c);
		Notice next = noticeDao.getNextNotice(c);
		
		model.addAttribute("notice", notice);
		model.addAttribute("prev", prev);
		model.addAttribute("next", next);
		
		return "customer/noticeDetail";
	}
	
	@RequestMapping(value="noticeReg", method=RequestMethod.GET)
	public String noticeReg(HttpSession session)
	{
		/*if(session.getAttribute("mid") == null)
			return "redirect:../joinus/login?returnUrl=/customer/noticeReg";*/
		
		return "customer/noticeReg"; // view를 제공해야 하지만
	}
	
	@RequestMapping(value="noticeReg", method=RequestMethod.POST)
	public String noticeReg(HttpServletRequest request, Notice n) throws SQLException
	{
		Principal principal = request.getUserPrincipal();
		String userName = principal.getName();
		n.setAdmin_Mid(userName);
		noticeDao.insert(n);
		
		
		System.out.println("title : "+n.getTitle());
		System.out.println("content : "+n.getContent());
		System.out.println("writer : "+n.getAdmin_Mid());
		
		return "redirect:notice"; // 다른 Controller로 가야 한다
	}
	
	@RequestMapping("noticeEdit")
	public String noticeEdit(String code, HttpSession session)
	{
		/*if(session.getAttribute("mid") == null)
			return "redirect:../joinus/login?returnUrl=/customer/noticeReg";*/
		
		return "customer/noticeEdit";
	}
}

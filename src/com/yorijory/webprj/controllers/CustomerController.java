package com.yorijory.webprj.controllers;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

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
	public String notice(PrintWriter out, Model model) throws SQLException{
		out.println("hello!!!!!!!!!!!!!!!!");
		/*NoticeDao dao = new MyBatisNoticeDao();*/
		List<Notice> list = noticeDao.getNotices(1, "Title","");
		
		model.addAttribute("list", list);
		//model.addAttribute("n", list.get(0));
		
		/*for(Notice n : list){
			out.println("title : " + n.getTitle());
		}*/
		
		return "customer/notice";
	}
	
	@RequestMapping("noticeDetail")
	public String bb(PrintWriter out) {
		return "customer/noticeDetail";
	}
	
	@RequestMapping(value="noticeReg", method=RequestMethod.GET)
	public String noticeReg(HttpSession session)
	{
		/*if(session.getAttribute("mid") == null)
			return "redirect:../joinus/login?returnUrl=/customer/noticeReg";*/
		
		return "customer/noticeReg"; // view�� �����ؾ� ������
	}
	
	@RequestMapping(value="noticeReg", method=RequestMethod.POST)
	public String noticeReg(Notice n) throws SQLException
	{
		
		
		noticeDao.insert(n);
		
		System.out.println("title : "+n.getTitle());
		System.out.println("content : "+n.getContent());
		
		return "redirect:notice"; // �ٸ� Controller�� ���� �Ѵ�
	}
	
	@RequestMapping("noticeEdit")
	public String noticeEdit(String code, HttpSession session)
	{
		/*if(session.getAttribute("mid") == null)
			return "redirect:../joinus/login?returnUrl=/customer/noticeReg";*/
		
		return "customer/noticeEdit";
	}
}

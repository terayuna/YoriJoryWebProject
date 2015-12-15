package com.yorijory.webprj.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yorijory.webprj.dao.MemberDao;



@Controller
@RequestMapping("/joinus/")
public class JoinusController {
	
	@Autowired
	private MemberDao memberDao;
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String login()
	{
		return "joinus/login";
	}
	
	/*@RequestMapping(value="login", method=RequestMethod.POST)
	public String login(@Param("user-name") String userName, String password, Model model, HttpSession session)
	{
		Member m = memberDao.getMember(userName);
		
		String error = null;
		
		if(m == null) // 회원이 존재하지 않는다면
			error = "사용자 아이디 또는 비밀번호가 올바르지 않습니다.";
		else if(!m.getPwd().equals(password)) // 회원이 존재하지만 비밀번호가 일치하지 않는다면
			error = "사용자 아이디 또는 비밀번호가 올바르지 않습니다.";
		
		if(error != null)
		{
			model.addAttribute("error", error);
			return "joinus/login";
		}
		
		// 인증 성공
		// 인증 정보를 저장 어디에???(session? cookie?)
		session.setAttribute("mid", userName);
		return "redirect:customer/notice";
	}*/
}

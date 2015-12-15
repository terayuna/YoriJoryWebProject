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
		
		if(m == null) // ȸ���� �������� �ʴ´ٸ�
			error = "����� ���̵� �Ǵ� ��й�ȣ�� �ùٸ��� �ʽ��ϴ�.";
		else if(!m.getPwd().equals(password)) // ȸ���� ���������� ��й�ȣ�� ��ġ���� �ʴ´ٸ�
			error = "����� ���̵� �Ǵ� ��й�ȣ�� �ùٸ��� �ʽ��ϴ�.";
		
		if(error != null)
		{
			model.addAttribute("error", error);
			return "joinus/login";
		}
		
		// ���� ����
		// ���� ������ ���� ���???(session? cookie?)
		session.setAttribute("mid", userName);
		return "redirect:customer/notice";
	}*/
}

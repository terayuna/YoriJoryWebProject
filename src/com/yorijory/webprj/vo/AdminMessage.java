package com.yorijory.webprj.vo;

import java.util.Date;

public class AdminMessage {
	private String admin_Mid;
	private String member_Mid;
	private String title;
	private String content;
	private String code;
	private Date regDate;
	
	public String getAdmin_Mid() {
		return admin_Mid;
	}
	public void setAdmin_Mid(String admin_Mid) {
		this.admin_Mid = admin_Mid;
	}
	public String getMember_Mid() {
		return member_Mid;
	}
	public void setMember_Mid(String member_Mid) {
		this.member_Mid = member_Mid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
}

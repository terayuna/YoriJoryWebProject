package com.yorijory.webprj.vo;

import java.util.Date;

public class Notice {
	private String admin_Mid;
	private String title;
	private String content;
	private int code;
	private int hit;
	private Date regDate;
	
	public String getAdmin_Mid() {
		return admin_Mid;
	}
	public void setAdmin_Mid(String admin_Mid) {
		this.admin_Mid = admin_Mid;
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
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
}

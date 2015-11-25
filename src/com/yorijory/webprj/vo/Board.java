package com.yorijory.webprj.vo;

import java.util.Date;

public class Board {
	private String title;
	private int code;
	private String content;
	private String members_Mid;
	private Date regDate;
	private int hit;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getMembers_Mid() {
		return members_Mid;
	}
	public void setMembers_Mid(String members_Mid) {
		this.members_Mid = members_Mid;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
}

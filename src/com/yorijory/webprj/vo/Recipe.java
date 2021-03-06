package com.yorijory.webprj.vo;

import java.util.Date;

public class Recipe {
	private String code;
	private String title;
	private String members_Mid;
	private String content;
	private Date regDate;
	private String type;
	private int hit;

	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getMembers_Mid() {
		return members_Mid;
	}
	public void setMembers_Mid(String members_Mid) {
		this.members_Mid = members_Mid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}

}

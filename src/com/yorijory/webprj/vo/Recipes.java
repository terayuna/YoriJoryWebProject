package com.yorijory.webprj.vo;

import java.util.Date;

public class Recipes {
	private int code;
	private String title;
	private String Member_Mid;
	private String content;
	private Date regDate;
	private String type;
	private int hit;

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getMember_Mid() {
		return Member_Mid;
	}
	public void setMember_Mid(String member_Mid) {
		Member_Mid = member_Mid;
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

package com.yorijory.webprj.vo;

import java.util.Date;

public class RecipesComment {
	private String mid;
	private String content;
	private Date regDate;
	private int code;
	private int recipes_code;
	
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
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
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getRecipes_code() {
		return recipes_code;
	}
	public void setRecipes_code(int recipes_code) {
		this.recipes_code = recipes_code;
	}
	
	
}

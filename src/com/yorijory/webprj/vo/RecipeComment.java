package com.yorijory.webprj.vo;

import java.util.Date;

public class RecipeComment {
	private String mid;
	private String content;
	private Date regDate;
	private String code;
	private String recipes_Code;
	
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getRecipes_Code() {
		return recipes_Code;
	}
	public void setRecipes_Code(String recipes_Code) {
		this.recipes_Code = recipes_Code;
	}
	
	
	
}

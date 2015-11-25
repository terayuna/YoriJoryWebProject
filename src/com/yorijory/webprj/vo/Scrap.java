package com.yorijory.webprj.vo;

import java.util.Date;

public class Scrap {
	private String member_Mid;
	private int code;
	private int recipes_Code;
	private Date regDate;
	
	public String getMember_Mid() {
		return member_Mid;
	}
	public void setMember_Mid(String member_Mid) {
		this.member_Mid = member_Mid;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getRecipes_Code() {
		return recipes_Code;
	}
	public void setRecipes_Code(int recipes_Code) {
		this.recipes_Code = recipes_Code;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
}

package com.yorijory.webprj.vo;

import java.util.Date;

public class BoardComment {
	private String members_Mid;
	private String content;
	private Date regDate;
	private String code;
	private String boards_Code;
	
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getBoards_Code() {
		return boards_Code;
	}
	public void setBoards_Code(String boards_Code) {
		this.boards_Code = boards_Code;
	}
	
	
	
}

package com.yorijory.webprj.vo;

import java.util.Date;

public class BoardReport {
	private String mid;
	private String code;
	private Date regDate;
	private String content;
	private String boards_Code;
	
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
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
	public String getBoards_Code() {
		return boards_Code;
	}
	public void setBoards_Code(String boards_Code) {
		this.boards_Code = boards_Code;
	}

	
}

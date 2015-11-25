package com.yorijory.webprj.vo;

import java.util.Date;

public class BoardReport {
	private String mid;
	private int code;
	private Date regDate;
	private String content;
	private int boards_Code;
	
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
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
	public int getBoards_Code() {
		return boards_Code;
	}
	public void setBoards_Code(int boards_Code) {
		this.boards_Code = boards_Code;
	}
	
}

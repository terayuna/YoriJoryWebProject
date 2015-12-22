package com.yorijory.webprj.vo;

import java.util.Date;

public class Message {
	private String title;
	private String content;
	private String send_Mid;
	private String receive_Mid;
	private Date regDate;
	private String code;
	
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
	public String getSend_Mid() {
		return send_Mid;
	}
	public void setSend_Mid(String send_Mid) {
		this.send_Mid = send_Mid;
	}
	public String getReceive_Mid() {
		return receive_Mid;
	}
	public void setReceive_Mid(String receive_Mid) {
		this.receive_Mid = receive_Mid;
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
	
	
}

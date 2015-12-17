package com.yorijory.webprj.vo;

import java.util.Date;

public class Notice {
	private String admin_Mid;
	private String title;
	private String content;
	private String writer;
	private String code;
	private int hit;
	private Date regDate;
	private String writerName;
	private int comtCount;
	public String getAdmin_Mid() {
		return admin_Mid;
	}
	public void setAdmin_Mid(String admin_Mid) {
		this.admin_Mid = admin_Mid;
	}
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
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	public int getComtCount() {
		return comtCount;
	}
	public void setComtCount(int comtCount) {
		this.comtCount = comtCount;
	}
	
	
}

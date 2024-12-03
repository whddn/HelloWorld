package com.yedam.board;

import java.util.Date;

/*
 * 게시글 번호, 제목, 내용, 작성자, 등록일시
 */

public class Board {
	private int bno; // 게시글 번호
	private String title; //제목
	private String content; //내용
	private String writer; // 작성자(회원아이디)
	private Date writeDate; // 등록일시
	
	// 생성자
	public Board(int bno, String title, String content, String writer, Date writeDate) {
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.writeDate = writeDate;
	}
	
	// getter, setter 메소드.
	
	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
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

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	
	public String showInfo() { //목록보여줄 메소드
		String yyyymmdd = (writeDate.getYear()+1900) + "-" + (writeDate.getMonth()+1) + "-" + writeDate.getDate() + " "
				+ writeDate.getHours() + ":" + writeDate.getMinutes() + ":" + writeDate.getSeconds();
		return " " + bno + "  " + title + "  " + content + "  " + writer + "  " + yyyymmdd;
	}
}

package com.biz.exam.domain;

public class BBsVO {

	private int seq;			// 순번
	private String date;		// 작성일자
	private String auth;		// 작성자
	private String subject;		// 제목
	private String text;		// 내용
	private int count;		// 조회수
	
	
	// 기본생성자
	public BBsVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	// 필드 생성자
	public BBsVO(int seq, String date, String auth, String subject, String text, int count) {
		super();
		this.seq = seq;
		this.date = date;
		this.auth = auth;
		this.subject = subject;
		this.text = text;
		this.count = count;
	}
	
	// Getter and Setter
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "BBsVO [seq=" + seq + ", date=" + date + ", auth=" + auth + ", subject=" + subject + ", text=" + text
				+ ", count=" + count + "]";
	}

	
	
	
}

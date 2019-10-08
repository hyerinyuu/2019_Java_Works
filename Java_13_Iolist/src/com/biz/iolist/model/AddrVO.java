package com.biz.iolist.model;

/*
 * class를 작성할 때, 혹시 필요에 의해서 매개변수가 있는 생성자(==>필드생성자)
 * 						를 만들게 되면
 * 기본생성자(Super생성자)는 자동으로 만들어지지않는다.
 */
public class AddrVO {

	private int num;
	
	// 기본 생성자, Super 생성자
	public AddrVO() {
		
	}
	
	// 필드 생성자
	public AddrVO(int num) {
		this.num = num;
		
	}
	
}

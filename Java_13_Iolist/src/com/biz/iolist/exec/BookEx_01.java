package com.biz.iolist.exec;

import com.biz.iolist.model.BookVO;

// 이 클래스도 자동으로 Object class를 상속받아
// 보이지는 않지만 extends Object가 되어있다. 
public class BookEx_01  {

	public static void main(String[] args) {

		/*
		 * [Meaning]
		 * 1. BookVO 클래스를 사용하여 vo 객체를 선언하고
		 * 2. BOOkVO 클래스에 (자동으로) 작성되어있는
		 * 		BookVO() (생성자) method를 호출하여
		 * 		vo 객체를 사용할 수 있도록 생성, 초기화하라
		 * [생성자 method가 하는 일들]
		 * 1. 멤버변수(필드) 생성
		 */
		BookVO vo = new BookVO(null);
		
		
	}

}

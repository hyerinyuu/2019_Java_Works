package com.biz.classes.book;

public class Book {

	public static String strName;
	public static String strPub;
	public static String strAut;
	public static int intPri;
	
	public void booklist() {
		System.out.println("도서명 : "+ strName);
		System.out.println("출판사 : " + strPub);
		System.out.println(" 저자  : " + strAut);
		System.out.println(" 가격  : " + (intPri) + "원" );

	}
	
}

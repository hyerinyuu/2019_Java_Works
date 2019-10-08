package com.biz.classes.book;

public class BookInfo {

	public static void main(String[] args) {

		Book bookinfo = new Book();
		
		bookinfo.strName = "책";
		bookinfo.strPub = "우리출판사";
		bookinfo.strAut = "김땡땡";
		bookinfo.intPri = 20000;
		
		System.out.println("===========================");
		System.out.println("도서정보");
		System.out.println("---------------------------");
	
		
		bookinfo.booklist();
		
		System.out.println("=============================");
		
		
	}

}

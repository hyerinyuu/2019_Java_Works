package com.biz.books.service;

import java.util.List;

import com.biz.books.domain.BookVO;

public class BookViewServiceV1 {
	
	List<BookVO> bookList;
	
	// 외부에서 bookList를 주입받는 method
	public void setBookList(List<BookVO> bookList) {
		
		this.bookList = bookList;
	}
	
	// 도서명으로 검색을 하여
	// 해당하는 문자열이 포함된 리스트만 보여주기
	public void searchT(String text) {
		
		this.listTitle();
		
		for(BookVO bookVO : bookList) {
			
			// contains() : 문자열이 포함되어있냐 
			// trim() : 여백이 있으면 잘라줌
			if(bookVO.getB_title().contains(text.trim())) {

				this.body(bookVO);
			
			}
		}
		
	}
	
	// 가격 범위를 지정해서 검색
	public void searchP(int startPrice, int endPrice) {
		
		this.listTitle();
		
		for(BookVO bookVO : bookList) {
			// contains() : 문자열이 포함되어있냐 
			// trim() : 여백이 있으면 잘라줌
			int price = bookVO.getB_price();
			if(price >= startPrice && price <= endPrice) {

				this.body(bookVO);
			
			}
		}
		
	}
	
	
	private void listTitle() {
		
		System.out.println("==================================================================================");
		System.out.println("도서정보.v1");
		System.out.println("==================================================================================");
		System.out.println("ISBN\t\t도서명\t\t출판사\t저자\t가격");
		System.out.println("----------------------------------------------------------------------------------");
		
	}
	
	private void body(BookVO bookVO) {
		
		System.out.print(bookVO.getB_isbn() + "\t");
		System.out.print(bookVO.getB_title() + "\t");
		System.out.print(bookVO.getB_comp() + "\t");
		System.out.print(bookVO.getB_writer() + "\t");
		System.out.print(bookVO.getB_price() + "\n");
	}
	
	
	public void view() {
		
		this.listTitle();
		
		for(BookVO bookVO : bookList) {
			
			this.body(bookVO);
			/*
			System.out.printf("%s\t%s\t%s\t%s\t%d\n",
					bookVO.getB_isbn(), 
					bookVO.getB_title(), 
					bookVO.getB_comp(), 
					bookVO.getB_writer(),
					bookVO.getB_price());
			
			*/ 
			System.out.println("==================================================================================");
			
		}
		
	}
}

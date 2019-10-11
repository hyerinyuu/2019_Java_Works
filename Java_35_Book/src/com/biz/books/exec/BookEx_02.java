package com.biz.books.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.books.domain.BookVO;
import com.biz.books.service.BookReadServiceV1;
import com.biz.books.service.BookViewServiceV1;

public class BookEx_02 {

	public static void main(String[] args) {

		String bookFile = "src/com/biz/books/도서정보.txt";
		
		BookReadServiceV1 bRead = new BookReadServiceV1();
		BookViewServiceV1 bView = new BookViewServiceV1();
		
		
		try {
			bRead.readBookInfo(bookFile);
			List<BookVO> bookList = bRead.getbookList();
			
			bView.setBookList(bookList);
			// bView.view();
			// bView.search("책");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

package com.biz.books.exec;

import com.biz.books.service.BookReadServiceV1;

public class BookEx_01 {

	public static void main(String[] args) {

		BookReadServiceV1 bV1 = new BookReadServiceV1();

		String bookFile = "src/com/biz/books/도서정보.txt";
		
		try {
			bV1.readBookInfo(bookFile);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

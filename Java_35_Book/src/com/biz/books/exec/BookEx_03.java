package com.biz.books.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.books.domain.BookVO;
import com.biz.books.service.BookReadServiceV1;
import com.biz.books.service.BookViewServiceV1;

public class BookEx_03 {

	public static void main(String[] args) {

		String bookFile = "src/com/biz/books/도서정보.txt";
		
		BookReadServiceV1 bRead = new BookReadServiceV1();
		BookViewServiceV1 bView = new BookViewServiceV1();
		Scanner scan = new Scanner(System.in);
		
		try {
			bRead.readBookInfo(bookFile);
			List<BookVO> bookList = bRead.getbookList();
			
			bView.setBookList(bookList);
			// bView.view();
			// bView.searchT("책");
			// bView.searchP(10000, 12000);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(true) {
			System.out.println("==================================================================================");
			System.out.println("도서검색");
			System.out.println("==================================================================================");
			System.out.println("1.제목           2.가격            0.종료");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.print("선택 >> ");
			
			String strM = scan.nextLine();
			int intM = Integer.valueOf(strM);
			if(intM == 0) break;
			if(intM == 1 ) {
				System.out.print("찾으시는 책의 제목을 입력하세요 >> ");
				String text = scan.nextLine();
				bView.searchT(text);

			}else if(intM == 2) {
				System.out.print("최저가격 >> ");
				String strSP = scan.nextLine();
				
				System.out.print("최고가격 >> ");
				String strEP = scan.nextLine();
				
				try {
					bView.searchP(
							Integer.valueOf(strSP),
							Integer.valueOf(strEP));
				} catch (Exception e) {
					
					System.out.println("가격은 숫자형식으로 입력하세요");
					
				}
				
			}
			
			
			
		}
		
		System.out.println("업무종료!!!");
		
	}

}

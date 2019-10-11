package com.biz.books.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.books.domain.BookVO;
import com.biz.books.service.BookReadServiceV1;
import com.biz.books.service.BookSaveServiceV1;
import com.biz.books.service.BookViewServiceV1;

public class BookEx_04 {

	public static void main(String[] args) {

		String bookFile = "src/com/biz/books/도서정보.txt";
		String bookSavePath = "src/com/biz/books/";
		
		BookReadServiceV1 bRead = new BookReadServiceV1();
		BookViewServiceV1 bView = new BookViewServiceV1();
		BookSaveServiceV1 bSave = new BookSaveServiceV1();
		Scanner scan = new Scanner(System.in);
		
		try {
			bRead.readBookInfo(bookFile);
			List<BookVO> bookList = bRead.getbookList();
			
			bView.setBookList(bookList);
			// bView.view();
			// bView.searchT("책");
			// bView.searchP(10000, 12000);
			
			bSave.setBookList(bookList);
			
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
				String strTitle = scan.nextLine();
				bView.searchT(strTitle);
				
				System.out.print("파일로 저장하시겠습니까??(Y/N) >> ");
				String sOK = scan.nextLine();
				if(sOK.equals("Y")) {
					try {
						bSave.print(bookSavePath + strTitle + ".txt", strTitle);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}else if(intM == 2) {
				System.out.print("최저가격 >> ");
				String strSP = scan.nextLine();
				
				System.out.print("최고가격 >> ");
				String strEP = scan.nextLine();
				
				try {
					bView.searchP(
							Integer.valueOf(strSP),
							Integer.valueOf(strEP));
					
					System.out.print("파일로 저장하시겠습니까??(Y/N) >> ");
					String sOK = scan.nextLine();
					if(sOK.equals("Y")) {
						try {
							bSave.print(bookSavePath + strSP + "-" + strEP + ".txt",
									Integer.valueOf(strSP),
									Integer.valueOf(strEP));
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
					
						}
					}

					
				} catch (Exception e) {
					
					System.out.println("가격은 숫자형식으로 입력하세요");
					
				}
				
			}
			
			
			
		}
		
		System.out.println("업무종료!!!");
		
	}

}

package com.biz.books.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.books.domain.BookVO;

/*
 * 도서정보.txt파일을 읽어서
 * 문자열을 콜론(:)을 기준으로 분리하고
 * BookVO에 담은 후 bookList에 추가하는 method 작성
 */
public class BookReadServiceV1 {

	private List<BookVO> bookList;
	
	// bookList를 private처리하고 밖에서 bookList를 가져갈 수 있도록 return처리
	public List<BookVO> getbookList(){
		return bookList;
	}
	
	public void readBookInfo(String bookFile) throws Exception {
		
		bookList = new ArrayList<BookVO>();
		
		// 9791186805732:비즈니스북스:나는 왜 작은 일에도 상처받을까:다장쥔궈:오수현:2017-06-26:312:14500 
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		fileReader = new FileReader(bookFile);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		
		// int lineNum >> Ex_01하다가 오류나면 도서정보.txt의 몇번째줄에서 오류가 났는지 확인하기위해 더한 코드
	//	int lineNum = 0;
		while(true) {
		
	//		System.out.println(++lineNum);
			
			String s = "1000  ";
			s = s.trim(); // 앞뒤 빈칸 제거
			int p = Integer.valueOf(s);
			
			reader = buffer.readLine();
			if(reader == null) break;
			
			String[] books = reader.split(":");
			
			// isbn : b_comp : b_name : b_writer : b_trans : b_date : b_page : b_price
			
			// BookSettrings를 이용하는 방법
			
			BookVO bookVO = new BookVO();
		
			bookVO.setB_isbn(books[0]);
			bookVO.setB_comp(books[1]);
			bookVO.setB_title(books[2]);
			bookVO.setB_writer(books[3]);
			bookVO.setB_trans(books[4]);
			bookVO.setB_date(books[5]);
		
			// BookSettings를 이용하는 방법 ==> 파일의 순서를 무시해도 오류가 안나서 
			// 코드는 조금 길어지지만 오류발생확률이 상대적으로 훨씬 적음
			/*
			bookVO.setB_isbn(books[BookSettings.FILE.ISBN]);
			bookVO.setB_comp(books[BookSettings.FILE.COMP]);
			bookVO.setB_title(books[BookSettings.FILE.TITLE]);
			bookVO.setB_writer(books[BookSettings.FILE.WRITER]);
			bookVO.setB_trans(books[BookSettings.FILE.TRANS]);
			bookVO.setB_date(books[BookSettings.FILE.DATE]);
			
			int price = Integer.valueOf(books[BookSettings.FILE.PRICE]);
			int page = Integer.valueOf(books[BookSettings.FILE.PAGE]);
			*/
			
			int intPrice = 0;
			int intPage = 0;
			
			String strPage = books[6].trim();
			intPage = Integer.valueOf(strPage);
			bookVO.setB_page(intPage);
			
			String strPrice = books[7].trim();
			intPrice = Integer.valueOf(strPrice);
			bookVO.setB_price(intPrice);
	
			
			bookList.add(bookVO);
		}
		buffer.close();
		fileReader.close();
		
	}
	
	
	
}

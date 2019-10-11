package com.biz.books.service;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import com.biz.books.domain.BookVO;

/*
 * text파일은 java에서 기본적으로 읽고 쓰기(저장)이 가능하다
 * 그 외 Binary file(이미지, 영상, 음성, 엑셀 등등)들은 기본적으로
 * 읽기는 가능하지만 읽어서 무엇인가 연산처리를 하는 것은 매우 어렵다.
 * 또 형식에 맞도록 저장하는 것도 매우 어렵다.
 * 
 * Binary file을 읽고 쓰는데는 
 * 			3rd Party SDK(Software Developer Kit) 빌려와서 사용해야 한다.
 * 
 * 엑셀 저장하기 기능은 text파일 저장하기를 조금 응용하면
 * 아쉬운대로 사용이 가능하다.
 */
public class ExcelSaveServiceV1 {

	private List<BookVO> bookList;
	//comma separated values(컴마로 분리된 파일)
	private String excelExt = ".csv";
	
	int listSize = 10;
	
	// FileWriter fileWriter;
	BufferedWriter buffer;
	
	public void setBookList(List<BookVO> bookList) {
		this.bookList = bookList;
	}
	
	private void bufferOpen(String fileName) throws IOException {
		
		// == 파일이름.csv로 만들겠음
		// fileWriter = new FileWriter(fileName + excelExt);
		
		// 한글 encoding을 변환(excel이 아직 utf-8을 지원 안해서 fileWriter을 쓰면 한글 깨져서 나옴)
		FileOutputStream fo = new FileOutputStream(fileName + excelExt);
		OutputStreamWriter os = new OutputStreamWriter(fo, "euc-kr");
		
		buffer = new BufferedWriter(os);
	
	}
	
	public void excelSave(String fileName) throws Exception {
	
		this.bufferOpen(fileName);
		this.title();
		
		
		listSize = 1;
		// 작성부분
		for(BookVO bookVO : bookList) {
			this.body(bookVO);
			listSize++ ;
		}
		this.footer();
		
		buffer.flush();
		buffer.close();
		// fileWriter.close();
		
	}
	
	public void excelSave(String fileName, String txt) throws Exception {
		
		this.bufferOpen(fileName);
		this.title();
		
		
		listSize = 1;
		// 작성부분
		for(BookVO bookVO : bookList) {
			if(bookVO.getB_title().contains(txt.trim())) {
				this.body(bookVO);
				listSize++ ;
			}
			
		}
		this.footer();
		
		buffer.flush();
		buffer.close();
		// fileWriter.close();
		
	}
	

	public void excelSave(String fileName, int grPrice, int lessPrice) throws Exception {
		
		this.bufferOpen(fileName);
		this.title();
		
		
		listSize = 1;
		// 작성부분
		for(BookVO bookVO : bookList) {
			int price = bookVO.getB_price();
			if(price >= grPrice && price <= lessPrice) {
				this.body(bookVO);
				listSize++ ;
			}
			
		}
		this.footer();
		buffer.flush();
		buffer.close();
		// fileWriter.close();
		
	}
	
	
	private void title() throws Exception {
		
		// ISBN,TITLE,COMP,WRITER,DATE.PRICE
		buffer.write("ISBN,");
		buffer.write("도서명,");
		buffer.write("출판사,");
		buffer.write("저자,");
		buffer.write("발행일,");
		buffer.write("가격,");
		buffer.newLine(); // enter 키 입력
		buffer.flush();
		
		
	}
	
	private void body(BookVO bookVO) throws Exception {
		
		buffer.write("'" + bookVO.getB_isbn() + ",");
		buffer.write(bookVO.getB_title() + ",");
		buffer.write(bookVO.getB_comp() + ",");
		buffer.write(bookVO.getB_writer() + ",");
		buffer.write(bookVO.getB_date() + ",");
		buffer.write(bookVO.getB_price() + ",");
		buffer.newLine(); // enter 키 입력
		buffer.flush();
	
	}
	

	private void footer() throws Exception {
		
		// int nSize = bookList.size();
		
		buffer.write("도서개수,");
		
		// excel의 b2셀부터 계산해서 합계 표시해라
		buffer.write("=COUNTA(B2..B" + listSize + "),");
		
		buffer.newLine(); // enter 키 입력
		buffer.flush();
	
	}

}

package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.list.exec.model.BookVO;

public class BookServiceImpV1 implements BookService {

	
	Scanner scan; // 키보드에서 값 입력받기 위한 준비
	List<BookVO> bookList; // BookVO에서 입력받은 도서정보 리스트를 bookList에 저장할 준비(선언)
	
	
	// 생성자 method
	// scan과 bookList를 사용할 수 있도록 초기화, 생성
	public BookServiceImpV1() {
		scan = new Scanner(System.in);
		
		// 클래스를 사용하려고 code를 작성했는데 오류가 나면
		// ctrl + shift + o(자동Import)
		bookList = new ArrayList<BookVO>();
	}
	
	// count라는 매개변수를 갖는 method
	// ex) service.input(30); ==> 30개의 데이터를 입력 받아라
	public void input(int count) {
		for(int i = 0; i < count ; i++ ) {
			this.input();
		}
	}
	
	@Override
	public void input() {
		System.out.print("도서번호 >> ");
		String strNum = scan.nextLine();
		
		System.out.print("도서명 >> ");
		String strName = scan.nextLine();
		
		System.out.print("저자 >> ");
		String strWriter = scan.nextLine();
		
		System.out.print("출판사 >> ");
		String strComp = scan.nextLine();
		
		/*
		 * 이 APP에서 사용자가 데이터를 입력하는 중에
		 * 가격이나 출판년도를 숫자가 아닌 문자열이나 blank를 입력하게 되면
		 * 문자열을 숫자로 바꾸는 과정에서
		 * NumberFormatException이 발생할 것이다.
		 * 
		 * 이 APP에서  NumberFormatException은 발생할 확률이 매우 높다
		 * 
		 * 이럴경우 사용자가 입력하는 과정에서
		 * 약간의 실수만 발생해도
		 * 앞에서 입력했던 모든 데이터를 잃게 된다.
		 * 
		 * 개발자 입장에서는 아무 문제가 없는 코드지만
		 * 사용자 입장에서는 매우 불편한 코드가 된다
		 * 
		 * 사용자 입장에서 좋은 코드를 작성하기 위해
		 * 개발자는 이런 상황에서 발생가능한 모든 Exception을 예상하고
		 * 적절한 해결방법을 미리 만들어 두어야한다.
		 * 이를 Exception Handling이라고 한다.
		 * 
		 * 1. 만약 사용자가 
		 * 가격이나, 출판년도를 문자열을 포함하여 입력할경우, 
		 * 안내 메시지를 보여주고 
		 * 다음 값을 입력하도록 유도
		 * 하는 코드를 작성해야한다.
		 */
		
		System.out.print("가격 >> ");
		String strPrice = scan.nextLine();
		int intPrice = 0; 
		
		/*
		 * **********
		 * [예외처리]
		 * 사용자가 APP을 사용하는 중에
		 * 데이터를 입력하거나 어떤 연산을 수행할 때
		 * runtime error이 발생할 확률이 0.00001%라도 있다면
		 * 그 APP은 사용자에게 상당한 스트레스를 줄 수 있다.
		 * 
		 * 개발자는 그러한 상황을 만들지 않기 위해서
		 * 		예측가능한 예외가 발생할 코드에
		 * 		예외 처리를 해 두어야한다.
		 * 
		 * 예외처리는 개발자의 필수항목으로 인식하기
		 */
		
		/*
		 * 예외가 발생할 가능성이 있는 코드 : try {}안에 작성
		 * 
		 * 예외가 발생한 경우 처리할 코드 : catch() {}에 작성한다.
		 */
		try {
			intPrice = Integer.valueOf(strPrice);
		} catch (Exception e) {
			// TODO : handle exception
			System.out.println("가격에 문자열이 포함 됨!!");
			System.out.println("입력하신 도서정보가 추가되지 않았습니다.");
			return;
		}
		
		System.out.print("출판년도 >> ");
		String strPubYear = scan.nextLine();
		int intPubYear = 0;
		
		try {
			intPubYear = Integer.valueOf(strPubYear);
		} catch (Exception e) {
			// TODO : handle exception
			System.out.println("출판년도에 문자열이 포함 됨!!");
			System.out.println("입력하신 도서정보가 추가되지 않았습니다.");
			return;
		
		}
	
		BookVO bookVO = new BookVO();
		bookVO.setStrNum(strNum);
		bookVO.setStrName(strName);
		bookVO.setStrComp(strComp);
		bookVO.setStrWriter(strWriter);
		
		bookVO.setIntPrice(intPrice);
		bookVO.setIntPubYear(intPubYear);
		
		// 2. 생성한 vo를 bookList에 추가
		bookList.add(bookVO);
	
	}
	

	@Override
	public void list() {
	
		System.out.println("=================================================");
		System.out.println("도서 정보 일람표");
		System.out.println("=================================================");
		System.out.println("ISBN\t도서명\t출판사\t저자\t가격\t출판년도");
		System.out.println("-------------------------------------------------");
		
		int nSize = bookList.size();
		for(int i = 0 ; i < nSize; i++) {
			
			BookVO vo = bookList.get(i);
			
			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getStrName() + "\t");
			System.out.print(vo.getStrComp() + "\t");
			System.out.print(vo.getStrWriter() + "\t");
			System.out.printf("%5d\t",vo.getIntPrice());
			System.out.printf("%4d\n",vo.getIntPubYear());
			
		}
		
	}
	@Override
	public void view(int index) {
	
		System.out.println("======================================================");
		System.out.println("ISBN : " + bookList.get(index).getStrNum());
		System.out.println("도서명 : " + bookList.get(index).getStrName());
		System.out.println("출판사 : " + bookList.get(index).getStrComp());
		System.out.println("저자 : " + bookList.get(index).getStrWriter());
		System.out.println("가격 : " + bookList.get(index).getIntPrice());
		System.out.println("출판년도 : " + bookList.get(index).getIntPubYear());
		System.out.println("=======================================================");
	}

	// 도서명으로 검색하기
	@Override
	public void view(String strName) {
		
		int nSize = bookList.size();
		for(int i = 0 ; i < nSize; i++) {
			if(bookList.get(i).getStrName().equalsIgnoreCase(strName)) {
				this.view(i);
				break; // 최초로 발견된 1개의 정보만 확인하고 마침
			}
		}
	}

}

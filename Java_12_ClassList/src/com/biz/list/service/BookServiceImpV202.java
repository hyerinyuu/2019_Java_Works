package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.list.exec.model.BookVO;

/*
 * 키보드에서 도서정보를 입력받아서 
 * List에 추가하고 
 * 목록보기, 정보보기
 * V2(Version2) 확장 ==> 기능이 업그레이드 된 코드
 */
public class BookServiceImpV202 implements BookService {

	Scanner scan;
	List<BookVO> bookList;
	
	public BookServiceImpV202() {
		scan = new Scanner(System.in);
		
		bookList = new ArrayList<BookVO>();
	}
	
	
	@Override
	public void input(int count) {

		for(int i = 0 ; i < count ; i++) {
			this.input();
		}
		
	}

	@Override
	public void input() {
		
		// 먼저 vo를 만든 후 scan
		// 코드가 중간에 멈출 경우 쓸데없는 vo를 만들게됨.(메모리낭비)
		// (vo의 변수가 총 6개인데 다 String형이라서 많은 메모리를 사용함)
		// ===> 메모리 관리를 위해 변수를 먼저 생성하고 나중에 VO를 만드는게 더 효율적임
		//(틀린 코드는 아님)
		BookVO vo = new BookVO();
		System.out.println("도서번호 >> ");
		vo.setStrNum(scan.nextLine());
		
	
		
	}

	@Override
	public void list() {

			
		
		
	}

	@Override
	public void view(int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void view(String strName) {
		// TODO Auto-generated method stub

	}

}

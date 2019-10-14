package com.biz.exam.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.exam.domain.BBsVO;

public class BBsViewServiceV1 implements BBsViewService {

	List<BBsVO> bbsList = new ArrayList<BBsVO>();
	
	// 가. 외부에서 bbsList 값 주입하기
	@Override
	public void setBBsList(List<BBsVO> bbsList) {
		this.bbsList = bbsList;
		
	}


	// 나. bbsList의 전체 리스트를 console에 출력하는 method
	@Override
	public void viewBBs() {
		
		this.listTitle();
		for(BBsVO bbsVO : bbsList) {
			
			this.listBody(bbsVO);
			
		}
		
	}

	// 다. 문자열을 매개변수로받아 제목에서 해당 문자열이 있는 리스트를 console에 출력하기 위한 method
	@Override
	public void viewBBs(String subject) {

		this.listTitle();
		
		for(BBsVO bbsVO : bbsList) {
			
			if(bbsVO.getSubject().contains(subject)) {
				this.listBody(bbsVO);
			}else {
				System.out.println("제목을 다시 확인해주세요");
			}
				
			
		}
	}

	// 라. 두개의 숫자를 매개변수로 받아 두 숫자 범위에 있는 작성일자에 해당하는 리스트를 console에 출력
	@Override
	public void viewBBs(int sDate, int eDate) {

		this.listTitle();
		
		for(BBsVO bbsVO : bbsList) {
		
			int date = Integer.valueOf(bbsVO.getDate());
			if(date >= eDate && date <= sDate) {
				this.listBody(bbsVO);
			}
			
		}
		
		
	}

	// 한개의 boolean값을 매개변수로 받아 true이면 조회순 오름차순으로
	// 									  false이면 조회순 내림차순으로 정렬하시오
	@Override
	public void viewBBs(boolean sort) {

		
		
		
	}

	// 일일이 입력하기 귀찮으니까 만든 list의 title부분 method

	public void listTitle() {
		
		System.out.println("=========================================================");
		System.out.println("게시판작성자리스트.v1");
		System.out.println("=========================================================");
		System.out.println("순번\t작성자\t작성일자\t제목\t\t내용\t조회수");
		System.out.println("---------------------------------------------------------");
		
	}
	
	//  일일이 입력하기 귀찮으니까 만든 list의 body부분 method
	public void listBody(BBsVO bbsVO) {
		
		// int String String String String int
		System.out.printf("%d\t%s\t%s\t%s\t%s\t%d\n", bbsVO.getSeq(),
										  bbsVO.getAuth(),
										  bbsVO.getDate(),
										  bbsVO.getSubject(),
										  bbsVO.getText(),
										  bbsVO.getCount());
		
	}
	


}

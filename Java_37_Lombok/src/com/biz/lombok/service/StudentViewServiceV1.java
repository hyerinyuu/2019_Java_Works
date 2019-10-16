package com.biz.lombok.service;

import java.util.List;

import com.biz.lombok.domain.StudentVO;

public class StudentViewServiceV1 extends StudentViewServiceABS {
	
	
	// 모든 학생들의 list를 보여주는 method
	@Override
	public void view() {

		this.listTitle();
		
		for(StudentVO stdVO : stdList) {
			
			this.listBody(stdVO);
			
		}
		
	}

	// 학생 이름을 검색하면 검색한 이름과 일치하는 학생리스트를 보여주는 method
	@Override
	public void view(String strName) {

		this.listTitle();
		
		for(StudentVO stdVO : stdList) {
			
			if(stdVO.getS_name().contains(strName)) {
				this.listBody(stdVO);
			}else {
				// 이 상태에서는 일치하는 제목이 없으면 제목을 확인해달라는 내용이
				// console에 5번 표시되고
				// 일치하는 제목이 있으면 그 제목을 표시해주고
				// 제목을 확인해달라는 메시지가 4번 표시됩니다
				// 하지만 이상한 제목을 입력했을때 리스트에 아무것도 표시되지 않는 것보다 나을 것 같아서
				// 이대로 제출합니다.
				System.out.println("제목을 다시 확인해주세요");
			}
				
		}
		
	}

	// 학생 학년을 검색하는 해당하는 학생과 일치하는 학년의 학생 리스트를 보여주는 method
	@Override
	public void view(int intGrade) {

		this.listTitle();
		
		for(StudentVO stdVO : stdList) {
			
			int intSetGrade = Integer.valueOf(stdVO.getS_grade());
			
			if(intGrade == intSetGrade) {

				this.listBody(stdVO);
			}
				
		}
		
		
	}

	// 최대값과 최소값을 입력해 범위내 학년의 리스트를 보여주는 method
	@Override
	public void view(int grGrade, int lessGrade) {

		this.listTitle();
		
		for(StudentVO stdVO : stdList) {
			
			int grade = stdVO.getS_grade();
			if(grade >= grGrade && grade <= lessGrade) {
				
				this.listBody(stdVO);
			}
		}
		
		
	}
	
	// 일일히 입력하기 귀찮으니까 만든 listTitle method
	private void listTitle() {
		
		System.out.println("=========================================================");
		System.out.println("학생정보.v1");
		System.out.println("=========================================================");
		System.out.println("학번\t이름\t전화번호\t학년\t주소");
		System.out.println("---------------------------------------------------------");
		
	}
	
	// 일일히 입력하기 귀찮아서 만든 listBody method
	private void listBody(StudentVO stdVO) {
		
		// 001:홍길동:010-111-1111:3:서울특별시
		System.out.printf("%s\t%s\t%s\t%d\t%s\n", stdVO.getS_num(),
				  stdVO.getS_name(),
				  stdVO.getS_tel(),
				  stdVO.getS_grade(),
				  stdVO.getS_addr());
		
	}
	
	
	

}

package com.biz.lombok.service;

import java.util.List;

import com.biz.lombok.domain.StudentVO;

public abstract class StudentViewServiceABS {

	protected List<StudentVO> stdList;
	
	// 외부에서 값 주입하기
	public void setStdList(List<StudentVO> stdList) {
		this.stdList = stdList;
	}
	
	// stdList를 console에 보이기
	public abstract void view() ;
	
	// strName 문자열을 매개변수로 받아서 학생이름을 검색하여
	// strName 문자열과 일치하는 학생이름이 있는 리스트만 보이기
	public abstract void view(String strName) ;
	
	// intGrade 정수형을 매개변수로 받아서 학생 학년을 검색해
	// intGrade 정수형과 일치하는 학생 리스트만 보이기
	public abstract void view(int intGrade);
	
	// 두개의 정수값을 매개변수로 받아서 
	// grGrade부터 lessGrade범위의 학년 리스트만 보이기
	public abstract void view(int grGrade, int lessGrade);

	
}

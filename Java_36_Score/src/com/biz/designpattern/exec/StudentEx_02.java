package com.biz.designpattern.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.designpattern.domain.StudentVO;

public class StudentEx_02 {

	public static void main(String[] args) {

		List<StudentVO> stdList = new ArrayList<StudentVO>();
		List<StudentVO> stdList2 = new ArrayList<StudentVO>();
		
		long start = System.currentTimeMillis();
		for(long i = 0 ; i < 100000 ; i++) {
			
			System.out.println(System.currentTimeMillis());
			// 학생 개체를 하나 만들어서
			// == 객체를 생성하고, setter로 필드값을 주입한 후 List에 저장
			StudentVO stdVO = new StudentVO();
			// 번호생성
			stdVO.setSt_num(String.format("%05d", i));
			
			// stdList에 추가
			stdList.add(stdVO);
		}
		System.out.println(System.currentTimeMillis());
		
		// 필드생성자에 값을 주입하면서 직접 add() method에 객체를 주입
		for(long i = 0 ; i < 100000; i++) {
		
			stdList.add(new StudentVO(String.format("%05d", i),"","","",0,""));
		}
		System.out.println(System.currentTimeMillis());
		
	}

}

package com.biz.designpattern.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.designpattern.domain.StudentVO;

public class StudentEx_01 {

	public static void main(String[] args) {

		List<StudentVO> stdList = new ArrayList<StudentVO>();
		
		/*
		 * [자바 빈즈 패턴](Java Beans Pattern)
		 *  ==> 자바의 고전적인 코딩
		 *  코드가 상당히 번거로워지고 객체를 따로 생성해야 하기 때문에 코드 부담이 많음
		 */
		// setter()를 이용해서 필드에 값을 주입하고 List에 추가
		StudentVO stdVO = new StudentVO();
		stdVO.setSt_num("001");
		stdVO.setSt_name("홍길동");
		stdVO.setSt_tel("010-111");
		stdVO.setSt_addr("서울특별시");
		stdVO.setSt_grade(3);
		
		stdList.add(stdVO);
		
		// StudentVO의 필드생성자를 이용한 값 주입
		// 생성자를 이용해 필드갑을 초기화 하면서 객체를 생성하고 변수 객체에 담았다가 List에 추가
		stdVO = new StudentVO("003","성춘향","010-333","남원시",3,"005");
		stdList.add(stdVO);
		
		// 별도의 변수객체를 (굳이)만들지 않고
		// add()에 직접 생성자 코드를 작성해서 List에 추가
		stdList.add(new StudentVO("004","임꺽정","010-222","남원시",3,"005"));
		// ==> 이러한 패턴은 값의 위치가 달라지면 오류 발생확률이 굉장히 높아지기 때문에
		// 이러한 오류를 개선하기 위해 디자인패턴을 연구하는 사람들이 새로운 패턴을 개발함(자동완성기능x 수동코딩)
		
		
		
		// 생성자를 이용하는 객체생성
		// 1. 생성자의 매개변수 순서 등을 명확히 인식해야만 오류가 없는 값을 추가할 수 있다.
		// 2. 지금 당장 추가하지 않아도 될 필드 값도 의무적으로 모두 추가해야하는 단점이 있음
		
		
	}

}

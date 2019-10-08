package com.biz.list.Exec;

import java.util.List;

import com.biz.list.service.ListMakeServiceV1;
import com.biz.list.service.ListRecServiceV2;

public class ListEx_02 {

	public static void main(String[] args) {

		ListMakeServiceV1 lm = new ListMakeServiceV1();
		lm.makeStrList(); 		// list 생성	
		List<String> strList = lm.getStrList();
		
		// 객체 이름이 한글이어도 아무 문제x
		// 객체(인스턴스) 3개 선언
		ListRecServiceV2 홍길동 = new ListRecServiceV2(strList, "홍길동");
		ListRecServiceV2 이몽룡 = new ListRecServiceV2(strList, "이몽룡");
		ListRecServiceV2 성춘향 = new ListRecServiceV2(strList, "성춘향");
		
		// 홍길동.viewList();
		// 홍길동.remove();
		
		홍길동.viewList();
		홍길동.remove();
		
		홍길동.viewList();
		홍길동.remove();
		
		이몽룡.remove();
		이몽룡.viewList();
		
		성춘향.remove();
		성춘향.viewList();
		
		홍길동.viewList();
		이몽룡.viewList();
		성춘향.viewList();
		// recList :  외부에서 가져온 값, 객체, 인스턴스가 틀려도 그 값을 공유함
		// myList : 직접 만든 값, 각각의 객체가 각각의 값을 가짐
	}

}

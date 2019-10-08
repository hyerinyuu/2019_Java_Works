package com.biz.method;

import java.util.List;

import com.biz.method.service.MakeListService;
import com.biz.method.service.ViewListService;

public class MethodEx_06 {

	/*
	 * MakeListService 클래스의 getListAll(25) method를 호출하여
	 * 정수값이 25개 담긴 리스트를 만들어 return하도록 하고 
	 * 
	 * 		그 리스트를 ViewListService 클래스의 serListAllAndView(리스트)method를 호출해
	 * 리스트를 console에 보여주고
	 * 		리스트에 포함된 정수의 개수가 몇개인지를 return받아서
	 * 		어딘가에 사용하겠다. 라는 의미의 코드
	 */
	public static void main(String[] args) {

		MakeListService ms = new MakeListService();
		
		List<Integer> aList = ms.getListAll(25);
		
		// 생성된 aList를 ViewListService에 정의된
		// ~~View() method한테 보내서 
		// 리스트를 console에 보이고 싶음
		
		ViewListService vs = new ViewListService();
		int aa = vs.setListAllAndView(aList);
		System.out.println("AA : " + aa);
		
	}

}

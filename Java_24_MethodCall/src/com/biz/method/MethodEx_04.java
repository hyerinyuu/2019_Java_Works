package com.biz.method;

import java.util.List;

import com.biz.method.service.MakeListService;

public class MethodEx_04 {

	public static void main(String[] args) {

		MakeListService ms = new MakeListService();
		
		/*
		 * MakeListService 클랫의 getListAll() method를 호출해서
		 * 무엇인가를 수행하려고 코드를 작성.
		 * getListAll() method가 어떻게 정의되어있는지 알수가 없어서
		 * 무작정 호출을 했더니 아무런 반응이 없다.
		 */
		ms.getListAll();
		
		// eclipse의 assist 기능을 활용하여
		// ms.(점연산자)get 이라고 입력했더니
		// getListAll() method가 정의된 형태를 볼 수 있었다.
		
		// ms.getListAll() : List<Integer> - MakeListService
		// 이 정보를 바탕으로 getListAll()이 List<Integer> type의
		// 어떤 데이터를 return해주도록 디자인(작성) 되었다는 것을 알 수 있게 됨
		// List<Integer> type의 intList 변수를 선언하고
		// = ms.getListAll() 형태로 method를 호출하여
		// getListAll() method가 return하는 값을 intList 변수에 저장하도록 코드 완성
		List<Integer> intList = ms.getListAll();
		
		
	}

}

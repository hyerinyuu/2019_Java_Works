package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

/*
 * RecieveService
 */
public class ListRecServiceV2 {

	private String name;
	private List<String> myStrList;
	private List<String> recStrList;

	/*
	 * RecServiceV2를 생성자()/ viewList() 로 수정
	 */
	public ListRecServiceV2(List<String> recStrList, String name) {

		myStrList = new ArrayList<String>();
		this.recStrList = recStrList;
		this.name = name;
	}
	
	public void remove(){
		
		// myStrList에 recStrList의 0번째 요소를 복사하고
		// == 블랙잭에서 각 플레이어가 받는 카드
		this.myStrList.add(this.recStrList.get(0));
		
		// recStrList의 0번째값을 삭제해라
		// == 블랙잭에서 deck 객체
		this.recStrList.remove(0);
	}
	
	
	public void viewList() {
		
		System.out.println("====================================");
		System.out.println(this.name);
		System.out.println("------------------------------------");
		System.out.println(recStrList.toString());
		System.out.println(myStrList.toString());

		//for(String str : this.recStrList) {
		//	System.out.println(str);
		// }
		
	}
}

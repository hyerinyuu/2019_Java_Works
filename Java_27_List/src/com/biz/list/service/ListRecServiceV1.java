package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

/*
 * RecieveService
 */
public class ListRecServiceV1 {

	// 					[공유 메모리 기법]	
	
	/*
	 * recStrList == 외부에서 주입 될 List
	 * 		- ListRecServiceV2로 생성한 객체들이 모두 공유하는 List
	 * 		- 다른 객체에서 recStrList값을(개수를) 변경하면,
	 * 		- 모든 객체(인스턴스)가 가지고 있는 recStrList값이 같이 변동
	 */
	private List<String> recStrList;
	
	/*
	 * myStrLisdt == 자체에서 new ArrayList() 생성할 List
	 * 		- ListRecServiceV2로 객체를 생성하면서
	 * 		- new ArrayList()로 생성을 하기 때문에
	 * 		- 다른 객체(인스턴스)에서 자신의 myStrList를 변경을 해도
	 * 		- 다른 객체(인스턴스)에는 아무런 영향이 없다.
	 */
		
	
	private List<String> myStrList;
	
	
	
	public ListRecServiceV1() {
		// TODO 생성자
	
		
	}
	/*
	 * myStrList : ListServiceV1에서 임의로 생성한 List
	 * recStrList : 외부에서 주입되는 List
	 */
	public ListRecServiceV1(List<String> recStrList) {

		myStrList = new ArrayList<String>();
		this.recStrList = recStrList;
	}
	
	public void setStrList(List<String> recStrList) {
		
		this.recStrList = recStrList;
	}
	
	public void viewList() {
		
		for(String str : this.recStrList) {
			System.out.println(str);
		}
		
	}
}

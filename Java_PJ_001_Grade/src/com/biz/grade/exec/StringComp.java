package com.biz.grade.exec;

public class StringComp {

	public static void main(String[] args) {

		int sort = "A".compareTo("A");   // 0
		System.out.println(sort);
		// compare앞의 문자열이 오름차순의 위쪽이면 -1
		System.out.println("A".compareTo("B"));  // -1
		// compare앞의 문자열이 오름차순의 뒤쪽이면 1
		System.out.println("B".compareTo("A"));   // 1
	
		System.out.println("F".compareTo("A"));  // 5 (=F가 A보다 5번째 뒤쪽에 있다.)
		
		System.out.println("A".compareTo("F"));  // -5
		
		
		
	}

}

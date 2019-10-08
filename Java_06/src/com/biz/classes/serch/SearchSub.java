package com.biz.classes.serch;

import java.util.Scanner;

public class SearchSub {

	/*
	 * 임의의 문자열중에 포함된 1개의 문자열을 찾는 클래스
	 * 
	 * 1. 임의 문자열을 제시한다. 2. 키보드에서 1개의 문자열을 입력받는다. 3. 해당하는 문자열이 몇번째 위치에 있는지 찾는다.
	 * 
	 */
	
	public String strNation ;
	public void main() {
		
		
		// strNation 변수를 맴버변수 영역으로 이동!!
		// String strNation = "Republic of Korea";
		Scanner scanner = new Scanner(System.in);
		int intLength = strNation.length();

		// 1. 문자열 제시
		System.out.println(strNation);
		System.out.println("1개의 문자열을 입력하세요.");
		System.out.print("문자 >> ");

		String strS = scanner.nextLine();
		
		// for문안에 int를 밖으로 빼냄
		int index = 0;  // = int index;
		for (index = 0 ; index < intLength; index++) {
			String strAt = strNation.substring(index, index + 1);
			if (strAt.equalsIgnoreCase(strS)) break;
			}
		/*
		 * 만약 문자열에 포함된 문자가 있으면
		 * index < 17
		 * 만약 문자열에 포함된 문자가 없으면
		 * index == 17
		 */
			System.out.println(index);
			
			/*
			 * index를 검사하는 안전한 코드
			 */
			if(index < intLength)
				System.out.println(index + " 번째 에서 찾음");
			else
				System.out.println("없는 문자열");
		
			/*
			 * 이렇게 쓸 경우에는 다른 코드가 값을 건드려서
			 * 오류가 날 경우도 있어
			 * 안정성이 낮으니까 사용하지 말것
			 */
			// if(index == intLength)
			//	System.out.println("없는 문자열");
			// else
			//	System.out.println(index + " 번째 에서 찾음");
}
}

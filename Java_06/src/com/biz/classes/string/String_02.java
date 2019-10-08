package com.biz.classes.string;

public class String_02 {

	public static void main(String[] args) {

		//[Java_05_;String_01 변수를 활용한 정답]
		// 조건을 바꾸기는 편하지만
		// 답을 찾을때까지 계속 ctr + c,v 해야함
		String strNation = "Republic of Korea";
		char cSearch = 'u';
		int index = 0;
		
		char cA = strNation.charAt(index);
		if(cA == cSearch)
			System.out.println(index + " 번 위치에 있음");
		
		index ++; // 1로 증가
		cA = strNation.charAt(index);
		if(cA == cSearch)
			System.out.println(index + " 번 위치에 있음");
		
		index ++; // 2로 증가
		cA = strNation.charAt(index);
		if(cA == cSearch)
			System.out.println(index + " 번 위치에 있음");
		index ++; // 3으로 증가
		cA = strNation.charAt(index);
		if(cA == cSearch)
			System.out.println(index + " 번 위치에 있음");
		index ++; // 4로 증가
		cA = strNation.charAt(index);
		if(cA == cSearch)
			System.out.println(index + " 번 위치에 있음");
		
		
	}

}

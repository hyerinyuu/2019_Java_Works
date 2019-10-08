package com.biz.classes.string;

import java.util.Scanner;

public class String_081 {

	public static void main(String[] args) {

		/*
		 * strNation에 저장된 문자열을 보여주고
		 * 한개의 문자를 키보드로 입력받고
		 * 입력한 문자가 몇번째 위치에 있는지를 찾아보기
		 * [내가한거]
		 */
		
		// 사용자 직접 입력한 문자열을 가져오기 위한 도구
		Scanner scanner = new Scanner(System.in);
		
		String strNation = "Republic of Korea";
		
		int intLength = strNation.length();
		int index = 0;
		
		System.out.println("전체 문자열 : " + strNation );
		System.out.println("찾는 문자를 입력하세요");
		System.out.print("문자 >> ");
		String strSearch = scanner.nextLine();
		System.out.println("입력한 문자 : " + strSearch );

		System.out.println("===============================");
		for(int i = 0; i < intLength ; i++ ) {
		String strAt = strNation.substring(i, i+1);
		if(strAt.equals(strSearch))
			System.out.println("찾으시는 문자는 문장의 " + i + " 번째에 위치하고 있습니다.");
			
		}
		
		

		
		
		
		
		
			
		
		
		
	}

}

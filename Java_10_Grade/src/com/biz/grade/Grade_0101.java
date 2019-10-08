package com.biz.grade;

import java.util.Scanner;

public class Grade_0101 {

	public static void main(String[] args) {

		// 정수형 배열을 선언하겠다
		// 키워드[] 배열이름 = 정수형배열[n] n개를 선언하겠다.
		int[] intKor = new int[5];
		
		// Scanner 클래스를 사용해 
		// 클래스 이름을 scan으로 짓고
		// Scanner를 시스템과 연결하라
		Scanner scan = new Scanner(System.in);
		
		// ======================================
		// 배열의 개수만큼 반복될 코드
		// ======================================
		for(int i = 0; i < intKor.length ; i++) {
			
	
		System.out.print("국어점수 >>");
		String strKor = scan.nextLine();
		
		// 5개의 배열에 방금 입력한 점수를 저장하겠다.
		// intKor이 정수형이므로 integer를 이용해 문자열형으로 저장하겠다(Scanner때문에)
		intKor[i] = Integer.valueOf(strKor);
		}			
		
		
		
	}

}

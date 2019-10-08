package com.biz.grade.service;

import java.util.Scanner;

public class GradeService {

	private int[] intKor;
	private int[] intEng;
	private int[] intMath;
	
	private int[] sum;
	private Scanner scan;
	
	
	// 생성자 method 만들기
	// public으로 생성해야하고 method이름이 class이름과 같아야함
	// return type이 없다.(JDK 키워드 못붙임 ==> 붙이는 순간 생성자 method가 아니게 됨)
	public GradeService(int length) {
		
		// 여기에서 4개의 멤버(배열)변수들을 사용할수 있도록
		// 생성하는 일(연산)을 수행
		intKor= new int[length];
		intEng= new int[length];
		intMath= new int[length];
		
		sum = new int[length];
		
		scan = new Scanner(System.in);
		
		
	} // GradeService() end
	
	// 배열의 개수만큼 각 과목의 점수를 입력
	public void input() {
		
		for(int i = 0 ; i < intKor.length ; i++) {
			System.out.print((i+1) +  "번 국어 >> ");
			
			// return값이 있는 method는 다른 method로 묶을 수 있음
			// 1. 변수를 사용하여 3줄로 작성한 코드
			// = String strKor = scan.nextLine();
			// int intKor = Integer.valueOf(strKor);
			// this.intKor[i] = intKor;
			
			// 2. 문자열 변수 사용을 하지 않고 2줄로 작성한 코드
			// int intKor = Integer.valueOf(scan.nextLine());
			// this.intKor[i] = intKor;
			
			// 3. 별도의 변수를 선언하지 않고 1줄로 작성한 코드
			this.intKor[i] = Integer.valueOf(scan.nextLine());
		
			
			System.out.print((i+1) +  "번 영어 >> ");
			int intEng= Integer.valueOf(scan.nextLine());
			this.intEng[i] = intEng;
			
			System.out.print((i+1) +  "번 수학 >> ");
			int intMath= Integer.valueOf(scan.nextLine());
			this.intMath[i] = intMath;
			
		
			
		}
	}// input() end
	
	public void view() {
		System.out.println("================================");
		System.out.println("성적일람표");
		System.out.println("--------------------------------");
		System.out.println("국어\t영어\t수학");
		for(int i = 0 ; i < intKor.length ; i++) {
			System.out.printf("%d\t%d\t%d\n", intKor[i], intEng[i], intMath[i]);
		}
		System.out.println("=================================");
	}
	
	
}

package com.biz.grade;

import java.util.Scanner;

public class Grade_02_exec {
	
	// 코드 분리하려고 따로 main()밖에서 선언함
	// (main()에서도 쓰고 input()에서도 쓰려고)
	// 단점 : 모두 static을 붙어야함(method에도)
	private static int[] intKor;
	private static Scanner scan;
	public static void main(String[] args) {

		
		intKor = new int[5];
		scan = new Scanner(System.in);
		for(int i = 0; i < intKor.length ; i++) {
			input(i);
		}		
		
		// main()에서 배열의 개수만큼 반복적으로
		// view() method에게 국어점수를 표시하라고 지시
		for(int i = 0 ; i < intKor.length ; i++) {
			view(i);
		}
		
		// 아예 intKor[]배열을 통째로 view()method에게 보내고
		// 알아서 표시하라고 지시
		view(intKor);
		
	} // main end
	
	 
	public static void input(int index) {
		System.out.print((index + 1) + "번의 국어 >> ");
		String strKor = scan.nextLine();
		intKor[index] = Integer.valueOf(strKor);
	}
	// index번째 배열의 국어 점수를 표시하는 부분
	public static void view(int index) {
		System.out.println((index+1) + "번 국어 : " + intKor[index]);
	}
	
	// int Kor[] 배열전체를 표시
	public static void view(int[] intKor) {
		for(int i = 0 ; i < intKor.length ; i ++) {
			System.out.println((i+1) + "번 국어 : " + intKor[i]);
		}
	}
	
	
	}

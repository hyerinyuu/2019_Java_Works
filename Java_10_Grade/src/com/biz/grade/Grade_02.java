package com.biz.grade;

import java.util.Scanner;

public class Grade_02 {
	
	/*
	 * ############################
	 * [멤버변수]
	 * 멤버변수 영역에 선언된 변수들은 종류, 타입에 관계없이
	 * 현재 클래스(Grade_02)에 선언된 모든 method에서 
	 * 접근 (읽기, 쓰기, 생성 등등)을 할 수 있다.
	 * (메인method 밖 class 영역 안에서 선언되서)
	 * 
	 * 어떤 method에서 멤버변수에 값을 저장하면
	 * 다른 method에서 그 값을 읽어서 연산을 수행할 수 있다.
	 * 
	 * 멤버변수 접근제한자
	 * public : 아무런 제한 없이 멤버변수에 접근할 수 있다.
	 * private : 현재 클래스에 있는 
	 * 			method에서만 접근할 수 있다.(import해도 다른 클래스에서 private 변경 불가)
	 * 
	 * 현재 클래스에 main() method가 있으면
	 * 모든 멤버변수에 static을 붙여야한다.
	 * 그래야 main()method에서 멤버변수에 접근할 수 있다.
	 * (왜냐면 main()이 static으로 선언됐으니까)
	 * 
	 * 또한 main()이외 다른 method에도 static을 붙여야 한다.
	 * (main이 이미 static으로 선언돼서...?)
	 */
	
	// 1. intKor 배열변수를 static으로 선언만 한 상태
	//		(정수형 배열 intKor 쓸거니까 메모리 할당해라)
	//		 배열의 개수가 정해지지 않은 상태
	// 선언만 한 상태라서 아직 배열을 사용할 수 없다.
	private static int[] intKor;
	
	// Scanner클래스를 scan static 객체로 선언만 한 상태
	// 아직 scan을 사용할 수 없는 단계 
	private static Scanner scan;

	
	// main()은 고정 method임
	// static으로 선언됐기 때문에 변수는 모두 static으로 선언해야함
	public static void main(String[] args) {

		
		// 2. intKor 배열변수를 5개의 배열로 생성
		// 		배열을 사용할 준비가 된 단계
		// 정수형 배열 5개를 새로 만들어서 intKor에 저장해라
		intKor = new int[5];
		
		// scan객체를 사용해서 키보드에서 값을 입력받을 수 있게
		// 준비된 단계
		scan = new Scanner(System.in);
		for(int i = 0; i < intKor.length ; i++) {
			input(i);
		}			
		
		
	}// main method end

	
	// 
	public static void input(int index) {
		System.out.print("국어점수 >>");
		String strKor = scan.nextLine();
		intKor[index] = Integer.valueOf(strKor);
	
	}
	}

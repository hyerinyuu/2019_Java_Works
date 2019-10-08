package com.biz.arrays.service;

import java.util.Random;
import java.util.Scanner;

public class MethodService {

	private int intSum;
	// methodEx_01
	
	/*
	 * method를 정의할때( method 코드를 작성할때)
	 * void method() : return 문이 있거나 없거나 상관없음.
	 * 
	 * 변수를 선언하는 키워드 method()
	 * int method(), String method(), float method(), boolean method(),
	 * long method(), double method(), char method(), ScoreVO method(),
	 * StudentVO method(), BookVO method() ... ...
	 * 
	 * 
	 * 변수를 선언하는 키워드를 
	 * 			변수형(Varriable Type)이라고 하는데
	 * 			같은 키워드가 method() 정의문에 나타나면 
	 * 			return type 이라고 한다.
	 * 			이때 이 키워드는 return 문에 포함된 값과 밀접한 관계가 있다.
	 * 			int method() { return 0; } 
	 * 			String method() { return "대한민국"; } 
	 * 			float method() { return 3.0f }
	 * 			boolean method() { return false ; }
	 * 			ScoreVO method() { return sVO; }
	 * 			==> 이와같이 변수타입 method() {return 값} 변수타입=값이 일치해야함
	 * 					
	 * 			return 값 ; 문장에서
	 * 		 	값의 데이터 타입(data type)을 method() 정의문에 작성해준다
	 * 
	 * 			method type은 double형인데
	 * 			return 문에 포함된 값이 "00" 문자열형이므로
	 * 		 	이 코드는 syntax error이 난다.
	 * 			double method(){ return "00"}
	 */
	
	// method 앞에 void가 붙으면 return을 써도, 안써도 상관없음
	// void형 method이므로 return문이 선택사항임 (없어도 상관x)
	public void consoleView() {
		System.out.println("나는 console에 표시하는 method()");
		return ;
	}
	
	
	// [return type method]
	// 변수 선언도 아닌데 keyword가 붙은 method는 return을 반드시 써줘야함
	
	// return num; 문에서
	// num변수의 data type이 int 형이다
	// 따라서 이 method의 선언문에는 int 키워드가 포함되어야한다.
	// 만약 return문에 포함될 값이 없으면
	// 		최소한 return 0; 이라는 문장이라도 완성되어야한다.
	public int numRet( ) {
		int num = 100 + 200 + 300;
		return num; 
	}
	
	// method의 return type이 String(문자열)형이므로
	// return 문자열; 형식의 문장이 완성되어야한다.
	// 만약 return문에 포함될 값이 없으면
	// 		return ""; 또는 return null; 형식의 문장이라도 완성되어야한다.
	public String strRet() {
		// return "";
		return "우리나라만세";
			
	}

	
	// method return문에 intSum 변수가 포함되어있다.
	// intSum 변수는 이 클래스의 멤버변수로
	// 변수형(varriable type)이 int형이다ㅣ
	// 따라서 method 정의문에 int return type이 있어야한다.
	public int getIntSum() {
		return intSum;
	}


	public int getsum(int num1, int num2) {
		return 30*40;
	}

	public void add() {
		System.out.println("매개변수가 없는 method");
	}
	
	public void add(int num) {
		System.out.printf("매개변수 1 개 : %d\n", num);
	}

	public void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("두개의 매개변수 합 : " + sum);
	}
	public void add(float f1, float f2) {
		float sum = f1 - f2;
		System.out.printf("두 실수를 뺀 값 : %f", sum);
	}

	}
	
	
	






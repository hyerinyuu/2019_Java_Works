package com.biz.grade.service;

import java.util.Scanner;

public class GradeServiceV2 {

	private int[] intKor;
	private int[] intEng;
	private int[] intMath;
	
	private int[] sum;
	private Scanner scan;
	
	
	// 생성자 method 만들기
	// public으로 생성해야하고 method이름이 class이름과 같아야함
	// return type이 없다.(JDK 키워드 못붙임 ==> 붙이는 순간 생성자 method가 아니게 됨)
	public GradeServiceV2(int length) {
		
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
			this.inputKor(i);
			this.inputEng(i);
			this.inputMath(i);
			this.total(i);
			
		}
	}// input() end
	
	// 과목이 늘어나면 input()이 불안해지니까 만드는 코드
	
	// [private]
	// 이 method는 GradeServiceV2 클래스에 같이 있는
	// 			method에서만 호출할 수 있다.
	private void inputKor(int index) {
		System.out.print((index+1) +  "번 국어 >> ");
		this.intKor[index] = Integer.valueOf(scan.nextLine());

	}
	private void inputEng(int index) {
		System.out.print((index+1) +  "번 영어 >> ");
		this.intEng[index] = Integer.valueOf(scan.nextLine());

	}
	private void inputMath(int index) {
		System.out.print((index+1) +  "번 수학 >> ");
		this.intMath[index] = Integer.valueOf(scan.nextLine());
	}
	
	private void total(int index) {
		int intTotal = this.intKor[index];
		intTotal = this.intEng[index];
		intTotal = this.intMath[index];
		
		this.sum[index] = intTotal;
		
	}
	
	public void view() {
		System.out.println("================================");
		System.out.println("성적일람표");
		System.out.println("--------------------------------");
		System.out.println("국어\t영어\t수학\t총점");
		for(int i = 0 ; i < intKor.length ; i++) {
			System.out.printf("%d\t%d\t%d\t%d\n", 
					this.intKor[i], this.intEng[i], this.intMath[i], this.sum[i]);
		}
		System.out.println("================================");
	
	}// view end
	
	// 총점 점수를 기준으로 내림차순 정렬을 하자
	public void sort() {
		for(int i = 0 ; i < sum.length; i++) {
			for(int j = i + 1 ; j < sum.length ; j++) {
				
				// 내림차순 정렬
				if(sum[i] < sum[j]) {
					
					int _temp = sum[i];
					sum[i] = sum[j];
					sum[j] = _temp;
				}
			}
		}
	}
	
}

package com.biz.arrays.model;

public class ScoreVO {

	public String strNum;  //학번
	public int intKor;		// 국어점수
	public int intEng;		// 영어점수
	public int intMath;		// 수학점수
	
	
	// public, private 키워드를 접근 제한자라고 한다.
	// [public] : 다른 클래스에서 자유롭게 값을 읽기, 쓰기가 가능하도록
	// 개방하겠다. 라는 의미
	
	// [private] : 현재 클래스(ScoreVO)에서만
	// 			값을 읽기 쓰기가 가능하도록 제한하겠다. 라는 의미
	// 			외부의 어떤 코드에서 
	// 			이 값들을 변경하거나 읽어서 사용하지 못하도록 하겠다. 라는 의미
	private int intSum; 	// 총점
	private int intAve;		// 평균
	private int intRank;	// 석차
	
	public void add() {
		int num = 100 + 200 + 300;
	}
	
	public int add_ret() {
		int num = 100 + 200 + 300;
		return num;
	} 
	
	
	public int sum() {
		intSum = intKor + intEng + intMath;
		return intSum;
	}
	
	/*
	 * ScoreVO의 멤버변수인 
	 * intSum은 
	 * 입력된 과목 점수에 의해
	 * 계산되어서 값을 보관하는 변수이다.
	 * intSum을 계산하기 위해 sum() 메서드를 생성해두었다.
	 * 
	 * 하지만, 
	 * intSum을 public으로 선언해두고
	 * sum()메서드를 호출하지 않은채
	 * intSum값을 읽으면 
	 * 0의 값이 읽혀지고 sum()메서드는 아무 의미가 없는 코드가 된다.
	 * 
	 * 그래서 intSum을 private으로 선언하고
	 * 반드시 sum() 메서드가 실행된 후에
	 * intSum을 외부에서 읽도록 해 두어야 한다.
	 */
}

package com.biz.classes.model;

/*
 * [학생의 성적처리에 사용할 VO 클래스 디자인]		
 * prototype (코드) 작성
 * 객체를 생성하는 일종의 근본코드라고 보면 된다.
 * 
 * [성적처리를 위해 필요한 데이터들]
 * 학번, 국어점수, 영어점수, 수학점수, 총점, 평균
 * 
 * 이 데이터 중에서
 * 총점과 평균을 제외한 나머지는
 * 어쩔수 없이 일일이 입력해야한느 데이터들이다.
 * 총점과 평균을 제외한 데이터는 일단 멤버변수로 선언한다.
 */

public class GradeScoreVO {
	
	public String strNum;
	public int intKor;
	public int intEng;
	public int intMath;
	
	public int total;
	public float average; 
	
	
	/*
	 * 과목 점수의 합계를 계산한 후
	 * total 멤버변수에 값을 저장해 두자
	 */
	public void total() {
		total = intKor + intEng + intMath;

	/* 
	 * 과목 점수의 평균을 계산한 후
	 * average 멤버변수에 값을 저장해 두자
	 */
	}
	public void average() {
		int sum = intKor + intEng + intMath;
		average = sum / 3.0f;
	}
	
	
}



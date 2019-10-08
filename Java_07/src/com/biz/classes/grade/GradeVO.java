package com.biz.classes.grade;

/*
 * 이러한 static이 없는 변수를
 * dynamic class 라고 정의하는데
 * dynamic 이라는 의미로 해석하면
 * 어려움이 있으므로
 * 
 * static이 아닌 class 라고 이해를 해라.
 */
public class GradeVO {

	// non static class
	/*
	 * static class는
	 * 선언, 생성, 초기화 과정을 코딩하지 않고
	 * 직접 클래스.~~~ 방식을 접근할 수 있다.
	 */

	
	
	/*
	 * [추상화]  : 처리하고자 하는 정보처리 대상을 class로 만드는것
	 * 
	 * 성적처리를 위한 필수항목을 멤버변수에 선언(정의)한다
	 * 멤버변수로 얻을수 있는 것들을 method()로 정의한다
	 * 
	 * 멤버변수 : 정보처리를 위해 컴퓨터에게 필수적으로 줘야하는 
	 * 			  연산과 관계없는 정보들
	 * 
	 * (ex : 성적처리를 위한 멤버변수 : 학번/이름/과목
	 * method() : 총점, 평균, 석차, 평점, 리스트 등등)
	 */
	
	/*
	 * ###########
	 *  [객체의 정의]
	 * 1. 연산을 통해서 얻을 수 없는 데이터들을
	 * 	  (학번, 이름, 과목점수 등등)
	 * 	  변수로 정의
	 * 	  ==> 멤버변수
	 * 
	 * 2. 멤버변수를 기초로하여 연산을 통해서 
	 * 	  얻을 수 있는 항목들을 위하여
	 * 	  method()를 정의
	 * 	  (=멤버 method())
	 *  
	 *  3. 처리하고자하는 대상(데이터 등등)을 개체로 정의하는
	 *  	단계를 '추상화' 라고 한다.
	 *  	추상화는 객체지향 언어를 이요한 프로그래밍에서
	 *  	매우 중요한 개념이다.
	 *  
	 */
	
	
	//멤버변수들
	public String strNum;
	public String strName;
	public String strMain;
	public int intKor;
	public int intEng;
	public int intMath;
	
	
	public void gradeList() {
		// %d : 정수(int, long)
		// %f : 실수(float, double)
		// %c : 문자(char)
		// %s : 문자열(String)
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\n",
				strNum,
				strName,
				intKor,
				intEng,
				intMath,
				intKor + intEng + intMath
				);
	}
	public void sum() {
		
		int sum = intKor + intEng + intMath;
		System.out.println("총점 : " + sum);
		System.out.println("총점 : " + sum/3);
				
		
	}
	
	
	
}

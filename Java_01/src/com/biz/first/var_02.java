package com.biz.first;

public class var_02 {

	public static void main(String[] args) {
		
		//변수의 명명규칙(문법규칙이므로 반드시 지켜야함)
		// 1. 첫글자는 반드시 영문소문자
		// 2. 여러단어를 묶어서 의미있게 명명
		// 변수이름만 보고 어떤 데이터가 
		// 저장되어있는지 유추할 수 있도록
		//3. 중간, 끝에는 숫자를 포함할 수 있다.
		//4. 경우에 따라 _(Under Score)를 포함 가능
		//5. 첫글자에 _(under Score)를 사용할 수도 있다.(추천안함)
		//6. 첫글자 숫자, 
		//   중간에 빈칸, 
		//   4칙연산기호 등 포함 불가(언더바만 가능)
		// 변수의 Carmel Case 명명 패턴
		// 1. 변수명을 여러단어로 묶어 만들경우
		// 각 단어가 시작될때는 대문자로
		// (단, 첫글자는 제외)
		// 2. 또는 단어와 단어 사이를 _로 연결
		// 키워드사이에는 빈칸이 있어야하지만 
		// 나머지는 상관없음
		int intNum1=30;
		int intNum2 = 40;
		
		System.out.println(intNum1+intNum2);
		System.out.println(intNum1+intNum2);
		System.out.println(intNum1 - intNum2);
	}

}

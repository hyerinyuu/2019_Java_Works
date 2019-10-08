package com.biz.for_if;

public class If_08 {

	public static void main(String[] args) {

		int intAge = 121;
		
		// 나이의 조건은 0세 이상, 120세 이하의 값만 허용하는데
		//( = intAge >= 0, intAge <= 120 )
		// intAge에 담긴 값이 해당 조건에 맞지 않으면
		// 메시지를 표시하시오.
		
		// if(0 <= intAge <= 120) => 이렇게 되면 좋겠지만 문법성립x
		if(intAge >=0 && intAge <= 120 ) { // &&을 사용해 표시해야함
			System.out.println("조건에 맞음");
		}
		
		if(intAge< 0 || intAge > 120) {
			System.out.println("나이는 0세부터 120세 까지만 가능");
			System.out.println("변수 값 : " + intAge);
		} else {
			System.out.println("조건에 맞음!!");
		}
	}

}

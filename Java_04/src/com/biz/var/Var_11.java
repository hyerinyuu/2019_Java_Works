package com.biz.var;

public class Var_11 {

	public static void main(String[] args) {

		int nCount = 0;
		
		// 자신을 1씩 증가시키는 복함 대입 연산자 사용
		nCount += 1;
		nCount += 1;
		nCount += 1;
		nCount += 1;
		nCount += 1;
		nCount += 1;
	
		
		// 자신을 1씩 감소 시키는 복합 대입 연산자 사용
		nCount -= 1;
		nCount -= 1;
		nCount -= 1;
		nCount -= 1;
		nCount -= 1;
		nCount -= 1;

		//[증가연산자(++)]
		// 자신을 '1'씩 증가시키는 코드는
		// 복합 대입 연산자 대신 (=>같은 코드가 반복되면 꼴보기싫으니까)
		// 증가 연산자(++)를 사용한다.
		nCount ++; // =  nCount = nCount + 1;
		
		//[감소연산자(--)]
		// 자신을 '1'씩 '감소'시키는 코드
		nCount --; // =  nCount = nCount - 1;
		
		
		
		
	}

}

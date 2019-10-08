package com.biz.var;

public class Var_12 {

	public static void main(String[] args) {

		int nCount = 0;
		
		nCount = nCount + 1;
		System.out.println("카운트 1 : " + nCount);
		
		nCount += 1;
		System.out.println("카운트 2 : " + nCount);
		
		// [실제코드]
		// System.out.println("카운트 4 : " + nCount);
		// nCount += 1;
		System.out.println("카운트 3 : " + (nCount++));  // 2
		
		System.out.println("카운트 4 : " + nCount ); // 3
		
		//[실제코드]
		// nCount += 1;
		// System.out.println("카운트 5 : " + (++nCount));
		System.out.println("카운트 5 : " + (++nCount));
		
		
		
		
		
		
		// [실제 코드]
		// int n =\ nCount + 1;
		// nCount += 1;
		int n = (nCount++) +1;
		
		
		
		
	}

}

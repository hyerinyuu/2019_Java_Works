package com.biz.classes.string;

public class String_10 {

	public static void main(String[] args) {

		/*
		 * 0부터 100 까지 숫자 중에서 
		 * 7의 배수가 2번째로 나타나면
		 * 그 값을 표시하시오
		 */
		int nCount = 0;
		int intMax = 1000;
		int intMul = 21; //mul => multiple = 배수
		int intSearch = 5; // 몇번째
		
		for(int i = 1; i < intMax ; i ++) {
		
			if(i% intMul == 0) nCount ++;
			if(nCount == intSearch) {
		System.out.println(intMax + "의 " + intSearch +" 번째 배수 : " + i);
		break;
			}
		
		}
		
		
	}

}

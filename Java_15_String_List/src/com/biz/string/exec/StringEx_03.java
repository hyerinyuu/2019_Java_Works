package com.biz.string.exec;

public class StringEx_03 {

	/*
	 * strNation에 담긴 문자열을
	 * 역순으로 console에 표시하시오
	 * aeroK fo cilbupeR
	 */
	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		String[] nations = strNation.split("");
		//nations.length = 17 a문자열이 저장된 위치는 16(시작값이 0이니까)
		
		
		for(int i = nations.length - 1 ; i > -1 ; i--) {
			System.out.print(nations[i]);
		}
		System.out.println();
		
		
	}

}

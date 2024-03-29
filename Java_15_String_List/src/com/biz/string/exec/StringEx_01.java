package com.biz.string.exec;

public class StringEx_01 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		
		// strNation에 담긴 문자열을 알파벳 단위로 *한글자씩 잘라서* strS1배열에 담아라 
		String[] strS1 = strNation.split("");  // 총 17개의 배열 생성
		
		for(String s : strS1) {
			System.out.println(s);
		}
		// strNation에 담긴 문자열을 space(" ")기준으로 잘라서 strS2배열에 담아라
		String[] strS2 = strNation.split(" "); // 총 3개의 배열 생성
		System.out.println("0번 : " + strS2[0]);
		System.out.println("1번 : " + strS2[1]);
		System.out.println("2번 : " + strS2[2]);
		
		// 오류가 나면 무시하라는 코드
		try {
			System.out.println("3번 : " + strS2[3]);
		} catch (Exception e) {
			// 코드 없음
			// 만약 exception이 발생하면 모든것을 무시하라
		}
		
		try {
			System.out.println("3번 : " + strS2[3]);
		} catch (Exception e) {
			
			// try{} 내의 코드가 실행되는 과정에서
			// exception이 발생하면
			// JVM은 catch(e) {} 에게 exception 정보를 전달한다.
			// 이때 exception 정보는 변수 e가 받는다.
			// e 변수의 printStackTrace() method는
			// 어떤 exception이 발생했는지 단순히 console에 보여주는 기능을 수행한다.
			e.printStackTrace();
			
		}
		
		
	}

}

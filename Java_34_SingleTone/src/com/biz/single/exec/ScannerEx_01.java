package com.biz.single.exec;

import java.util.Scanner;

public class ScannerEx_01 {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		
		System.out.print("아무문자나 입력하세요 >> ");
		String str1 = scan1.nextLine();
		
		// scanner를 3개를 만들었지만 resource의 한계상 내부적으로는 scanner가 1개라서 ==> Single Tone
		// scan1만 닫아도 나머지가 모두 닫힘  
		scan1.close();  // No Such Element Exception
		
		System.out.print("아무문자나 입력하세요 >> ");
		String str2 = scan2.nextLine();
		
		System.out.print("아무문자나 입력하세요 >> ");
		String str3 = scan3.nextLine();
		
		System.out.println(str1 + " : " + str2 + " : " + str3);
		
	}

}

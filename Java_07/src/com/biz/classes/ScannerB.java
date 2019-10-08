package com.biz.classes;

import java.util.Scanner;

public class ScannerB {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		// scanner.nextLine();으로 문자열형 => 정수형으로 변환하면
		// 버그뜨니까 사용안함
		System.out.print("이름 >> ");
		String strName = scanner.nextLine();
		
		System.out.print("국어 >> ");
		int intKor = scanner.nextInt();
		
		System.out.print("영어 >> ");
		int intEng = scanner.nextInt();
		 
		System.out.println("전화 >> ");
		String strTel = scanner.nextLine();
		
		System.out.println("전화1 >> ");
		String strTel1 = scanner.nextLine();
		
	}

}

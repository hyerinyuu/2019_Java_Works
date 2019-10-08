package com.biz.grade;

import java.util.Scanner;

public class Grade_01 {

	public static void main(String[] args) {

		int[] intKor = new int[5];
		
		for(int i = 0; i < intKor.length; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("국어 점수 >> ");
			String strKor = scan.nextLine();
			
			intKor[i]=Integer.valueOf(strKor);
		}
			
		
	}

}

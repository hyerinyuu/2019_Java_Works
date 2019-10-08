package com.biz.classes.arrays;

import java.util.Random;
import java.util.Scanner;

public class Array_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Random rnd = new Random();
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(10) + 1;
		}

		System.out.print("1부터 10까지의 숫자중 아무거나 골라 입력하세요\n>>");
		int strNum = scanner.nextInt();
		int intNum = Integer.valueOf(strNum);
		
		int index;
		for (index = 0; index < num.length +1; index++) {
			if(num[index] == intNum) break;
		}
		if(index>=num.length)
			System.out.println("배열에 찾으시는 값이 없습니다.\n" + intNum);
		else
			System.out.printf("찾았다!!"
					+ "%d 번째에 찾으시는 값이 있습니다." + index);
		
		
	}

}

package com.biz.classes.arrays;

import java.util.Scanner;

import com.biz.classes.service.ArrayScanService;

public class Array_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayScanService aService 
		 = new ArrayScanService(10);
		
		while(true) {
		aService.scanArrayall();
		System.out.println("Press Any Key to End");
		String keyIn = scan.nextLine();
		if(keyIn.equals("END")) break;
		
		
	}
		System.out.println("GAME OVER!!");
	}
}

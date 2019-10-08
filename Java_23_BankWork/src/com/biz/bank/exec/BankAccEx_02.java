package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankAccServiceV2;
import com.biz.bank.service.BankAccService;

public class BankAccEx_02 {

	public static void main(String[] args) {

		BankAccService bs = new BankAccServiceV2();
		Scanner scanner = new Scanner(System.in);
		String strBookFile = "src/com/biz/bank/계좌원장.txt";
		
		while(true) {
			System.out.println("=============================================");
			System.out.println("대한은행 차세대시스템 v2.0");
			System.out.println("=============================================");
			System.out.println("1.조회 2.입금 3.출금 4.전체조회 0.종료");
			System.out.println("---------------------------------------------");
			System.out.print( "업무선택 >> ");
			String strMenu = scanner.nextLine();
			int intMenu = Integer.valueOf(strMenu);
			
				try {
					if(intMenu == 0) {
						
						BankAccServiceV2 bs2 = (BankAccServiceV2)bs;
						bs2.writeAccBook(strBookFile);
						// bs.WriteAccBook(bookFileName);
						// 위 두줄을 한줄로 줄이는 코드
						// ((BankAccServiceV2)bs).writeAccBook(strBookFile);
						break;
					}
					if(intMenu == 1)bs.viewAcc();
					if(intMenu == 2) bs.input();
					if(intMenu == 3) bs.output();
					if(intMenu == 4)((BankAccServiceV2)bs).bankBookList(); 
						
				} catch (Exception e) {
					e.printStackTrace();
				}
		
		} 
		scanner.close();
		System.out.println("업무종료");
	
		
		
	}

}

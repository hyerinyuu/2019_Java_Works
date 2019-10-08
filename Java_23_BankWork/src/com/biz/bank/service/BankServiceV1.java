package com.biz.bank.service;

import java.util.Scanner;

public class BankServiceV1 {

	int intBalance = 0;
	String strAccNum;
	String strAccKeyIn = null; 
	
	Scanner scanner = null;
	
	// BankServiceV1의 생성자
	public BankServiceV1() {
		scanner = new Scanner(System.in);
	}
	
	// BankServiceV1의 또 다른 생성자
	// 계좌번호와 잔액을 매개변수(파라메터)로 받는 생성자 
	public BankServiceV1(String strAccNum, int intBalance) {
		this.strAccNum = strAccNum;
		this.intBalance = intBalance;
		scanner = new Scanner(System.in);
	}
	
	public void viewAcc() {
		
		System.out.print("계좌번호 >> ");
		strAccKeyIn = scanner.nextLine();
		if(strAccKeyIn.equals(strAccNum)) {
			System.out.println("================================");
			System.out.printf("계좌번호 : %s\n", strAccNum);
			System.out.printf("잔고 : %d\n", intBalance);
			System.out.println("================================");
		}else {
			System.out.println("**계좌번호가 없음**");
		}
	}

	// 입금처리
	public void input() throws Exception {
		System.out.println("입금처리");
		System.out.println("================================");
		/*
		 * 2. 입금을 받고
		 * 3. 계좌잔액 = 입금액 + 계좌잔액
		 */
			System.out.print("입금액 >> ");
			String strInput = scanner.nextLine();
			int intInput = Integer.valueOf(strInput);
			
			if(strAccKeyIn != strAccNum) {
				System.out.println("계좌번호를 다시 확인하세요");
				return;
			} else {
			intBalance += intInput;
			}
	
	}
	
	
	
	// Output method가 실행되는 동안 NumberFormatException이 발생하면 
	// 오류를 발생하지 말고 호출한 곳에 알려줘라.
	public void output() throws Exception {
		System.out.println("출금처리");
		System.out.println("================================");
		/*
		 * 2. 출금을 받고
		 * 3. 잔액 >= 출금 : 잔액 = 잔액 - 출금액
		 *  잔액 < 출금 : 출금거부
		 */
		System.out.print("출금액 >> ");
		String strOutput = scanner.nextLine();
		int intOutput = Integer.valueOf(strOutput);
		if(intBalance >= intOutput) {
			intBalance -= intOutput;
		}else {
			System.out.println("잔액이 부족하여 출금거래가 불가능합니다.");
		}
		
		
	}
	
}

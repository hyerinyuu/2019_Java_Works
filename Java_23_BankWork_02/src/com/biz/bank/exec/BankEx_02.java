package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankService;
import com.biz.bank.service.BankServiceImpV1;

public class BankEx_02 {

	public static void main(String[] args) {

		BankService bs = new BankServiceImpV1();
		
		Scanner scanner = new Scanner(System.in);
		String bookFile = "src/com/biz/bank/활빈당은행잔고원장.txt";
		
		
		// try catch문이 while문을 감싼 코드
		/*
		 * 파일에서 원장을 읽은 후 업무를 진행하는 과정에서
		 * 만약 어떤 원인으로 APP이 중단되면
		 * 그동안 수행한 입출금 내역이 메모리에만 있기 때문에 모두 사라져버리고
		 * APP을 새로 시작하면 처음으로 다시 데이터가 초기화되어버린다.
		 * 
		 * 그래서 입출금이 완료되는 순간 원장 정보를 바로 저장하여
		 * 		언제든지 APP을 새로 시작하면 업무수행 다음부터
		 * 		다시 진행할 수 있도록 하기
		 * 
		 * 때문에, 반복문 내에서 업무 선택 전에
		 * 		 원장을 읽어 리스트를 생성하는 일을 먼저 수행한다.
		 */
		try {
			
			while(true) {
				
				// 계좌 원장에서 데이터 읽어오기
				bs.readBook(bookFile);
			
				
				System.out.println("=================================================");
				System.out.println("활빈당 종합 은행 v1");
				System.out.println("=================================================");
				System.out.println("1.원장리스트 2.계좌조회 3. 입금 4.출금 5.종료");
				System.out.println("-------------------------------------------------");
				
				String strMenu = scanner.nextLine();
				int intMenu = Integer.valueOf(strMenu);
				if(intMenu == 5 )break;
				else if(intMenu == 1) {
				//	bs.bookList();
				}else if(intMenu == 2) {
					// 입금처리 후에 원장저장을 수행하도록 해도 되지만
					// 코드를 작성하는 중에 원장저장 method호출을 빼먹을 수 있기때문에
					// input() method에서 bookWriter() method를 호출하도록 코드를 작성해보기
					bs.viewAcc();
					// bs.bookWrite(bookFile);
					
				}else if(intMenu == 3) {
					bs.input();
				}else if(intMenu == 4) {
					bs.output();
				}
				
				
				
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
		
	}

}

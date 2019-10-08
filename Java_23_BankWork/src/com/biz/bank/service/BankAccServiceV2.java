package com.biz.bank.service;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.biz.bank.domain.BankAccVO;

/*
 * 여러개 계좌에 대한 입출금 처리
 * for문과 format을 이용한 0001형태의 계좌 생성
 */
public class BankAccServiceV2 implements BankAccService {
	
	/*
	 * 멤버변수영역에 선언된 변수(멤버변수 또는 필드변수라고 함)들
	 * 여기에 선언된 변수들은 프로젝트가 실행되어 작동되는 동안 그 값을 계속 유지하고 있음
	 */
	Map<String, BankAccVO> bankList;
	
	/*
	 * viewAcc() method에서 bankList를 계좌번호로 조회를 했을때
	 * 해당하는 계좌번호가 조회되면
	 * bankList에서 해당하는 계좌정보를 담고 있을 인스턴스 변수이다.
	 * 또한 이 인스턴스가 가지고 있는 멤버변수들을 변경(수정)하면
	 * 그 정보는 bankList에도 반영이 된다.
	 * 
	 * bankAccVO의 balance, lastDate, remark 정보를 update하면
	 * bankList에 다시 담지 않아도(set) 자동으로 bankList에 반영이 된다.
	 */
	BankAccVO bankAccVO;
	Scanner scanner;
	PrintWriter fileOut = null;
	
	
	public BankAccServiceV2() {
		bankList = new TreeMap<String, BankAccVO>();
		scanner = new Scanner(System.in);
		
		for(int i = 0 ; i < 10 ; i++) {
			// 0001 형태의 계좌번호 생성
			String strNum = String.format("%04d", i+1);
			
			BankAccVO bVO = new BankAccVO();
			bVO.setStrNum(strNum);
			bVO.setIntBalance(100000);
			bVO.setStrLastDate("2019-09-23");
			bVO.setStrRemark("신규");
			bankList.put(strNum, bVO);
		}
	}
	

	@Override
	public boolean viewAcc() throws Exception {
		
		System.out.print("계좌번호 >> ");
		String strNum = scanner.nextLine();
		
		// 멤버변수
		bankAccVO = bankList.get(strNum);
		// 만약 strNum계좌가 bankList에 있으면 bankAccVO에 해당계좌정보가 담김
		// 								없으면 bankAccVO에 null값이 담김
		if(bankAccVO != null ) {
			System.out.println("=============================");
			System.out.println("계좌번호 : " + bankAccVO.getStrNum());
			System.out.println("최종잔액 : " + bankAccVO.getIntBalance());
			System.out.println("거래일자 : "+ bankAccVO.getStrLastDate());
			System.out.println("거래구분 : " + bankAccVO.getStrRemark());
			System.out.println("=============================");
		}else {
			System.out.println("***계좌정보가 없습니다.***");
		}
		
		
		return false;
		
	}

	@Override
	public void input() throws Exception {
		
		this.viewAcc();
		if(bankAccVO != null ) {
			// 입금처리 수행
			System.out.print("입금액 >> ");
			String strInput = scanner.nextLine();
			int intInput = Integer.valueOf(strInput);
			
			int intBalance = bankAccVO.getIntBalance();
			intBalance += intInput;
			
			/*
			 * 지금 bankAccVO의 balance 필드에 값을 변경하면
			 * bankList의 자동으로 현재 값이 반영이 된다.
			 * ==> bankAccVO의 값을 변경한 후 bankList에 저장하거나 하는 코드를 사용할 필요 없음
			 */
			bankAccVO.setIntBalance(intBalance);
			bankAccVO.setStrRemark("입금");
			
			
			// 현재 입금 처리한 날짜를 추가
			// 컴퓨터의 현재 시각을 가져오는 클래스 
			Date date = new Date();
			
			// DecimalFormat(숫자값을 3000 => 3,000으로 바꿀때 사용)와 비슷한 기능으로
			// 날짜값을 원하는 형태의 문자열로 변환시키는 클래스
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
			String strLastDate = sd.format(date);
			bankAccVO.setStrLastDate(strLastDate);
		}else {
			System.out.println("계좌정보 없음");
		}
	}

	@Override
	public void output() throws Exception {
		// 계좌조회
		this.viewAcc();
		if(bankAccVO != null) {
			System.out.print("출금액 >> ");
			String strOutput = scanner.nextLine();
			int intOutput = Integer.valueOf(strOutput);
			int intBalance = bankAccVO.getIntBalance();
			
			if(intBalance >= intOutput ) {
				intBalance -= intOutput;
				bankAccVO.setIntBalance(intBalance);
				bankAccVO.setStrRemark("출금");
				
				
				// 현재 입금 처리한 날짜를 추가
				// 컴퓨터의 현재 시각을 가져오는 클래스 
				Date date = new Date();
				SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
				String strLastDate = sd.format(date);
				// DecimalFormat(숫자값을 3000 => 3,000으로 바꿀때 사용)와 비슷한 기능으로
				// 날짜값을 원하는 형태의 문자열로 변환시키는 클래스
				
				
				
				bankAccVO.setStrLastDate(strLastDate);
			}else {
				System.out.println("***잔액이 부족하여 출금이 불가능합니다.***");
			}
			
		}
		
		
	}
	// bankList에 저장된 계좌정보를 console에 보이기
	public void bankBookList() throws Exception{
		
		// map에 담긴 데이터를 for 반복문으로 처리하려면 먼저 key를 set으로 가져와서 처리해야함
		Set<String> keySets = bankList.keySet();
		
		System.out.println("==================================");
		System.out.println("계좌\t잔액\t거래일자\t구분");
		System.out.println("----------------------------------");
		for(String s : keySets) {
			System.out.println(bankList.get(s).getStrNum() + "\t");
			System.out.println(bankList.get(s).getIntBalance() + "\t");
			System.out.println(bankList.get(s).getStrLastDate() + "\t");
			System.out.println(bankList.get(s).getStrRemark() + "\n");
		}
		System.out.println("==================================");
			
		
		
	}
	// 업무가 종료될 때 현재 메모리에서 수행중이던 
	// 계좌 내역을 파일에 저장하기
	public void writeAccBook(String strBookFile) throws Exception {
		
		fileOut = new PrintWriter(strBookFile);
		
		Set<String> keysets = bankList.keySet();
		
		for(String s : keysets) {
			fileOut.printf("%s:%d:%s:%s\n", bankList.get(s).getStrNum(),
					bankList.get(s).getIntBalance(),
					bankList.get(s).getStrLastDate(),
					bankList.get(s).getStrRemark());
			fileOut.flush();
		}
		fileOut.close();
		
		
		
		
		
		
		
		
		
	}
}

package com.biz.bank.service;

/*
 * BankService에서 할 일이 아직 명확히 정의되지 않아
 * blank interface를 만들고
 * 실제 class를 만들면서 interface 정의를 수행
 * (interface의 내용을 비우고 시작한 후 class를 진행하면서 interface내용을 채움)
 * 
 * 1. 잔고 원장으로부터 계좌들의 잔고 리스트를 가져와서
 * 		리스트로 생성 후
 * 2. 각 계좌별 입, 출금 테스트 수행
 * 
 * 3. 다시 잔고 원장에 입, 출금 업데이트 내역 반영
 * 
 * 4. 각 계좌별 입,출금 내역(List)를 파일로 저장
 */

/*
 * [Interface]
 * interface는 method의 정의만 있고( {}도 없고 코드도 없음)
 * ==> method prototype 정의한다.
 * method가 구체적으로 무슨일을 하는지 모른다.
 * 다만, 구현될 method에 return type과 매개변수의 형식만 지정하는 것임
 * 
 */
public interface BankService {

	// 잔고 원장으로부터 계좌들의 잔고 리스트를 가져와서 리스트를 생성
	// object.readBook("거래원장.txt") 형식으로 호출될 method
	public void readBook(String bookFile) throws Exception;
	
	
	// 계좌번호를 입력받아서 계좌정보(잔액, 최종거래일자, remark)를 보여주는 method 정의하기
	public void viewAcc();
	
	// 입력받은 계좌번호가 조회되면
	// 조회된 계좌번호에 대항하는 계좌에 
	// 키보드로부터 입금액을 입력받아서 입금을 처리하는 method
	public void input()throws Exception;
	
	//  키보드로부터 출금액을 입력받아서 출금을 처리하는 method
	public void output()throws Exception;
	
	// 입출금이 완료됐을때 원장 정보를 업데이트 하는 method
	public void bookWrite(String bookFile) throws Exception;
	
	// 각 계좌별로 입출금 내역을 리스트형식으로()파일에 저장하기
	public void accListWrite(String remark, int money) throws Exception;
	
	
}

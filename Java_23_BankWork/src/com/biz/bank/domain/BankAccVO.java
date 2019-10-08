package com.biz.bank.domain;

/*
 * 은행 계좌정보를 담을 class
 * 1. 계좌번호
 * 2. 현재 잔액
 * 3. 최종거래일자
 * 4. 거래방법
 */
public class BankAccVO {
	
	private String strNum;
	private int intBalance;
	private String strLastDate;
	private String strRemark;
	
	
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public int getIntBalance() {
		return intBalance;
	}
	public void setIntBalance(int intBalance) {
		this.intBalance = intBalance;
	}
	public String getStrLastDate() {
		return strLastDate;
	}
	public void setStrLastDate(String strLastDate) {
		this.strLastDate = strLastDate;
	}
	public String getStrRemark() {
		return strRemark;
	}
	public void setStrRemark(String strRemark) {
		this.strRemark = strRemark;
	}
	

	
	
}

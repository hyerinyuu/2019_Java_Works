package com.biz.bank.domain;

/*
 * 은행의 잔고원장 데이터를 관리하기 위한 VO생성
 * 
 * [VO 생성을 위한 추상화 단계]
 * 계좌번호 String num
 * 최종잔액 int balance
 * 최종거래일자 String lastDate
 * 구분 String remark
 */

public class BankBookVO {

	// [멤버변수영역]
	// 멤버변수==필드변수들)
	private String num;
	private int balance;
	private String lastDate;
	private String remark;
	
	
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getLastDate() {
		return lastDate;
	}
	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override
	public String toString() {
		return "BankBookVO [num=" + num + ", balance=" + balance + ", lastDate=" + lastDate + ", remark=" + remark
				+ "]";
	}
	
	
	
	
}

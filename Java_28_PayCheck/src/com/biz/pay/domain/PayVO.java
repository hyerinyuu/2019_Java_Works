package com.biz.pay.domain;

/*
 * 사원번호 String num;
 * 급여액 int pay;
 */
public class PayVO {

	private String num;
	private int pay;
	
	public PayVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public PayVO(String num, int pay) {
		super();
		this.num = num;
		this.pay = pay;
	}


	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}


	@Override
	public String toString() {
		return "PayVO [num=" + num + ", pay=" + pay + "]";
	}
	
	
	
}

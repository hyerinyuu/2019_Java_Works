package com.biz.string.domain;

public class ScoreVO {

	// super생성자를 호출하면 멤버변수 값이 모두 자동으로 초기화됨
	private String strNum;		
	private int intKor;
	private int intEng;
	private int intMath;
	private int intTotal;
	private int intAvg;
	
	
	
	public ScoreVO() {
		super();
	}
	
	
	
	
	public ScoreVO(String strNum, int intKor, int intEng, int intMath, int intTotal, int intAvg) {
		super();
		this.strNum = strNum;
		this.intKor = intKor;
		this.intEng = intEng;
		this.intMath = intMath;
		this.intTotal = intTotal;
		this.intAvg = intAvg;
	}




	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	public int getIntTotal() {
		return intTotal;
	}
	public void setIntTotal(int intTotal) {
		this.intTotal = intTotal;
	}
	public int getIntAvg() {
		return intAvg;
	}
	public void setIntAvg(int intAvg) {
		this.intAvg = intAvg;
	}




	@Override
	public String toString() {
		return "ScoreVO [strNum=" + strNum + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath
				+ ", intTotal=" + intTotal + ", intAvg=" + intAvg + "]";
	}
	
	
	
	
}

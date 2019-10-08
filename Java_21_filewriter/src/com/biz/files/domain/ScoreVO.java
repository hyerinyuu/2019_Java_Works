package com.biz.files.domain;

public class ScoreVO {

	private String num;
	private int Kor;
	private int eng;
	private int math;
	
	private int total;
	private int avg;
	
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getKor() {
		return Kor;
	}
	public void setKor(int kor) {
		Kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	
	@Override
	public String toString() {
		return "ScoreVO [num=" + num + ", Kor=" + Kor + ", eng=" + eng + ", math=" + math + ", total=" + total
				+ ", avg=" + avg + "]";
	}
	
	
	
	
	
}

package com.biz.classes.model;

/* 
 * main() method 가 없는 형태의 class를
 * [사용자 정의형] class라고한다.
 * 이는 필요에 따라 사용자가 코드를 생성하여
 * 만들어둔 클래스 이다.
 * 
 * 멤버변수(어떤 값을 저장할 변수들의 모음)와 
 * method(기능, 할일 등을 정의하는 코드)를 갖는 class이다.
 * 
 */

public class StudentVO {


	/* 
	 * 정보처리에서
	 * 학생정보를 데이터로 하여 가공 하려고 할 때
	 * 어떠한 항목들을 데이터로 만들면 좋을지 생각하여 
	 * 그러한 항목들을 멤버변수로 선언한다.
	 * 
	 * ex) 학번, 이름, 전화, 주소, 학년, 생년월일, 전공등이 
	 * 멤버변수가 될 수 있다.
	 */

	public String strNum;
	public String strName;
	public String strTel;
	public String strAddr;
	public String strGRade;
	public String strBirth;
	public String strDept;
	
	
	
}

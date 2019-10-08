package com.biz.classes.student;



public class Student {

	public static void main(String[] args) {
		
		StudentGrade stdinfo01 = new StudentGrade();
		
		
		stdinfo01.strNum = "001";
		stdinfo01.strName = "김땡땡";
		stdinfo01.strEntyear = "2018";
		stdinfo01.strMajor = "컴퓨터공학";
		stdinfo01.strLevel = stdinfo01.strLevel;
		
		System.out.println("============================================");
		System.out.println("학생정보 - 김땡땡");
		System.out.println("--------------------------------------------");
		System.out.println("학번\t이름\t입학년도 전공\t    학년");
		System.out.println("--------------------------------------------");
		
		stdinfo01.stdList();
	
	}

}

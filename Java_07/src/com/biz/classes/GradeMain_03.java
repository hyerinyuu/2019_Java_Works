package com.biz.classes;

import com.biz.classes.grade.GradeVO;

public class GradeMain_03 {

	public static void main(String[] args) {
		
		// ********************************************
		// 성적처리를 위하여 
		// 학생 7명의 객체를 선언, 생성 초기화하는 부분
		// ********************************************
		GradeVO grade01 = new GradeVO();
		GradeVO grade02 = new GradeVO();
		GradeVO grade03 = new GradeVO();
		GradeVO grade04 = new GradeVO();
		GradeVO grade05 = new GradeVO();
		GradeVO grade06 = new GradeVO();
		GradeVO grade07 = new GradeVO();

		// grade01 객체의 멤버변수에 값을 setting 한다.
		// 변수에 값을 저장한다
	
		//*********************
		// 성적을 입력하는 부분
		//*********************
		grade01.strNum = "001";
		grade01.strName = "홍길동";
		
		grade01.intKor = 90;
		grade01.intEng = 88;
		grade01.intMath = 77;
		
		grade02.strNum = "002";
		grade02.strName = "이몽룡";
		
		grade02.intEng = 88;
		grade02.intMath = 66;
		grade02.intKor = 78;
		
		grade03.strNum = "003";
		grade03.strName = "성춘향";
		
		grade03.intEng = 65;
		grade03.intMath = 75;
		grade03.intKor = 85;
		
		grade04.strNum = "004";
		grade04.strName = "김땡땡";
		
		grade04.intEng = 56;
		grade04.intMath = 66;
		grade04.intKor = 76;

		grade05.strNum = "005";
		grade05.strName = "이땡땡";
		
		grade05.intEng = 74;
		grade05.intMath = 64;
		grade05.intKor = 94;

		grade06.strNum = "006";
		grade06.strName = "박땡땡";
		
		grade06.intEng = 75;
		grade06.intMath = 95;
		grade06.intKor = 66;

		grade07.strNum = "007";
		grade07.strName = "최땡땡";
		
		grade07.intEng = 98;
		grade07.intMath = 78;
		grade07.intKor = 68;

		
		//***************************
		// 결과를 list로 출력하는 부분
		//****************************
		System.out.println("============================================");
		System.out.println("응용SW반 성적표");
		System.out.println("--------------------------------------------");
		System.out.println("학번\t이름\t국어\t수학\t영어\t총점");
		System.out.println("--------------------------------------------");
		grade01.gradeList();	
		grade02.gradeList();	
		grade03.gradeList();
		grade04.gradeList();
		grade05.gradeList();
		grade06.gradeList();
		grade07.gradeList();
		System.out.println("============================================");
		
		
	}

}

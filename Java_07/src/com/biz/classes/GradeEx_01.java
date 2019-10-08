package com.biz.classes;

import java.util.Scanner;

import com.biz.classes.grade.GradeVO;

public class GradeEx_01 {

	/*
	 * 키보드로 한 학생의 성적정보를 입력받은 후
	 * Grade VO class 의 객체에 저장하고
	 * 입력된 정보를 콘솔에 확인해보자.
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("===========================");
		System.out.println("성적 정보 입력");
		System.out.println("===========================");
		System.out.println("학번 >> ");
		String strNum = scanner.nextLine();
		
		System.out.println("이름 >> ");
		String strName = scanner.nextLine();
		
		System.out.println("국어 >> ");
		String strKor = scanner.nextLine();
		
		System.out.println("영어 >> ");
		String strEng = scanner.nextLine();
		
		System.out.println("수학 >> ");
		String strMath = scanner.nextLine();
		
		GradeVO grade = new GradeVO();
		grade.strNum = strNum;
		grade.strName = strName;
		
		/*
		 * [Integer.valueof]를 써서 굳이 형변환 하는 이유]
		 * strKor에는 문자열형 숫자가 담겨있다.
		 * 왜냐하면 scanner.nextLine() 메서드는
		 * 		키보드로 입력한 모든것을
		 * 		문자열형으로 변환하여 입력받기때문이다. 
		 * 따라서 변수.valueof method를 사용하여
		 * 문자열형 => 정수형으로 형변환을 꼭 시켜줘야한다
		 */
		grade.intKor = Integer.valueOf(strKor);
		grade.intEng = Integer.valueOf(strEng);
		grade.intMath = Integer.valueOf(strEng);
		
				
		
		
	}

}

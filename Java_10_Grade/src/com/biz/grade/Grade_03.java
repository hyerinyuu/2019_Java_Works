package com.biz.grade;

import com.biz.grade.service.GradeService;

public class Grade_03 {

	public static void main(String[] args) {

		// GradeService class가 뭔가 일을 할 수 있도록
		// 준비하는 단계(main()밑으로 import함)
		// GradeService class의 생성자에게
		// 정수 5를 보내서 멤버배열변수들을 생성할 수 있도록 한다.
		// 
		GradeService gs = new GradeService(5);
		gs.input();
		gs.view();
		
		
		
	}

}

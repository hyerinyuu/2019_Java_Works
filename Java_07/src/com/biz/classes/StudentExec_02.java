package com.biz.classes;

import com.biz.classes.student.StudentVO;

public class StudentExec_02 {

	public static void main(String[] args) {

		StudentVO stVO = new StudentVO();
		
		stVO.strNum = "001";
		stVO.strName = "홍길동";
		stVO.intYear = 2012;
		stVO.strDept = "법학";
		
		// view(2020) = view method를 호출할때
		// (올해)연도를 포함하면
		// 연도에 따라 나이를 자동계산해서 보여주면 좋겠다.라는 의미임
		stVO.view(2050);
		
		
		
	}

}

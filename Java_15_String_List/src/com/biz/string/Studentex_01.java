package com.biz.string;

import com.biz.string.domain.StudentVO;
import com.biz.string.service.StringService;
import com.biz.string.service.StudentServiceImpV1;

public class Studentex_01 {

	public static void main(String[] args) {

		StringService stService = new StudentServiceImpV1();
		
		stService.input();
		stService.list();
		
		
		// ****좀 중요한 개념*****
		// StudentServiceImpV1 class에
		// StringService Interface에 정의되지 않은 search() method가 있는데,
		// 그 method를 사용하기 위해서
		// stService를 잠시 StudentServiceImpV1인 것처럼 바꾸는것.
		StudentVO stdVO 
			= ((StudentServiceImpV1)stService).search("00009");		
		
		// search() method를 호출하면서 학번 00001을 매개변수로 전달했고
		// 만약 해당 학번의 데이터가 있으면
		// stdVO에는 학생정보가 담겨있을것이다.
		
		// 혹시 데이터를 못 찾았으면
		// stdVO에는 null 값이 담겨있을 것이다.
		
		if(stdVO == null) {
			System.out.println("찾는 데이터 없음");
		}else {
			System.out.println(stdVO.toString());
		}
		
		
	}

}

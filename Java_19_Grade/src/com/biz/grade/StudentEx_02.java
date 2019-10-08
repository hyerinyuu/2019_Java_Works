package com.biz.grade;

import com.biz.grade.domain.StudentVO;
import com.biz.grade.service.StudentServiceV1;

public class StudentEx_02 {

	public static void main(String[] args) {

		StudentServiceV1 ss = new StudentServiceV1();
		String stdFileName = "src/com/biz/grade/학생명부.txt";
		
				try {
					ss.read(stdFileName);
					StudentVO stdVO = ss.getStudent("A001");
					if(stdVO != null){
						System.out.println(stdVO.toString());
					}
					// ss 객체의 getStudent() method를 실행하고
					// 그 결과(stdVO)에 toString() method를 실행하라
					// == class의 chaining코딩
					System.out.println(ss.getStudent("A002").toString());
					
					
					// stdVO 객체를 받고 stdVO의 toString() method를 실행하는 코드를
					stdVO = ss.getStudent("A010");
					System.out.println(stdVO.toString());
					// class chaning을 이용해 한줄로 표현
					System.out.println(ss.getStudent("A010").toString());
					
					
					
					
					// 가장 좋은 코드(데이터를 조회한 후 없으면 이유를 알려주는 코드)
					// 해당 key값의 데이터(StudentVO)가 없을 경우
					// null이라고 표시되거나 Exception이 발생하므로
					// 미리 값이 정상적인지 검사해 그에 따른 적절한 오류 처리를 수행한다.
					// toString이 없으면 그냥 null이라고만 표시됨
					stdVO = ss.getStudent("A020");
					if(stdVO != null) {
						System.out.println(stdVO.toString());
					}else {
						System.out.println("A020 학생 없음!");
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
		
		
	}

}

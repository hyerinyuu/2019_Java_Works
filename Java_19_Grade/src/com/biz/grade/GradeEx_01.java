package com.biz.grade;

import java.util.Map;

import com.biz.grade.domain.ScoreVO;
import com.biz.grade.domain.StudentVO;
import com.biz.grade.service.GradeServiceV1;
import com.biz.grade.service.ScoreServiceV1;
import com.biz.grade.service.StudentServiceV1;

public class GradeEx_01 {

	public static void main(String[] args) {

		StudentServiceV1 stService = new StudentServiceV1();
		ScoreServiceV1 scService = new ScoreServiceV1();
		String stdFileName = "src/com/biz/grade/학생명부.txt";
		String scoreFileName = "src/com/biz/grade/score.txt";
		
		
		try {
			stService.read(stdFileName);
			scService.read(scoreFileName);
			scService.total();
			scService.rank();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		Map<String, ScoreVO> scList = scService.getScList();
		Map<String, StudentVO> stdList = stService.stdList();
		
		// 기본 생성자를 호출하여 gs 객체를 생성하는 부분
		GradeServiceV1 gs = new GradeServiceV1();
		
		// scList를 생성자에게 보내서 gs객체를 생성하면서 scList값을 초기화 하는 부분
		gs = new GradeServiceV1(scList);
		
		// scList와 stdList를 생성자에게 보내서 gs객체를 생성하면서 scList와 stdList값을 초기화하는 부분
		gs = new GradeServiceV1(scList, stdList);
		gs.list();
		
	}

}

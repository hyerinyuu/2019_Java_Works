package com.biz.string;

import java.util.List;

import com.biz.string.domain.StudentVO;
import com.biz.string.service.ScoreServiceV2;
import com.biz.string.service.StringService;
import com.biz.string.service.StudentServiceImpV1;

public class ScoreEx_03 {

	public static void main(String[] args) {

		StringService stdService = new StudentServiceImpV1();
		
		// 학생 정보 생성
		stdService.input();
		
		// StudentServiceImpV1에서 stdList 추출(getScoreList)
		List<StudentVO> stdList
				= ((StudentServiceImpV1)stdService).getScoreList();
		
		// stdList를 ScoreService에 주입(setStdList)
		StringService scService = new ScoreServiceV2();
		((ScoreServiceV2)scService).setStdList(stdList);
		
		// 점수 생성
		scService.input();
		scService.list();
		
	
		
	}

}

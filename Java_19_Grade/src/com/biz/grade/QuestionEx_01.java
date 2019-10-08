package com.biz.grade;

import com.biz.grade.domain.ScoreVO;

public class QuestionEx_01 {

	// 왜 null PointException이 발생하는지
	// 해결방법 email로 보내기
	public static void main(String[] args) {

		ScoreVO[] scoreVO = new ScoreVO[5];
		
		scoreVO[1] = new ScoreVO();
		
		scoreVO[1].setKorScore(92);
		scoreVO[1].setEngScore(87);
		scoreVO[1].setMathScore(65);
		
		int intSum = scoreVO[1].getKorScore();
		intSum = scoreVO[1].getEngScore();
		intSum = scoreVO[1].getMathScore();
		
		System.out.printf("합계 : %5d", intSum);
		
	}



}

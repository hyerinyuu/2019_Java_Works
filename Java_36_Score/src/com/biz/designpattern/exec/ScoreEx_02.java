package com.biz.designpattern.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.designpattern.domain.ScoreVO;

public class ScoreEx_02 {

	public static void main(String[] args) {

		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		// 객체를 만들어서 scoreList에 추가시켜주는 코드
		// == 빌드패턴을 이용해서 list에 추가
		/*
		 * 빌드패턴은 코드에 일일이 VO 객체를 별도 생성해서 add()를 수행하는
		 * Java Beans Pattern 보다 효율성이 더 높고
		 * 생성자를 사용할 때 발생하는 필드변수에 잘못된 값이 추가되는 잠재적 오류를 줄이며
		 * 많은 객체를 List에 추가할 때 사용 가능한 패턴이다.
		 */
		scoreList.add(new ScoreVO.Builder().s_num("001").build());
		scoreList.add(new ScoreVO.Builder().s_kor(90).build());
		scoreList.add(new ScoreVO.Builder().s_kor(70).s_math(90).build());
		scoreList.add(new ScoreVO.Builder().s_kor(100).s_eng(80).s_math(75).build());
	}

}

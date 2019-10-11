package com.biz.designpattern.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.designpattern.domain.ScoreVO;

public class ScoreEx_01 {

	public static void main(String[] args) {

		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		ScoreVO scoreVO= new ScoreVO();
		
		// Build패턴으로 객체 생성
		ScoreVO scoreBVO = new ScoreVO.Builder()
				.s_num("001")
				.s_kor(90)
				.s_eng(80)
				.s_math(70).build();
		scoreList.add(scoreBVO);
	
		scoreList.add(new ScoreVO.Builder()
				.s_num("001")
				.s_kor(90)
				.s_eng(80)
				.s_math(70).build());
		
		// 빌드 패턴의 장점 
		// 객체를 생성하면서 필드 값을 주입하는 생성자의 기능 
		//  	+ 필드 이름과 같은 setter() method를 통해서 값을 주입하는 기능
		// 이 둘의 장점을 모아 만든 패턴
		// 1. 생성자를 통해 주입할 때 어떤 필드에 값을 주입하는지 불명확하여
		// 			잘 못 주입될 수 있는 단점 해결
		// 2. 별도로 객체를 생성하여 setter()를 통해 필드값을 주입하는 형태에서 
		//			별도로 객체를 만들지 않아도 값을 필드값을 초기화 할 수 있는 장점이 있다.
		// 3. 어떤 변수에 어떤값이 들어갔는지 명확하게 확인 가능
		// 4. 내가 현재 값을 주입하고싶은 변수만 사용 가능(다 사용하지 않아도 됨)
		scoreList.add(new ScoreVO.Builder()
				.s_num("003")
				.s_kor(100)
				.build());
		
		// 빌드패턴 생성자를 이용한 객체생성 및 list 추가
		scoreList.add(new ScoreVO.Builder().s_num("004").s_kor(100).build());
		scoreList.add(new ScoreVO.Builder().s_num("005").s_kor(100).build());
		scoreList.add(new ScoreVO.Builder().s_num("006").s_kor(100).build());
		
	}

}

package com.biz.arrays.exec.score;

import java.util.Random;

import com.biz.arrays.model.ScoreVO;


/*
 * ScoreEx_01 class에서는
 * ScoreVO class를 객체로 선언한 후
 * 멤버변수에 값을 저장하는 코드가 만들어져있다.
 * 
 * 이때 ScoreVO class 입장에서 바라보면
 * ScoreEx_01 class를 외부class라고 한다.
 * ScoreVO를 이용해서 무언가 코드를 수행하는 곳들(class, method)
 * 을 ScoreVO의 외부라고 한다.
 */
public class ScoreEX_01 {

	public static void main(String[] args) {

		ScoreVO[] sVO = new ScoreVO[20];
		Random rnd = new Random();
		
		// 선언된 sVO의 각 요소를 초기화 하고
		// 임의의 값으로 과목 점수를 setting
		for(int i = 0 ; i < sVO.length; i++) {
			
			// 각 과목의 점수를 달리하기 위해서
			// 과목별 별도 점수를 생성한다.
			int intKor = rnd.nextInt(50) + 51;
			int intEng = rnd.nextInt(50) + 51;
			int intMath = rnd.nextInt(50) + 51;
			
			String strNum = String.format("%03d", i+1);
			
			
			sVO[i] = new ScoreVO();
			sVO[i].strNum = strNum;
			sVO[i].intKor = intKor;
			sVO[i].intEng = intEng;
			sVO[i].intMath = intMath; 
			
			
			/* 
			 * return type : int형
			 * 1. 3 과목의 점수를 덧셈하여 intSum 멤버변수에 저장
			 * 
			 * 2. intSum 멤버변수는 private으로 제한이 된 상태이다.
			 * 		외부에서 과목 총점을 읽을 수 없는 상태이다.
			 * 
			 * 3. 그래서 sum() method가 대신
			 * 		 intSum 변수 값을 외부로 return 해 준다.
			 * 
			 * 4. 외부에서는 sum() method가 return해준 값을
			 * 		받아서 필요한 곳에서 처리 하면 된다. 
			 * 
			 * 5. intSum 멤벼변수는 3과목의 점수를 덧셈한 값을
			 * 		가지고 있어야 의미(필요)가 있는 변수이다.
			 * 		intSum 멤버변수를 직접 접근하여 값을 읽을경우
			 * 		과목 점수가 합산되지 않아 0이 저장되어 있을 
			 * 		(아주작은확률의)가능성도 있다.	
			 * 		확률이 작지만 실제 필요하지 않은 0의 값을 읽는것은
			 * 		코드 실행과정에서 논리적 오류가 날 수 있다.
			 * 
			 * 6. 이럴경우 intSum 변수를 외부로부터 격리하고(private)
			 * 		반드시 intSum 변수에 과목점수가 합산된 "결과"만
			 * 		외부에서 조회할 수 있도록 해야한다.
			 * 
			 * 7. intSum을 private으로 제한 == 정보의 은닉, 캡슐화
			 * 		가. 외부에서 직접 접근 금지
			 * 		나. sum() method를 통해서 intSum을 return 하도록 작성
			 * 		다. sum() method에서는 return문을 실행하기 전에
			 * 			과목 점수를 합산하여 intSum에 저장
			 */
			
			
			// == int intSum = intKor + intEng + intMath; 
			int intSum = intKor;
			intSum += intEng;
			intSum += intMath;
			
			// ScoreVO에 있는 intSum 변수는
			// 접근 제한자를 private으로 선언하였기 때문에
			// 외부에서 해당 변수에 접근할 수 없다.
			// sVO[i].intSum = intSum;
			
		}
		
		System.out.println("=================================");
		System.out.println("학번\t총점");
		System.out.println("=================================");
		for(int i = 0 ; i < sVO.length; i++) {
			System.out.printf("%s\t%d\n", 
					sVO[i].strNum, 
					sVO[i].sum());
		}
		System.out.println("----------------------------");
	}

}

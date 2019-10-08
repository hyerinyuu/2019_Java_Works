package com.biz.grade.service;

import java.util.Random;

import com.biz.grade.model.GradeVO;

public class GradeVoService02 {

	private GradeVO[] gradeVO;
	Random rnd ; 
	
	public GradeVoService02(int length) {
		
		gradeVO = new GradeVO[length];
		for(int i = 0 ; i < gradeVO.length; i++) {
			gradeVO[i] = new GradeVO();
		}
		
		rnd= new Random();
	}// GradeVoService end
		
	// Random을 이용해서 점수를 생성
	public void input() {
		
		// gradeVO 객체 배열의 개수만큼 반복하겠다.
		for(int i = 0 ; i < gradeVO.length ; i++) {
			
			// 학번을 00001 ~ 00000 형태로 만듦
			String strNum = String.format("%05d", (i+1));
			gradeVO[i].strNum = strNum;
			
			// 51부터 100 까지의 임의 숫자를 생성
			int intKor = rnd.nextInt(50) + 51;
			gradeVO[i].intKor = intKor;
			
			gradeVO[i].intEng = rnd.nextInt(50) + 51;
			gradeVO[i].intMath = rnd.nextInt(50) + 51;
			
		}
	}// input() end
	
	// 총점과 평균 계산

		
	
	
	public void total() {
		
		// 평균을 계산하여 gradeVO의 intAvg 변수에 저장
		
		for(int i = 0 ; i < gradeVO.length ; i++) {
			int intSum = gradeVO[i].intKor;
			intSum += gradeVO[i].intEng;
			intSum += gradeVO[i].intMath;
			gradeVO[i].intSum = intSum;
			gradeVO[i].intAvg = intSum / 3;
			
		}
	
			
		
	}
	


	public void view() {
		
		int intTotalKor = 0;
		int intTotalMath = 0;
		int intTotalEng = 0;
		int intTotalSum = 0;
		int intTotalAvg = 0;
		
		System.out.println("=====================================================");
		System.out.println("성적일람표");
		System.out.println("======================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("------------------------------------------------------");
		for(int i = 0 ; i < gradeVO.length ; i++) {
			System.out.printf("%s\t", gradeVO[i].strNum);
			System.out.printf("%3d\t", gradeVO[i].intKor);
			System.out.printf("%3d\t", gradeVO[i].intEng);
			System.out.printf("%3d\t", gradeVO[i].intMath);
			System.out.printf("%4d\t", gradeVO[i].intSum);
			System.out.printf("%3d\t", gradeVO[i].intAvg);
			System.out.printf("%3s\n", gradeVO[i].intRank);
			
			intTotalKor += gradeVO[i].intKor;
			intTotalEng += gradeVO[i].intEng;
			intTotalMath += gradeVO[i].intMath;
			intTotalSum += gradeVO[i].intSum;
			intTotalAvg += gradeVO[i].intAvg;
			
		}
		System.out.println("=======================================================");
		System.out.print("\t");
		System.out.printf("%3d\t", intTotalKor);
		System.out.printf("%3d\t", intTotalEng);
		System.out.printf("%3d\t", intTotalMath);
		System.out.printf("%3d\t", intTotalSum);
		System.out.printf("%3d\n", intTotalAvg / gradeVO.length);
		
		
		
		
	} // view end
	
	// 총점을 기준으로 내림차순 정렬을 수행하고
	// 1 ~ 배열개수 만큼 각각 값을 intRank 변수에 저장하여
	// 석차를 부여
	// 단, 도점자 처리는 하지않음(아직 복잡)
	public void rank() {
		for(int i = 0 ;i < gradeVO.length ; i++) {
			for(int j = i+1 ; j <gradeVO.length ; j++) {
				if(gradeVO[i].intSum < gradeVO[j].intSum) {
					
					// GradeVo 클래스를 이용하여
					// _temp 임시 객체를 선언하고
					// _temp에 gradeVO[i] 를 복사한다.
					// gradeVO[i]에 포함된 멤버변수들이
					// 통째로 _temp 변수에 복사가 된다.
					GradeVO _temp = gradeVO[i];
					gradeVO[i] = gradeVO[j];
					gradeVO[j] = _temp;
					
							
							
				}
			}
		} // for i end
		
		for(int i = 0 ; i < gradeVO.length ; i++) {
			gradeVO[i].intRank = i +1;
		}
		
	} // rank() end
		
	// 학번 순으로 다시 재 정려
	// == 학번 순번대로 오름차순 정렬
	
	public void sort() { 
		for(int i = 0 ; i < gradeVO.length ; i++) {
			for(int j = i + 1 ; j < gradeVO.length ; j++) {
				if(Integer.valueOf(gradeVO[i].strNum) 
					> Integer.valueOf(gradeVO[j].strNum)) {
					GradeVO _temp = gradeVO[i];
					gradeVO[i] = gradeVO[j];
					gradeVO[j] = _temp;
					}
			}
		}
		
	} // sort end

		
	}




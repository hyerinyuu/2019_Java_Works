package com.biz.grade.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.grade.model.GradeVO;

public class GradeServiceImp implements GradeService {

	protected List<GradeVO> grdList;
	protected Random rnd;
	
	
	public GradeServiceImp() {
		super();
		grdList = new ArrayList<GradeVO>();
		rnd = new Random();
	}

	@Override
	public void input(int count) {

		
		// 학번 생성
		for(int i = 0 ; i < count ; i++) {
			String strNum = String.format("%04d", (i+1));
			this.input(strNum);
		}
		
	}

	@Override
	public void input(String strNum) {
				
		GradeVO grdVO = new GradeVO();
		grdVO.setStrNum(strNum);
		
		
		int intKor = rnd.nextInt(50) + 51;
		int intEng = rnd.nextInt(50) + 51;
		int intMath = rnd.nextInt(50) + 51;
		
		grdVO.setIntKor(intKor);
		grdVO.setIntEng(intEng);
		grdVO.setIntMath(intMath);
		
		grdList.add(grdVO);
		
	}

	@Override
	public void total() {
		
		for(GradeVO vo : grdList) {
			int intTotal = vo.getIntKor() + vo.getIntEng() + vo.getIntMath();
			int intAvg = intTotal / 3;
			vo.setIntTotal(intTotal);
			vo.setIntAvg(intAvg);
		}
	}

	public void rank() {
		for(int i = 0 ; i < grdList.size() ; i++) {
			for(int j = i + 1 ; j < grdList.size(); j++) {
				
				// 별도 변수를 만든 이유 => if문 안에 grdList~~를 넣으면 너무 길어서 보기싫으니까
				int total_i = grdList.get(i).getIntTotal();
				int total_j = grdList.get(i).getIntTotal();
				
				// grdList.set(index,값) ==> 이미 추가된 list의 index 위치의 값을
				// 변경하고자 할 때
				if(total_i < total_j) {
					
					// scoreList의 두 위치 vo를 서로 교환
					GradeVO _vo = grdList.get(i);
					grdList.set(i, grdList.get(j));
					grdList.set(j, _vo);
					
				}
			}
		}
		
		int intRank = 1;
		for(GradeVO vo : grdList) {
			vo.setIntRank(intRank++);
		}
		
		
	}
	@Override
	public void list() {

		System.out.println("");
		System.out.println("점수표");
		System.out.println("=============================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("=============================================================");
		
		int nSize = grdList.size();
		for(int i = 0 ; i < nSize ; i++ ) {
			
			GradeVO vo = grdList.get(i);
			
			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getIntKor() + "\t");
			System.out.print(vo.getIntEng() + "\t");
			System.out.print(vo.getIntMath() + "\t");
			System.out.print(vo.getIntTotal() + "\t");
			System.out.print(vo.getIntAvg() + "\t");
			System.out.println(vo.getIntRank() + "\n");
			System.out.println("=============================================================");
			
		}
		
	}

}

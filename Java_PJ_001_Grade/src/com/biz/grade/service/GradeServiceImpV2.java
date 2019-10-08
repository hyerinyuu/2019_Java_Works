package com.biz.grade.service;

import java.util.Collections;
import java.util.Comparator;

import com.biz.grade.model.GradeVO;

public class GradeServiceImpV2 
	extends GradeServiceImp implements GradeService {
	
	/*
	 * method내의 익명클래스를 사용한 보조연산
	 */
	public void rank() {
		
		
		// grdList를 하나씩 쪼개서 comparator에게 보냄
		// comparator은 리스트1에 이어 리스트2를 또 요청해
		// 각각 o1과 o2에 담은 후 이 둘의 값을 비교한다(compare)
		// (1을 return하면 if(a>b)/ -1을 return하면 if(a<b) 로 비교해 정렬한다(정순/역순 정렬)
		// 
		Collections.sort(grdList, new Comparator<GradeVO>() {

			@Override
			public int compare(GradeVO o1, GradeVO o2) {
				return o2.getIntTotal() - o1.getIntTotal();
			}
		});
		int rank = 1;
		for(GradeVO vo : grdList) {
			vo.setIntRank(rank++);
		}
		Collections.sort(grdList, new Comparator<GradeVO>() {

			// 문자열
			@Override
			public int compare(GradeVO o1, GradeVO o2) {
				return Integer.valueOf(o1.getStrNum()) - Integer.valueOf(o2.getStrNum());
		
				
			// 정수형	
			/*
			 * return o1.getStrNum().compareTo(o2.getStrNum());
			 */
			
			
			}
		});
		
	}
}

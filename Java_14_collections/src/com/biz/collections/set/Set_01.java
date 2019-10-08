package com.biz.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_01 {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<String>();
		Set<String> strSet = new HashSet<String>();
		
		
		// List는 추가한 순서대로 저장됨
		// 추가한 데이터가 중복여부에 상관없이 모두 저장
		strList.add("홍길동");
		strList.add("이몽룡");
		strList.add("성춘향");
		strList.add("장보고");
		strList.add("임꺽정");
		strList.add("장보고");
		strList.add("장길산");
		strList.add("임꺽정");
		
		
		// Set은 어떤 원리 인지는 모르지만 자기 맘대로 저장함
		// 중복되는 저장값은 다시 저장되지 않음 ==> 중복 데이터 제외
		strSet.add("홍길동");
		strSet.add("이몽룡");
		strSet.add("성춘향");
		strSet.add("장보고");
		strSet.add("임꺽정");
		strSet.add("장보고");
		strSet.add("장길산");
		strSet.add("임꺽정");
		
		System.out.println(strList);
		System.out.println(strSet.toString());
		
		// List형 데이터를 set형 데이터로 변환
		// ==> List에 담긴 데이터에서 중복값을 제외하고 
		// 리스트를 얻고 싶을때 쓴다.
		Set<String> strSet1 = new HashSet<String>(strList);
		System.out.println(strSet1);
		
		strList = new ArrayList<String>(strSet1);
		System.out.println(strList);
		
		
	}
	

}

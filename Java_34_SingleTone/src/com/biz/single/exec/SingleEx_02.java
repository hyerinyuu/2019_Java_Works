package com.biz.single.exec;

import com.biz.single.service.SafeSingleClassV1;

public class SingleEx_02 {

	public static void main(String[] args) {

		
		// 굳이 SingleTone을 쓰는 이유 ==> thread Safe(안정성)를 위해
		// 스케줄대로 읽고 쓰기를 보장함
		
		 
		// ssc를 getinstance를 이용해 생성하고
		SafeSingleClassV1 ssc = SafeSingleClassV1.getInstanse();
		
		// name과 nation의 값을 생성해줌
		ssc.setName("홍길동");
		ssc.setNation("Republic of Korea");

		// ssc1을 하나 더 생성해서 name과 nation을 get함
		SafeSingleClassV1 ssc1 = SafeSingleClassV1.getInstanse();
		
		System.out.println("이름 >> " + ssc1.getName());
		System.out.println("고향 >> " + ssc1.getNation());
		
	}

}

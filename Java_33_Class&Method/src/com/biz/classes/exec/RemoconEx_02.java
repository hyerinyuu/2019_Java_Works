package com.biz.classes.exec;

import com.biz.classes.service.children.RadioClassV2;
import com.biz.classes.service.children.TvClassV2;
import com.biz.classes.service.parents.RemoConABSV2;

public class RemoconEx_02 {

	public static void main(String[] args) {

		// 자신으로 선언, 생성
		TvClassV2 tv1 = new TvClassV2();
		
		// 부모클래스로 선언, 자신의 생성자로 생성(초기화)(권장)
		// 인터페이스로 선언, 자신의 생성자로 생성 방식과 유사
		RemoConABSV2 tv = new TvClassV2();
		RemoConABSV2 radio = new RadioClassV2();
		
		tv.setName("TV");
		tv.power();
		tv.volUp();
		tv.volDown();
		tv.chUp();
		tv.chDown();
		
		
		
		radio.power();
		
		
		
	}

}

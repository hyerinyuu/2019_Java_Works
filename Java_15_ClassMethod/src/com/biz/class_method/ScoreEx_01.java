package com.biz.class_method;

/*
 *  19-09-11 ppt 내용
 */
import java.util.List;

public class ScoreEx_01 {

	public static void main(String[] args) {

		ScoreService sService = new ScoreService();
		int nTotal = sService.total();
		List<String> scList = sService.input(3);
		
		
		
		
	}

}

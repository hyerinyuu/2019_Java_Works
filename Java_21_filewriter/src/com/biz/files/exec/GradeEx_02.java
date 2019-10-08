package com.biz.files.exec;

import com.biz.files.service.GradeService;
import com.biz.files.service.GradeServiceV2;

public class GradeEx_02 {

	public static void main(String[] args) {

		GradeService gs = new GradeServiceV2();
		
		String fileName = "src/com/biz/files/성적일람표2.txt";
		
		try {
			gs.makeScoeFile(fileName, 30);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로세스 완료");
		
		
	}

}
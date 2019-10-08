package com.biz.grade.exec;

import com.biz.grade.service.GradeService;
import com.biz.grade.service.GradeServiceImpV2;

public class GradeEx_02 {

	public static void main(String[] args) {


	
		GradeService grdService = new GradeServiceImpV2();

		grdService.input(10);
		grdService.total();
		grdService.rank();
		grdService.list();
	
		
		
		
	}

}

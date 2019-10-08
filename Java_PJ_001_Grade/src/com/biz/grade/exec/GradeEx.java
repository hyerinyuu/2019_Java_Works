package com.biz.grade.exec;


import com.biz.grade.service.GradeService;
import com.biz.grade.service.GradeServiceImp;
import com.biz.grade.service.StudentService;
import com.biz.grade.service.StudentServiceImp;

public class GradeEx {

	public static void main(String[] args) {
	
		
		StudentService stdService = new StudentServiceImp();
		GradeService grdService = new GradeServiceImp();
		
		stdService.input(3);
		stdService.list();
		
		grdService.input(3);
		grdService.total();
		grdService.rank();
		grdService.list();
	
		

	}

}

package com.biz.grade.exec;

import com.biz.grade.service.StudentService;
import com.biz.grade.service.StudentServiceImp;

public class StudentEX {

	public static void main(String[] args) {

		StudentService stdService = new StudentServiceImp();
		
		stdService.input(3);
		stdService.list();
		
	}

}

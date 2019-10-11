package com.biz.lombok.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.lombok.domain.StudentVO;

import lombok.Getter;

// 필드변수가 있는 곳에 getter나 setter를 @처리하면 lombok으로 불러올 수 있음
@Getter
public class StudentReadServiceV1 {

	private List<StudentVO> stdList;
	FileReader fileReader;
	BufferedReader buffer;
	
	// 밖에서 stdList를 가져갈 수 있도록 return처리한 method
	public List<StudentVO> getStdList(){
		return stdList;
	}
	
	/*
	// stdList를 외부에서 읽을 수 있도록 getStdList 생성 
	public List<StudentVO> getStdList(){
		return this.stdList;
	}
	*/
	
	/*
	 * 파일로부터 학생정보를 읽어서 stdList에 저장
	 */
	public void readStudent(String fileName) throws Exception {
		
		stdList = new ArrayList<StudentVO>();
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			
			reader = buffer.readLine();
			if(reader == null) break;
			
			String[] students = reader.split(":");
			
			StudentVO stdVO = new StudentVO();
			
			stdVO.setS_num(students[StudentSettings.FILE.NUM]);
			stdVO.setS_name(students[StudentSettings.FILE.NAME]);
			stdVO.setS_tel(students[StudentSettings.FILE.TEL]);
			stdVO.setS_addr(students[StudentSettings.FILE.ADDR]);
			int grade = Integer.valueOf(students[StudentSettings.FILE.GRADE]);
			stdVO.setS_grade(grade);
			
			stdList.add(stdVO);
			
		}
		buffer.close();
		fileReader.close();
		
		
		
		
	}
	
	
}

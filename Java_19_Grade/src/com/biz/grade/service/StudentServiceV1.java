package com.biz.grade.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.biz.grade.domain.StudentVO;
import com.biz.grade.utill.StudentIDX;

public class StudentServiceV1 {

	// [List 와 Map의 차이]
	// [List] : add()를 이용해 데이터를 저장하고 하고 값을 꺼낼때는 get(index)를 사용, 순서대로 처리할때 주로 이용
	// 		  List는 ArrayList, LinkedList 생성한다.
	
	// [Map] : 순서에 관계 없이 put()을 이용해 데이터를 저장하고 값을 꺼낼때는 get(Key)를 사용한다. 순서를 무작위로 처리할 때 주로 이용
	// key, value
	// key 값으로 임의 데이터를 읽기 쉽도록 구조가 되어있다.
	// HashMap, TreeMap(자동정렬)으로 생성할 수 있다.
	//
	
	private Map<String, StudentVO> stdList;
	
	public StudentServiceV1() {
		
		// TreeMap : put된 데이터를 순서대로 자동정렬
		stdList = new TreeMap<String, StudentVO>();
	
	}
	
	public Map<String, StudentVO> stdList() {
		return this.stdList;
	}
	
	
	// student.txt 파일을 읽어서 stdList에 데이터 가져오기
	public void read(String stdFileName) throws Exception {
		
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(stdFileName);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			
			String[] stds= reader.split(":");

			/*
			 * stds[0] : 학번
			 * stds[1] : 이름
			 * stds[2] : 전화번호
			 * stds[3] : 주소
			 */
			StudentVO stdVO = new StudentVO();
			stdVO.setNum(stds[ StudentIDX.NUM ]);
			stdVO.setName(stds[ StudentIDX.NAME ]);
			stdVO.setTel(stds[ StudentIDX.TEL ]);
			stdVO.setAddr(stds[ StudentIDX.ADDR ]);
			
			// key값을 학번으로 지정하고 value 값을 stdVO로 지정
			stdList.put(stds[StudentIDX.NUM], stdVO);
			
		}// end while
		buffer.close();
		fileReader.close();
	}
	
	public void list() {
		// map의 key 부분만 추출해서 리스트로 볼 수 있도록 변환
		// stdList Map에서 Key부분만 추출하여 Set으로 자료 변환
		Set<String> stdNums = stdList.keySet();
		
		System.out.println("================================================================");
		System.out.println("학생명부");
		System.out.println("================================================================");
		System.out.println("학번\t이름\t전화번호\t주소");
		System.out.println("----------------------------------------------------------------");
		
		for(String key : stdNums) {
			
			// stdList에는 <String, StudentVO> 형태의 자료가 저장되어 있기 때문에
			// stdList.get("A001") 형태로 값을 추출하면
			// 			추출된 데이터는 StudetnVO type이 된다.
			// 따라서 stdList.get(key) method가 return하는 값을 변수에 담으려면
			// 			변수 type이 StudentVO이어야 한다.
			StudentVO stdVO = stdList.get(key);
			
			System.out.print(stdVO.getNum() + "\t");
			System.out.print(stdVO.getName() + "\t");
			System.out.print(stdVO.getTel() + "\t");
			System.out.print(stdVO.getAddr() + "\n");
			
		}
		System.out.println("================================================================");
		
		
	}// end List
	
	// 학번으로 학생정보를 조회하는 method
	public StudentVO getStudent(String strNum) {
		
		// StudentVO의 strNum에 값이 있으면 그 값을 return하고 없으면 null값 return
		return stdList.get(strNum);
		
		
		
	}
	
	
}

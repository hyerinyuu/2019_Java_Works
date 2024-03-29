package com.biz.files.exec;

import com.biz.files.service.NameService;
import com.biz.files.service.NameServiceV1;
import com.biz.files.service.NameServiceV2;

public class NameEx_02 {

	public static void main(String[] args) {
		
		/*
		 * 이름리스트.txt와 성씨리스트.txt 파일을 읽어서 리스트를 만들고
		 * 두 리스트의 값들을 임의 조합하여
		 * 3글자의 한국사람 이름을 생성하고
		 * 한국인이름.txt파일로 저장하시오
		 * 
		 * 단, 
		 * 1. 성씨는 한자는 제외하고 한글 1글자만 사용
		 * 2. 한국인 이름 리스트는 총 100개로 생성하기
		 * 
		 * 3. 이름리스트.txt에 나오는 이름 순서와
		 * 	  성씨리스트.txt에 나오는 성씨 순서가 일치하지 않도록 하기
		 * 
		 * 4. Service 클래스를 작성하여 과제를 수행하시오
		 */
		System.out.printf(" 시작 : %d\n", System.currentTimeMillis());
		
		NameService ns = new NameServiceV2();
		
		String nameFile = "src/com/biz/files/이름리스트.txt";
		String famFile = "src/com/biz/files/성씨리스트.txt";
		String korNameFile = "src/com/biz/files/한국인이름들.txt";
		
		try {
			ns.readFamList(famFile);
			ns.readNameList(nameFile);
			ns.writeNameFile(korNameFile);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
}

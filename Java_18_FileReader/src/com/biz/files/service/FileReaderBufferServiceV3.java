package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferServiceV3 {
	
	FileReader fileReader;
	BufferedReader buffer;
	
	public void read(String fileName) throws IOException {
	
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
		
		String reader = ""; // 현재 reader값을 null값으로("";) 초기화 했기 때문에 while문은 전혀 실행이 안됨.
	
		/*
		 * 먼저 buffer에서 한줄을 읽고 console에 표시한 다음 
		 * null이 아니면 계속해서 다음줄을 읽어라
		 * V2의 if문을 없애는 방법이지만 reader의 마지막 값까지 읽고 난 후 reader에 더이상 값이 없으면 null로 저장함.  
		 * do while문의 경우 주의해야할 점이 많기 때문에 그냥 while문을 쓰고 if문 쓰는게 나음
		 * (do while이 오히려 오류를 줄이려고 코드를 더 많이 생성해 코드낭비가 생길 수 있음)
		 * 
		 */
		do {
			reader = buffer.readLine();
			System.out.println(reader);
		}while(reader != null);
	
		
		
		/*
		while(reader != null) {
		
			reader = buffer.readLine();
			if(reader == null) break;
			System.out.println(reader);
		}
		*/
		
		
		
		buffer.close();
		fileReader.close();
	}
	
	
	
	
	
}

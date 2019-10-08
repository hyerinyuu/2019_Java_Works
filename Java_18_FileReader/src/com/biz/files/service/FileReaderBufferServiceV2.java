package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferServiceV2 {
	
	FileReader fileReader;
	BufferedReader buffer;
	
	public void read(String fileName) throws IOException {
	
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
		
		// buffer.readLine()은 파일에서 한줄(~~~\n)까지를 읽는다.
		// buffer.readLine()이 반복해서 실행될 때마다
		// 계속해서 다음줄의 문자열을 읽어 들이도록 되어 있다.
		// 파일에 저장된 문자으이 줄 수 만큼 buffer.readLine()을 반복해서 실행하면
		// 모든 파일의 모든 내용을 읽을 수 있을것이다.
		
		// 실제 줄 수가 몇개인지 모르므로 for문 대신 while문을 사용
		while(true) {
		
			String reader = buffer.readLine();
			if(reader == null) break;
			System.out.println(reader);
		}
		
		// close() method : resource를 반납하는 기능
		// close()를 실행 할때는 buffer를 먼저 close하라.
		buffer.close();
		fileReader.close();
	}
	
	
	
	
	
}

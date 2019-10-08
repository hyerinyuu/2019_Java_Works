package com.biz.files.service;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderServiceV1 {

	FileReader fileReader = null;
	
	/*
	 * 만약 read(String fileName) method가 실행되는 동안
	 * exception이 발생을 하면
	 * read() method를 호출한 곳으로 exception을 toss하라
	 */
	public void read(String fileName) throws IOException {
		
		fileReader = new FileReader(fileName);
		while(true) {
			int al = fileReader.read();
			
			/*
			 * fileReader.read() method를 실행했을때
			 * 파일을 모두 읽은 이후 또 method를 실행하면
			 * al변수에 -1이 담긴다.
			 * 그런데 간혹, 파일을 모두 읽은 이후 
			 * -1보다 더 작은(음수) 값들이 읽히는 경우가 있다.
			 * 이럴때 == 1을 사용하면 break문을 건너 뛰고 이후 코드를 실행해
			 * 이후 코드에서 오류가 발생할 수도 있다.
			 * 
			 * 이런 오류를 방지하기 위해서
			 * if(al == -1)이 아닌 if(al < 0) 코드 사용을 권장
			 */
			// if(al < -1) break; ==> 코드가 불안정적임(오류 가능성)
			if(al < 0) break;
			
			System.out.printf("%d : %c\n",al, al);
		}
		
	}
	
	
}

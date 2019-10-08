package com.biz.stream.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamEx_01 {

	public static void main(String[] args) {
		
		String imgFile = "src/com/biz/stream/2019 (1).png";

		/*
		 * [FileInputStream]
		 * 파일을 byte 단위로 읽을 수 있는 class
		 * text파일, 그림파일, 영상파일, 음악파일 등 모든 파일을 읽을 수 있다.
		 */
		
		// 1. Stream 클래스를 객체 선언할 때 일단 null 값으로 초기화를 하라
		FileInputStream fs = null;
		
		// 파일을 1byte씩 읽어서 console에 보여주는 코드
		try {
			
			// 2. 실제 파일을 open하여 읽을 준비를 하고
			fs = new FileInputStream(imgFile);
			int input = 0;
			while(true) {
				
				// 3. 1byte씩 읽어서 변수에 저장
				input = fs.read();
				if(input == -1) break;  // == 파일을 모두 읽었으면(-1) 반복을 끝내라
				
				// input 변수에 담긴 값을 16 진수로 표현해라(x를 대문자로 쓰면 대문자로 나옴)
				System.out.printf("%02x\n",input); // 한자리 수 -> 1byte(앞에 0이 생략되어있음)
			}
			// 4. 파일 읽기가 끝나면 가급적 파일을 닫아주는 것이 좋음
			fs.close(); 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("Hello Korea!");
		
		
	}

}

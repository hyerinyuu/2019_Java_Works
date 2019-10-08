package com.biz.stream.exec;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedEx_01 {

	public static void main(String[] args) {

		String imgFile = "src/com/biz/stream/2019 (2).png";
		
		FileInputStream fs = null;
		BufferedInputStream buffer = null;
		
		/*
		 * [BufferedInputStream]
		 * FileInputStream으로 오픈된 파일을 읽어서 buffer 메모리에 임시 저장
		 * read()를 통해서 buffer로부터 값을 읽음
		 */
		try {
			fs = new FileInputStream(imgFile);
			buffer = new BufferedInputStream(fs);
			
			byte[] bytes = new byte[32];
			buffer.read(bytes);
			
			for(int i = 0 ; i < bytes.length ; i++) {
				System.out.printf("%02x ", bytes[i]);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		
	}

}

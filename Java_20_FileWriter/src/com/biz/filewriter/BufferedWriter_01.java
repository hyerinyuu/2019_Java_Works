package com.biz.filewriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_01 {

	public static void main(String[] args) {

		String fileName = "src/com/biz/filewriter/data2.txt";
		
		FileWriter fileWriter ;
		BufferedWriter buffer ;
		
		try {
			fileWriter = new FileWriter(fileName);
			buffer = new BufferedWriter(fileWriter);
			
			String str 
				= String.format("%20s\n", "Republic of Korea");

			// buffer.write() method로 데이터를 기록하면 
			// 메모리에 buffer 영역을 만들고 데이터를 기록한다.
			// buffer 메모리 영역이 가득 차면
			// JVM과 OS는 자동으로 해당 내용을 파일에 기록한다.
			buffer.write(str);
			
			// 현재 buffer에 저장되어있는 내용을 파일에 강제로 기록하라
			// [flush가 close와 다른점]
			// close는 한번 닫으면 그 아래에 새로운 내용을 기록 못하지만
			// flush는 사용한 후에도 그 아래에 writer()를 다시 실행가능함.
			buffer.flush();
			
			buffer.write("12345");
			
			// 더이상 파일에 기록을 하지 않겠다는 선언
			buffer.close();
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}

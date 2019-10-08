package com.biz.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Print_01 {

	public static void main(String[] args) {

	String fileName = "src/com/biz/files/data3.txt";
		
		FileWriter fileWriter = null;
		BufferedWriter buffer = null;
		
		// write를 사용하지 않고 (system out)print를 사용해 파일 내용을 기록할 수 있게 해줌
		// ### [PrintWriter class]
		// ### System.out.print*() 의 console 출력 method와 같은 형식으로 파일에 text를 기록하기 위해서 활용 ###
		PrintWriter out = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			buffer = new BufferedWriter(fileWriter);
			out = new PrintWriter(buffer);
			
			out.println("대한민국만세");
			out.printf("%5d\n", 100);
			out.printf("우리나라만세\n");
			
			out.flush();
			out.println("대한민국만세");
			out.printf("%5d\n", 100);
			out.printf("우리나라만세\n");
			
			out.close();
			buffer.close();
			fileWriter.close();
					
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}

package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Print_04 {

	public static void main(String[] args) {

		String fileName = "src/com/biz/files/data4.txt";
		
		FileWriter fileWriter = null;
		PrintWriter fileOut = null;
		
		try {
			
			/*
			 * FileWriter로 파일을 open하고
			 * PrintWriter에 주입을 하면
			 * 
			 * PrintWriter의 두번째 method로 method를 지정해
			 * 		flush() method를 자동으로 실행할 수 있다.
			 * 
			 * 자동 flush는 print() method를 실행할 때마다 기록이 되는 것이 아니고,
			 * 		내부에서 buffer를 별도로 관리하면서 내용을 기록한다.
			 * 
			 * 자동 flush는 안정성을 보장 못함.
			 * 
			 */
			fileWriter = new FileWriter(fileName);
			fileOut = new PrintWriter(fileWriter,true);
			
			fileOut.println("우리나라만세");
			fileOut.println(30 * 40);
			fileOut.println(200 % 2);
			
			fileOut.printf("%5d\n", 30+40);
			fileOut.print("Republic of Korea\n");
			
			fileOut.flush();
			fileOut.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		
		}
		
		
	}

}

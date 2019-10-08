package com.biz.filewriter;

import java.io.FileWriter;
import java.io.IOException;

/*
 * Text 파일을 생성해서 내용을 기록하는 방법
 */
public class FileWriter_01 {

	public static void main(String[] args) {

		String fileName = "src/com/biz/filewriter/data.txt";
		
		FileWriter fileWriter ;
		
		try {
			fileWriter = new FileWriter(fileName);
			fileWriter.write("대한민국만세");  // String
			fileWriter.write(97);  // char형 코드, ASCII
			
			for(int i = 97; i < 124 ; i++) {
				fileWriter.write(i);
			}
			
			fileWriter.write(13);  // \n과 같은 ASCII == Enter key값
			
			// char는 실제적으로 문자의 ASCII 코드값의 int형과 유사하기 때문에
			// int문과 연관하여 코드 작성 가능
			for(int i = 'A'; i < 'Z'; i++) {
				fileWriter.write(i);
			}
			// 파일을 기록할 때 write() method는 직접 파일을 기록하지만
			// JVM이 임시로 기억장치 어딘가에 모아둔다.
			// 만약 close()를 하지 않고 프로젝트가 끝나면
			// JVM이 모아둔 데이터는 사라져버린다.
			// close()를 실행하면 JVM이 OS에게 해당 데이터를 전달하고 파일에 기록해달라고 요청을 수행함.
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}

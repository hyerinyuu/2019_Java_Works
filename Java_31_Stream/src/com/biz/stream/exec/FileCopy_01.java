package com.biz.stream.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

public class FileCopy_01 {

	// [바이너리파일의 복사]
	// -> 2019 ().png 파일 복사하기
	public static void main(String[] args) {
		
		String imgSrcFile = "src/com/biz/stream/2019 (3).png";
		String imgCopyPath = "src/com/biz/stream/";
		Random rnd = new Random();
		
		/*
		 * 인터페이스와 기능이 비슷한 추상클래스
		 */
		InputStream is = null;
		OutputStream os = null;
		
		try {
			// 원본파일 open
			is = new FileInputStream(imgSrcFile); 
			
			// 랜덤값으로 파일 이름 생성
			// math.abs() : 정수의 절대값을 계산하는 method
			imgCopyPath += Math.abs(rnd.nextInt()) + ".png";
			os = new FileOutputStream(imgCopyPath);
			
			// 한번에 파일을 읽어서 복사할 용량(== 한번에 1kbyte씩 복사해서 옮겨라)
			byte[] bytes = new byte[1024]; 	// 1kbyte = 1024
			while(true) {
				/*
				 * FileInputStream의 read() method에 
				 * byte배열을 매개변수로 전달을 하면
				 * 파일에서 읽은 내용(data)을 byte배열에 담아 전달을 하고
				 * byte배열에 담은 데이터 개수를 return 해준다.
				 */
				int length = is.read(bytes);
				// read() method가 return한 값이 1미만이면 파일을 모두 읽었다고 판단
				if(length < 1) break;
				// 읽은 값을 bytes에 담고 
				os.write(bytes);
				
			}
			is.close();
			os.close();
			System.out.println("File Copy Ok!!!");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

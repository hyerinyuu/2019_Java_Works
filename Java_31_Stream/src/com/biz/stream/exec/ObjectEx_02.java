package com.biz.stream.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class ObjectEx_02 {

	public static void main(String[] args) {

		String objSaveFile = "src/com/biz/stream/obj.dat";
		
		InputStream is = null;
		ObjectInput obj = null;
		
		try {
			/*
			 * ObjectEx_01에 변수를 class형식으로 선언
			 * 이 3개의 변수를 obj.dat로 저장함(byte방식의 파일)
			 * ObjectEx_02에서 이 3개의 변수를 또 다른 변수에 담음
			 * 
			 * 변수(내 컴퓨터에서만 읽기 가능)에 값을 넣어서 파일로 저장 
			 * -> 파일 읽어서 다시 변수에 세팅해서 그 값을 읽을 수 있음(파일로 변수 전달)
			 * 데이터베이스를 사용하지 않고 파일로 값을 읽고싶을때 사용 가능(거의 사용 안함)
			 */
			is = new FileInputStream(objSaveFile);
			obj = new ObjectInputStream(is);
			String strName = (String)obj.readObject();
			String strNation = (String)obj.readObject();
			Integer intYear = (Integer)obj.readObject();
			
			System.out.println("strName : " + strName);
			System.out.println("strNation : "+ strNation);
			System.out.println("intYear : " + intYear);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}

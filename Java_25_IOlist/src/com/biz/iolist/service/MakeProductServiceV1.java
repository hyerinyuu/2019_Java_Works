package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MakeProductServiceV1 {

	protected List<String> proNameList;
	protected List<String> productList;
	
	
	public MakeProductServiceV1() {
		// TODO 생성자 
		proNameList = new ArrayList<String>();
		productList = new ArrayList<String>();
		
	}
	
	/*
	 * 1. 과자이름.txt파일이름을 proFileName변수로 받기
	 * 2. proFileName을 읽어서 과자이름List 추출
	 * 3. 임의의 숫자를 발생시켜 과자 가격을 부착해
	 * 4. 과자정보를 생성
	 * 5. 다른곳에서 사용할 수 있도록 return 수행
	 */
	public void getProduct(String proFileName, 
			String proWriteFile) throws Exception {
		
		
		FileReader fileReader = new FileReader(proFileName);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		
		while(true) {
			
			reader = buffer.readLine();
			// break : if조건이 true이면 반복문을 중단하라
			if(reader == null) break;
			// continue : if 조건이 true이면 while() 이후 코드를 무시하고
			// 반복문 시작부분으로 jump하라
			if(reader.length() < 1) continue; 
			proNameList.add(reader);
		}
		buffer.close();
		fileReader.close();
		/*
		 * 파일을 읽기 위해서 FileReader, BufferedReader로 open을 한 후
		 * while() 반복문 내에서 한줄씩 읽어서
		 * 여러가지 연산을 수행하는 과정에서
		 * 
		 * 연산수행시간이 오래 걸리거나 어떤 exception이 발생할 확률이 조금이라도 있다면
		 * 		 중간에 읽고있는 파일이 손상될 가능성이 있기 때문에
		 * 
		 * 읽어들인 문자열(reader 변수에 담긴 값)을 
		 * List<String> type의 list로 생성을 하고
		 * 
		 * 파일을 close() 한 후 
		 * 생성된 list를 사용하여 다른 연산을 수행하자
		 */
		
		for(String pro : proNameList) {
			
			// [Math] 
			// 수학연산과 관련된 여러 method()를 가지고 있는 java의 클래스
			// random과 Math의 차이 : 굳이 클래스를 객체로 생성하지 않고도 간단하게 난수 발생 가능
			
			// 상품가격을 800원~5000원 까지의 임의 값을 생성
			int price = (int)(Math.random() * (5000 - 800 +1 ) + 800);
			String product = String.format("%s:%d", pro,price);
			productList.add(product);
			
		}
		
		PrintWriter fileOut = new PrintWriter(proWriteFile);
		for(String pro : productList) {
			
			fileOut.println(pro);
			
		}
		fileOut.close();
		
		
	}
	
	
	
	
}

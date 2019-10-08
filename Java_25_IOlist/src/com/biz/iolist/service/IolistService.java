package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IolistService {

	protected List<String> proList;
	protected List<BuyVO> buyList;
	Random rnd;
	
	/*
	 * 상품정보.txt 파일을 읽어서 
	 * 임의의 상품정보를 추출한 후
	 * 
	 * 상품매입정보를 생성
	 * 1. 날짜 : 2019-09-26
	 * 2. 단가 : 상품정보의 상품단가에서 부가세를 제외한 금액
	 * 3. 부가세 : (상품정보의 상품단가) - 2.단가
	 * 4. 수량 : 10 ~ 100 사이의 임의의 수
	 * 5. 합계 : 단가 * 수량
	 * 
	 * 날짜 상품이름 단가 부가세 수량 합계
	 * 
	 * 생성된 상품매입정보를 20개 생성하여 buyList에 추가하기
	 */
	
	public IolistService() {
		// TODO 생성자
		proList = new ArrayList<String>();
		buyList = new ArrayList<BuyVO>();
		
	}
	
	public void ReadProduct(String proFileName) throws Exception {
		
		FileReader fileReader = new FileReader(proFileName);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null )break;
			
			if(reader.length() < 1 ) continue;
			proList.add(reader);
			
			
		}
		buffer.close();
		fileReader.close();
		
		
		
	}
	
	public void buyMake() {
		Random rnd = new Random();
		int nSize = proList.size();
		
		for(int i = 0 ; i < 20 ; i++) {
			
			// proList 개수의 범위 내에서 정수 1개를 임의 생성하라
			int index = rnd.nextInt(nSize);
			// 임의의 상품정보 추출하기
			String strProduct = proList.get(index);
			
			
			String[] pros = strProduct.split(":");
			BuyVO buyVO = new BuyVO();
			
			// 10~100까지 임의의 상품 수량 생성
			rnd = new Random();
			int intQty = rnd.nextInt(100) + 10;
			
			// 부가세 계산
			int price = (Integer.valueOf(pros[1]));
			int amt = (int) (price * 1.1);
			int vat = price - amt;
			// 상품단가
			price = price - vat;
			// 상품합계
			int total = price * intQty;
				
			buyVO.setDate("2019-09-26");
			buyVO.setProName(pros[0]);
			buyVO.setPrice(price);
			buyVO.setVat(vat);
			buyVO.setQty(intQty);
			buyVO.setTotal(total);
			
			buyList.add(buyVO);
			
		}
		
		
		
	}
	
	
	
	
}

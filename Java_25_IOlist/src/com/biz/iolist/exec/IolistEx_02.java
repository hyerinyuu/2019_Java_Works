package com.biz.iolist.exec;

import java.util.List;

import com.biz.iolist.service.MakeProductServiceV2;
import com.biz.iolist.service.WriteProductService;

public class IolistEx_02 {

	public static void main(String[] args) {
		
		// 생성, 선언, 실제 코드작성하는 곳을 나눠서 가독성 높은 코드를 쓰기
		// upgrade 하기 훨씬 편함
		
		
		String strProFileName = "src/com/biz/iolist/과자이름.txt";
		String strProWriteFile = "src/com/biz/iolist/상품정보.txt";
		
		
		MakeProductServiceV2 ms = new MakeProductServiceV2();
		WriteProductService ws = new WriteProductService();
		
		try {
			
			List<String> productList = ms.getProductList(strProFileName);
			ws.setProList(productList);
			ws.productWrite(strProWriteFile);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}

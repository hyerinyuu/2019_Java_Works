package com.biz.iolist.exec;

import java.util.List;

import com.biz.iolist.service.MakeProductServiceV2;
import com.biz.iolist.service.WriteProductService;

public class IolistEx_03 {

	public static void main(String[] args) {

		
		String strProFileName = "src/com/biz/iolist/과자이름.txt";
		String strProWriteFile = "src/com/biz/iolist/상품정보.txt";
		
		MakeProductServiceV2 ms = new MakeProductServiceV2();
		
		try {
			List<String> productList = ms.getProductList(strProFileName);
			
			// WriteProductService를 선언하면서 매개변수로 productList를 주입함
			WriteProductService ws = new WriteProductService(productList);
			ws.productWrite(strProWriteFile);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}

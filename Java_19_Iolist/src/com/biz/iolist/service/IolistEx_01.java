package com.biz.iolist.service;

public class IolistEx_01 {

	public static void main(String[] args) {

		IolistServiceImpV1 io = new IolistServiceImpV1();
		String iolist = "src/com/biz/iolist/매입매출정보.txt";
		
		try {
			io.read(iolist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}

package com.biz.iolist.service;

public class IolistEx_02 {

	public static void main(String[] args) {

		IolistServiceImpV2 io = new IolistServiceImpV2();
		String iolist = "src/com/biz/iolist/매입매출정보.txt";
		
		try {
			io.read(iolist);
			io.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}

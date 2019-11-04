package com.biz.thread.classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Cal_02 extends Thread{

	static SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");


	@Override
	public void run() {
		
		Calendar ca2 = Calendar.getInstance();
		ca2.set(2019,Calendar.JANUARY,30);
		Date date2 = ca2.getTime();
		
		
		for(int i = 0 ; i < 100 ; i++) {
			
			String curDate = Cal_02.sd.format(date2);
			System.out.println("Thread1 : " + curDate);
			
		}
	}
}






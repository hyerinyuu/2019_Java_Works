package com.biz.thread.classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimStaticClass extends Thread{

	static SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");


	@Override
	public void run() {
		
		Calendar ca1 = Calendar.getInstance();
		ca1.set(2019,Calendar.OCTOBER,10);
		Date date1 = ca1.getTime();
		
		
		for(int i = 0 ; i < 100 ; i++) {
			
			String curDate = SimStaticClass.sd.format(date1);
			System.out.println("Thread1 : " + curDate);
			
		}
	}
}






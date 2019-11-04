package com.biz.thread.exec;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.biz.thread.classes.Cal_01;
import com.biz.thread.classes.Cal_02;

public class CalendarEx_01 {

	static SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
	
	public static void main(String[] args) {
		
		Cal_01 ca1 = new Cal_01();
		ca1.start();
		
		Cal_02 ca2 = new Cal_02();
		ca2.start();
		
		
		
	}
	
}	

package com.biz.date.exec;

import java.util.Calendar;

public class CalendarEx_01 {

	public static void main(String[] args) {

		/*
		 * Java에서 Date 클래스를 사용해서 날짜 관련 연산을 수행하는 과정에서 많은 이슈가 있어서 
		 * 개선을 위해 Calendar이라는 클래스를 만들었다.
		 * 그런데 이 Calendar도 상당히 많은 이슈를 그대로 가지고 있다.
		 * 하지만 날짜 관련된 연산을 Date 클래스에서 제거하면서 Calendar를 사용한다.
		 * 
		 * *************Calendar는 생성자로 객체를 생성할 수 없다.*************
		 *  Calendar는 static변수
		 *  calendar는 싱글톤객체
		 *  1개의 프로젝트에서 공통으로 공유하는 객체이기 때문에 생성자가 없다.
		 *  
		 *  객체를 만드는게 아니라 이미 생성되어있는 객체를
		 *  getInstance() method를 통해서 가져다 쓴다.
		 */
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("올해 : " + calendar.get(Calendar.YEAR));
		System.out.println("현재 월 : " + calendar.get(Calendar.MONTH));
		System.out.println("오늘 : " + calendar.get(Calendar.DAY_OF_MONTH));
		
		// 24시간제
		System.out.println("현재 시(24시간제) : " + calendar.get(Calendar.HOUR_OF_DAY));
		// 12시간제
		System.out.println("현재 시(12시간제) : " + calendar.get(Calendar.HOUR));
		
		
		System.out.println("현재 분 : " + calendar.get(Calendar.MINUTE));
		System.out.println("현재 초 : " + calendar.get(Calendar.SECOND));
		
		System.out.printf("현재 시각 : %02d:%02d:%02d", calendar.get(Calendar.HOUR_OF_DAY),
											calendar.get(Calendar.MINUTE),
											calendar.get(Calendar.SECOND));
		
		
		
	}

}

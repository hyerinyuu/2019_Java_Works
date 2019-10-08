package com.biz.date.exec;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeEx_01 {

	public static void main(String[] args) {

		LocalDateTime local = LocalDateTime.now();
		
		System.out.println(local.toString());
		System.out.println("올해 : " + local.getYear());
		System.out.println("이달 : " + local.getMonth());
		System.out.println("오늘 : " + local.getDayOfYear());
		
		System.out.printf("%02d:%02d:%02d\n",
				local.getHour(),
				local.getMinute(),
				local.getSecond());
				
		// 현재 local변수에 담긴 날짜에 3일을 더해라
		local.plusDays(3);
		System.out.println(local.plusDays(3).toString());  // +3일		
		System.out.println(local.minusDays(3).toString()); // -3일
		System.out.println(local.plusMonths(3).toString()); // +3개월
		System.out.println(local.minusMonths(3).toString()); // -3개월
		
		System.out.println(local.plusHours(3).toString()); // +3시간
		System.out.println(local.minusHours(3).toString()); // -3시간
		
		System.out.println("=====================================================================");
		
		System.out.println("올해 첫날 : " + local.with(TemporalAdjusters.firstDayOfYear()));  
		System.out.println("내년 첫날 : " + local.with(TemporalAdjusters.firstDayOfNextYear()));
		System.out.println("올해 마지막 날 : " + local.with(TemporalAdjusters.lastDayOfYear()));
		System.out.println("이달의 첫 날 : " + local.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println("이달의 마지막 날 : " + local.with(TemporalAdjusters.lastDayOfMonth()));
		
		System.out.println("이주의 첫번째 날짜(월요일부터) : " + local.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
		System.out.println("이주의 첫번째 날짜(일요일부터) : " + local.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY)));
				
		System.out.println("이번달의 마지막 일요일 날짜 : " + local.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY)));
		System.out.println("이번달의 마지막 금요일 날짜 : " + local.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY)));
		
		
		// 만약 오늘이 일요일이면 오늘 날짜
		System.out.println("다음주 일요일(오늘을 포함해서) : " + local.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)));
				
		// 만약 오늘이 일요일이면 오늘 날짜
		System.out.println("지난주 일요일(오늘을 포함해서) : " + local.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY)));
		
		
		// 임의의 시간 생성
		LocalDateTime makeDateTime = LocalDateTime.now();
		
		makeDateTime = makeDateTime.withYear(2000);
		makeDateTime = makeDateTime.withMonth(9);
		makeDateTime = makeDateTime.withDayOfMonth(29);
		
		makeDateTime = makeDateTime.withHour(10);
		makeDateTime = makeDateTime.withMinute(12);
		makeDateTime = makeDateTime.withSecond(22);
		
		System.out.println("임의의 날짜/시간 생성 : " + makeDateTime.toString());
		
		LocalDateTime t = LocalDateTime.now();
		
		int curMonth = t.getYear();
		int p3Month = t.plusYears(2).getYear();
		
		System.out.printf("2년 후 년도와 현재 년도를 뺀 값 : %d - %d = %d", p3Month, curMonth, p3Month - curMonth);
		
		
	}

}

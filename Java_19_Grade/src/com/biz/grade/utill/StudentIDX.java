package com.biz.grade.utill;

/*
 * [static class의 또 다른 용도]
 * 
 * 배열을 사용한 데이터를 처리할 때 
 * 배열의 요소를 보통 숫자값으로 지정하여 데이터를 읽거나 저장하는데
 * 숫자값은 사람이 보면 쉽게 기억하기 어려운 데이터이다.(논리적오류 줄어듦)
 * 
 * 이럴때
 * 숫자값들을 저장하는
 * static class의 static변수를 선언해주고
 * 숫자값을 사용해야 할 곳에 static 변수를 지정하여 사용할 수 있다.
 * 
 * [final keyword]
 * 변수를 선언하고, 값을 최초에 한번 저장을 하면
 * 이후에 값을 변경, 삭제할 수 없도록 한다. == 상수화 keyword
 */
public class StudentIDX {
	
	/*
	 * member변수에 static keyword를 부착하면
	 * 이 변수가 포함된 class는 자동으로 static class가 된다.
	 */
	// static class는 직접 호출해서 사용가능
	public final static int NUM = 0;
	public final static int NAME = 1;
	public final static int TEL = 2;
	public final static int ADDR = 3;
	
}

package com.biz.iolist.exec;

import com.biz.iolist.service.IolistService;
import com.biz.iolist.service.IolistServiceImpV2;

/*
 * 그동안 판매관리 APP을 사용해 일반미 판매를 잘 관리함
 * 
 * 사용중 업데이트가 필요함
 * 업데이트 내용 : 햇반판매를 시작해 판매관리를 변경해야함
 * 
 * ==> 일반미 : 단가 * 수량 = 판매금액의 계산만 필요했지만
 * ==> 햇반 : 추가로 부가가치세(VAT : value Added Tax) 계산이 필요함 
 *
 * 햇반판매를 위한 새로운 프로젝트 제작XXX
 * ---> 기존에 사용한 IolistService 클래스를 카피해 일부코드만 변경해서 사용가능
 * 
 *  객체지향언어인 java의 상속(inheritance)기능을 이용해 기존 코드를 상속받아
 *  추가코드를 더해 기능을 확장해서 사용가능
 *  
 *  상속시키는 근본 목적은 코드를 그대로 사용하는데 있지 않고
 *  기존 코드를 이용하거나 새로이 변경해 확장, 추가해 upgrade하는데 있다.
 * 
 */
public class IolistEx_02 {

	public static void main(String[] args) {
		IolistService ioService = new IolistServiceImpV2();
		
		ioService.input(5);
		ioService.total();
		ioService.list();
		
		
		
	}

}

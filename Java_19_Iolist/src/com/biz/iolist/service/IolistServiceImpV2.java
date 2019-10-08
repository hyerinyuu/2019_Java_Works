package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.iolist.domain.IolistVO;

public class IolistServiceImpV2 implements IolistService {

	protected List<IolistVO> ioList;
	
	public IolistServiceImpV2() {
		ioList = new ArrayList<IolistVO>();
	}
	
	
	@Override
	public void read(String fileName) throws Exception {

		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			/*
			 * EOF(End Of File)에 다다르면 반복문을 종료하라는 명령
			 */
			if(reader == null) break;
			
			// 문자열을 분리(분해)하여 token 생성
			String[] ios = reader.split(":");
			/*
			 * ios[0]  : 날짜
			 * ios[1]  : 상품명
			 * ios[2]  : 매입매출구분, 1:매입, 2:매출
			 * ios[3]  : 단가
			 * ios[4]  : 수량
			 */
			
			// 생성된 token을 vo에 담기
			IolistVO ioVO = new IolistVO();
			
			
			// 1. ios배열요소를 직접 VO에 setting하기
			ioVO.setStrDate(ios[0]);
			ioVO.setStrPname(ios[1]);
			ioVO.setStrIO(ios[2]);
			ioVO.setIntPrice(Integer.valueOf(ios[3]));
			ioVO.setIntQty(Integer.valueOf(ios[4]));
			
			// 2. 변수를 선언하여 변수에 ios배열 요소를 담고 변수를 VO에 Setting
			String strDate = ios[0];
			String strPname = ios[1];
			String strIO = ios[2];
			int intPrice = Integer.valueOf(ios[3]);
			int intQty = Integer.valueOf(ios[4]);
					
			ioVO.setStrDate(strDate);
			ioVO.setStrPname(strPname);
			ioVO.setStrIO(strIO);
			ioVO.setIntPrice(intPrice);
			ioVO.setIntQty(intQty);
			
			// vo를 list에 추가
			ioList.add(ioVO);
			
		}
		buffer.close();
		fileReader.close();
		
	}

	@Override
	public void list() {
		
		
	
		
		for(IolistVO vo : ioList) {
			System.out.print(vo.getStrDate()+"\t");
			System.out.print(vo.getStrPname()+"\t\t");
			System.out.print(vo.getStrIO()+"\t");

			int intVO = Integer.valueOf(vo.getStrIO());
			String strIoTitle = "매출";
			
			// [변수를 사용하는 방법]
			// int intIPrice = 0;
			// int intOPrice = 0;
			
			if(intVO == 1 ) {
				System.out.printf("%10d",vo.getIntPrice());
				System.out.printf("%10d",0);
				strIoTitle = "매입";
			}else {
				System.out.printf("%10d",0);
				System.out.printf("%10d",vo.getIntPrice());
				
			}
			System.out.printf("%10d\n",vo.getIntQty());
		}
		System.out.println("=====================================================");
		
		}
	protected void list_header() {

		System.out.println("=====================================================");
		System.out.println("거래일자\t상품명\t\t\t구분\t매입단가\t매출단가\t수량");
		System.out.println("-----------------------------------------------------");	
	
	
	}

	@Override
	public void summery() {

		
	}

}

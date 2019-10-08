package com.biz.list.Addr;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.model.AddrVO;

public class AddrEx_01 {

	public static void main(String[] args) {

		List<AddrVO> addrList = new ArrayList<AddrVO>();
		
		AddrVO aVO = new AddrVO();
		
		aVO.setStrName("홍길동");
		aVO.setStrTel("02-111-1111");
		aVO.setStrAddr("서울특별시");
		aVO.setStrEmail("hyerin.you@gmail.com");
		aVO.setStrHP("010-1111-1111");
				
		addrList.add(aVO);
		
		aVO = new AddrVO();
		
		aVO.setStrName("이몽룡");
		aVO.setStrTel("063-222-2222");
		aVO.setStrAddr("남원시");
		aVO.setStrEmail("hyerin.you@gmail.com");
		aVO.setStrHP("010-2222-2222");
		
		addrList.add(aVO);
		
		aVO = new AddrVO();
		
		aVO.setStrName("성춘향");
		aVO.setStrTel("063-333-3333");
		aVO.setStrAddr("남원시");
		aVO.setStrEmail("hyerin.you@gmail.com");
		aVO.setStrHP("010-3333-3333");
		
		addrList.add(aVO);
		
		// addrList 의 개수를 계산해서 nSize 변수에 담아달라
		
		System.out.println("=============================================");
		System.out.println(" 주    소    록 ");
		System.out.println("=============================================");
		System.out.println("이름\t전화\t        주소\t    Email\t핸드폰");
		System.out.println("---------------------------------------------");
		int nSize = addrList.size();
		
		// 일반 for문을 이용
		for(int i = 0 ; i < nSize ; i++) {
			System.out.printf("%s\t", addrList.get(i).getStrName());
			System.out.printf("%s\t", addrList.get(i).getStrTel());
			System.out.printf("%s\t", addrList.get(i).getStrAddr());
			System.out.printf("%s\t", addrList.get(i).getStrEmail());
			System.out.printf("%s\n", addrList.get(i).getStrHP());
		}
		System.out.println("=============================================");
		
		// 확장 for 이용
		for(AddrVO vo : addrList) {
			System.out.printf("%s\t", vo.getStrName());
			System.out.printf("%s\t", vo.getStrTel());
			System.out.printf("%s\t", vo.getStrAddr());
			System.out.printf("%s\t", vo.getStrEmail());
			System.out.printf("%s\n", vo.getStrHP());
		}
		System.out.println("==============================================");
	
	
	
	
	
	}

}

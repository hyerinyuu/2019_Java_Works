package com.biz.exam;

import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

import com.biz.exam.domain.BBsVO;
import com.biz.exam.service.BBsReadService;
import com.biz.exam.service.BBsReadServiceV1;
import com.biz.exam.service.BBsViewService;
import com.biz.exam.service.BBsViewServiceV1;

public class BBsEx_01 {

	public static void main(String[] args) {

		String bbsFile = "src/com/biz/exam/bbs.txt";
				
		BBsReadService br = new BBsReadServiceV1();
		BBsViewService bv = new BBsViewServiceV1();
		Scanner scan = new Scanner(System.in);
		
		try {
			br.readBBs(bbsFile);
			List<BBsVO> bbsList = br.getBBsList();
			bv.setBBsList(bbsList);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(true) {
			
			System.out.println("=========================================================");
			System.out.println("게시판 관리 시스템 v1");
			System.out.println("=========================================================");
			System.out.println("1.전체      2. 제목      3. 날짜        0.종료");
			System.out.println("---------------------------------------------------------");
			System.out.print("업무선택 >> ");
			
			String strE = scan.nextLine();
			int intE = Integer.valueOf(strE);
			if(intE == 0) break;
			
			if(intE == 1 ) {
				bv.viewBBs();
			}if(intE == 2) {
				System.out.print("찾으시는 게시물의 제목을 입력하세요 >> ");
				String subject = scan.nextLine();
					bv.viewBBs(subject);
					
			}if(intE == 3) {
				
				System.out.print("최대 날짜 >> ");
				String strDate = scan.nextLine();
				int sDate = Integer.valueOf(strDate);
				
				System.out.print("최소 날짜 >> ");
				String endDate = scan.nextLine();
				int eDate = Integer.valueOf(endDate);
				
				try {
					bv.viewBBs(sDate, eDate);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
			/*
			 * 조회된 값을 오름차순 정렬하기 위해
			 * 리스트를 조회된 값 scope내에 treemap형으로 재선언해서
			 * 오름차순으로 정렬하고 싶었는데 망했습니다ㅠ
			 */
			
			
			
		}
		System.out.println("************************");
		System.out.println("업무가 종료되었습니다.");
		System.out.println("************************");
		
		
	}

}

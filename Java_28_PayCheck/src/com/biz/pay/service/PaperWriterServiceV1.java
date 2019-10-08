package com.biz.pay.service;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

public class PaperWriterServiceV1 {

	List<PaperVO> paperList;
	PrintWriter fileOut;
	
	public void setPaperList(List<PaperVO> paperList) {
		this.paperList = paperList;
	}
	
	// setter를 통해서 paperList를 주입받고
	// 파일이름만 매개변수로 받아서 파일 저장을 수행
	public void print(List<PaperVO> paperList, String fileName) throws Exception {
		
		fileOut = new PrintWriter(fileName);
		for(PaperVO vo : paperList) {
			
			fileOut.printf("%d\t\t\t%d\n",vo.getPaper(),vo.getMoney());
			fileOut.flush();
			
		}
		fileOut.close();
		
		
		
	}
	
	
}

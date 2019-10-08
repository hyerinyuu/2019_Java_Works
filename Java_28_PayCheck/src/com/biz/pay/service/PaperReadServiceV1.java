package com.biz.pay.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PayVO;

public class PaperReadServiceV1 {

	FileReader fileReader;
	BufferedReader buffer;
	
	public List<String> getPayList() {
		
		return this.getPayList();
	}
	
	public void read(String fileName) throws Exception {
		
		
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
		List<PayVO> payList;
		
		while(true) {
			String reader = buffer.readLine();
			if(reader == null) break;
			System.out.println(reader);
			
			String[] payfile = reader.split(":");
			String num;
			int pay;
			
			// playList[0] : 사번 String
			// playList[1] : 급여액 int
		
			PayVO payVO = new PayVO();
			payVO.setNum(payfile[0]);
			payVO.setPay(Integer.valueOf(payfile[1]));
			
			payList = new ArrayList<PayVO>();
			payVO.toString();
			
			payList.add(payVO);
			
			
		}
		buffer.close();
		fileReader.close();
		
	}

	}
	


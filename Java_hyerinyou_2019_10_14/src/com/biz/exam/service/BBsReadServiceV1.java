package com.biz.exam.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.exam.domain.BBsVO;

public class BBsReadServiceV1 implements BBsReadService {

	protected List<BBsVO> bbsList;
	FileReader fileReader;
	BufferedReader buffer;
	
	// bbs.txt 파일을 읽어서 문자열을 분해한 후 BBsVO의 요소에 저장하고 bbsList에 담기위한 method
	@Override
	public void readBBs(String bbsFile) throws Exception {

		bbsList = new ArrayList<BBsVO>();
		fileReader = new FileReader(bbsFile);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			
			reader = buffer.readLine();
			if(reader == null) break;
			
			String[] bbses = reader.split(":");
			BBsVO bbsVO = new BBsVO();
			
			// 순번:작성자:작성일자:제목:내용:조회수
			bbsVO.setSeq(Integer.valueOf(bbses[0]));
			bbsVO.setAuth(bbses[1]);
			bbsVO.setDate(bbses[2]);
			bbsVO.setSubject(bbses[3]);
			bbsVO.setText(bbses[4]);
			bbsVO.setCount(Integer.valueOf(bbses[5]));
		
			bbsList.add(bbsVO);
			
		}
		buffer.close();
		fileReader.close();
		
	}

	// 외부에서 bbsList를 가져갈 수 있도록 만들어준 method
	@Override
	public List<BBsVO> getBBsList() {
		return bbsList;
	}

}

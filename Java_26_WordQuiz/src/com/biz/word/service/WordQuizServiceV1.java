package com.biz.word.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.word.domain.WordVO;

public class WordQuizServiceV1 implements WordQuizService {

	// protected
	// 상속받은 곳에서만 사용 가능
	// 만약 이 class를 누군가에게 상속하고 
	// 상속받은곳에서 wordVOList를 사용할 수 있게 하려면
	// protected를 설정하라
	protected List<WordVO> wordVOList;
	
	public WordQuizServiceV1() {
		// TODO 생성자
		wordVOList = new ArrayList<WordVO>();
	}
	
	public WordQuizServiceV1(List<WordVO> wordVOList) {
		this.wordVOList = wordVOList;
	}
	
	public void setWordVOList(List<WordVO> wordVOList) {
		this.wordVOList = wordVOList;
	}

	// wordVOList에서 임의 1개의 영문단어를 추출하여
	// console에 보여주시오
	public void viewEngWord() {
		
		Random rnd = new Random();
		int nSize = wordVOList.size();
		int index = rnd.nextInt(nSize);
		
		WordVO wordVO = wordVOList.get(index); 
		System.out.println(wordVO.getEngWord());
			
		
		
	}
	/*
	 * viewEngWord() method에서 뒤섞어 보여준 단어를
	 * 원형을 키보드로 입력받고
	 * 맞는지 틀린지를 보여주는 코드
	 */
	@Override
	public void quizExec() {
		// TODO Auto-generated method stub
		
	}


}

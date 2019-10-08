package com.biz.word.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.word.domain.WordVO;

public class WordQuizServiceV2 extends WordQuizServiceV1 {

	// protected
	// 상속받은 곳에서만 사용 가능
	// 만약 이 class를 누군가에게 상속하고 
	// 상속받은곳에서 wordVOList를 사용할 수 있게 하려면
	// protected를 설정하라
	// protected List<WordVO> wordVOList;
	List<String> quizwords;
	WordVO wordVO;
	public int nCount;
	
	public void WordQuisServiceV2() {
		wordVOList = new ArrayList<WordVO>();
		nCount = 0;
	}
	
	
	
	public WordQuizServiceV2(List<WordVO> wordVOList) {
		this.wordVOList = wordVOList;
	}
	
	public void setWordVOList(List<WordVO> wordVOList) {
		this.wordVOList = wordVOList;
	}

	// wordVOList에서 임의 1개의 영문단어를 추출하여
	// console에 보여주시오
	public void viewEngWord() {
		
		// nCount > 0 = 한번이라도 틀렸다는 소리
		// 만약 단어맞추기를 1번이라도 틀린적ㅇ ㅣ있으면
		// nCount가 0보다 클것이고
		// 그러면 이미 생성되어 있는 wordVO를 
		// private viewEngWord(wordVO)에게 보내서
		// 다시한번 뒤섞은 뒤 보여주기
		if(nCount > 0) {
			System.out.println();
			this.viewEngWord(wordVO);
			return;
		}
		
		// 새로운 단어로 시작이 되는 경우
		// 1. 게임을 최초로 시작한 경우
		// 2. 앞에서 단어를 맞추었을경우
		
		Random rnd = new Random();
		int nSize = wordVOList.size();
		int index = rnd.nextInt(nSize);
		
		wordVO = wordVOList.get(index); 
		
		
		this.viewEngWord(wordVO);
		
	}
	private void viewEngWord(WordVO wVO) {
		
		// 임시코드 실제 삭제될 코드
		//System.out.println(wordVO.getEngWord());
		
		String word = wVO.getEngWord();
		String[] words = word.split(""); // 알파벳단위로 분해하기
		
		
		quizwords = Arrays.asList(words);
		Collections.shuffle(quizwords);
		
		System.out.println(quizwords);
	
	}
	
	/*
	 * viewEngWord() method에서 뒤섞어 보여준 단어를
	 * 원형을 키보드로 입력받고
	 * 맞는지 틀린지를 보여주는 코드
	 */
	@Override
	public void quizExec() {

		Scanner scan = new Scanner(System.in);
		System.out.println("---------------------");
		System.out.print("단어입력 힌트(H), 종료(-0)  >> ");
		String strEngWord = scan.nextLine();
		
		if(strEngWord.equals("-0")) {
			nCount = -1;
			return;
		}
				
		
		
		if(strEngWord.equals("H")) {
			System.out.println("---------------------");
			System.out.println(wordVO.getKorMeans());
			
			int half = wordVO.getEngWord().length() /2;
			System.out.println(wordVO.getEngWord().substring(0,half));
			System.out.println("---------------------");
		}
		String word = scan.nextLine();
		if(wordVO.getEngWord().equalsIgnoreCase(word)) {
			System.out.println("---------------------");
			System.out.println("단어입력 힌트(H) >> ");
			
			
			
			System.out.println("맞았습니다");
			System.out.println("시도횟수 : " + (nCount+1));
			System.out.println("---------------------");
			System.out.println(wordVO.getKorMeans());
			System.out.println("---------------------");
			
			nCount = 0;
		}else {
			System.out.println("---------------------");
			System.out.println((nCount +1) + "번 틀렸습니다.");
			/*
			System.out.print("계속(Enter), 힌트보기(H) >> ");
			String strH = scan.nextLine();
			if(strH.equals("H")) {
				System.out.println("---------------------");
				System.out.println(wordVO.getKorMeans());
				System.out.println("---------------------");
			}
			*/
			nCount++ ;
			
		}
	
		
		
		
		
	}


}

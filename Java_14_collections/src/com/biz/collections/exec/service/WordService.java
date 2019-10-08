package com.biz.collections.exec.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordService {

	public int count;
	
	private List<String> wordList;
	private String word;
	private List<String> words;
	
	private Scanner scan;
	
	public WordService() {
		
		scan = new Scanner(System.in);
		
		
		wordList = new ArrayList<String>();
		wordList.add("yesterday");
		wordList.add("morning");
		wordList.add("January");
		wordList.add("tomorrow");
		wordList.add("monday");
		wordList.add("computer");
		wordList.add("wednesday");
		wordList.add("Gwangju");
		
		
		
	}
	
	public void makeWord() {
		
		// 단어들 리스트를 뒤 섞기
		Collections.shuffle(wordList);
		
		// 뒤섞인 단어 리스트에 0번째 단어만 추출
		word = wordList.get(0);
		
		// 추출된 단어를 알파벳 단위로 나누어서 List로 변환
		words = Arrays.asList(word.split(""));
		
		// 알파벳 뒤섞기
		Collections.shuffle(words);
		
	}
	
	public boolean input() {
		
		if(count < 1) {
		this.makeWord();
		}
		
		System.out.println("===============================================");
		System.out.println("단어 맞추기 게임");
		System.out.println("===============================================");
		System.out.println("제시한 알파벳을 알맞게 배열하여");
		System.out.println("단어를 완성하세요");
		System.out.println("-----------------------------------------------");
		this.makeWord(words);
		System.out.println("-----------------------------------------------");
		System.out.print(">> ");
		
		String strKeyIn = scan.nextLine();
		
		if(strKeyIn.equalsIgnoreCase(word)) {
			System.out.println(count + "번만에 맞췄습니다.");
			count = 0;
		}else {
			System.out.println("틀렸습니다.");
			count++;
		}
		System.out.println("Press Any Key to Continue!(-1 : END)");
		String anyKey = scan.nextLine();
		if(anyKey.equals("-1")) {
			return true;
		}
		
		return false;
	
	}

	private void makeWord(List<String> words2) {
		// TODO Auto-generated method stub
		
	}
	
}

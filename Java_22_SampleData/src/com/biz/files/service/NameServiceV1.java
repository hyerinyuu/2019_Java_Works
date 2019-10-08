package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class NameServiceV1 implements NameService {

	List<String> nameList = null;
	List<String> famList = null;
	List<String> korNamefile = null;
	
	
	// 이름리스트파일을 읽어서 nameList 생성
	@Override
	public void readNameList(String nameFile) throws Exception {
		
		nameList = new ArrayList<String>();
		
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(nameFile);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			
			nameList.add(reader);
			
			
		}buffer.close();
		fileReader.close();
	}

	// 성씨리스트파일 읽어서 famList 생성
	@Override
	public void readFamList(String famFile) throws Exception {
		
		famList = new ArrayList<String>();
		
		FileReader fileReader;
		BufferedReader buffer;

		fileReader = new FileReader(famFile);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true ) {
			reader = buffer.readLine();
			if(reader == null) break;
			String[] ns = reader.split(":");
			String fName = ns[1].substring(0,1);
		
			
			famList.add(fName);
		
		}buffer.close();
		fileReader.close();
		
		
	}

	// 한자를 뺀 성씨list + 이름list 조합을 무작위로 섞어서 한국사람이름list 만들어서 기록하기
	@Override
	public void writeNameFile(String korNameFile) throws Exception {

		/*
		PrintWriter fileOut = null;
		fileOut = new PrintWriter(korNameFile);
		
		korNamefile = new ArrayList<String>();
		
		FileReader fileReader;
		BufferedReader buffer;

		fileReader = new FileReader(korNameFile);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			
		Collections.shuffle(famList);
		Collections.shuffle(nameList);
		
		for(int i = 0 ; i < length; i++) {
			System.out.printf("%s%s",famList,nameList);
			
			korNamefile.add(korNameFile);
		fileOut.flush();	
			
		}fileOut.close();
		buffer.close();
		fileReader.close();
		
		*/
		
		Collections.shuffle(nameList);
		Collections.shuffle(famList);
		
		int nameSize = nameList.size();
		int famSize = famList.size();
		
		PrintWriter fileOut = new PrintWriter(korNameFile);
		
		String strName = "";
		
		// 1번코드 
		for(int i = 0 ; i < 100 ; i++) {
			strName = famList.get(i) + nameList.get(i);
			System.out.println(strName);
			fileOut.println(strName);
			
		}
		
		System.out.println("===========================================");
		
		// 2번 코드
		Random rnd = new Random();
		for(int i = 0 ; i < 100 ; i++) {
			strName = famList.get(rnd.nextInt(famSize));
			strName += nameList.get(rnd.nextInt(nameSize));
			System.out.println(strName);
			fileOut.println(strName);
			
		}
	
	
	}
}
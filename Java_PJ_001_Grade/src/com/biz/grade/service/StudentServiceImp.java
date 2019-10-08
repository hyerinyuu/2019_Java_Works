package com.biz.grade.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.grade.model.StudentVO;




/*
 *  학번 0001부터 순서대로 자동생성해서
 *  키보드에서 정보 입력받아 리스트에 저장하기
 */
public class StudentServiceImp implements StudentService {
	
	
	Scanner scan;
	List<StudentVO> stdList;
	Random rnd;
	
	
	@Override
	public void input(int count) {
		stdList = new ArrayList<StudentVO>();
		scan = new Scanner(System.in);
		
		// input count 갯수만큼 학번을 0000n 형식으로 자동생성
		for(int i = 0 ; i < count ; i++) {
			String strNum = String.format("%04d", (i+1));
			this.input(strNum);
		}
	}

	@Override
	public void input(String strNum) {
		
		StudentVO vo = new StudentVO();
		vo.setStrNum(strNum);
		
		
		System.out.print("이름 >> ");
		String strName = scan.nextLine();
		
		System.out.print("전화번호 >> ");
		String strTel = scan.nextLine();
		
		System.out.print("주소 >> ");
		String strAddr = scan.nextLine();
		
		System.out.print("학과 >> ");
		String strDept = scan.nextLine();
		
		System.out.print("학년 >> ");
		String strGrade = scan.nextLine();
		int intGrade = 0;
		
		try {
			intGrade = Integer.valueOf(strGrade);
		} catch (Exception e) {
			System.out.println("학년은 숫자만 작성가능합니다.");
			System.out.println("입력하신 학생정보가 저장되지않았습니다.");
		}

		StudentVO stdVO = new StudentVO();
		
		stdVO.setStrNum(strNum);
		stdVO.setStrName(strName);
		stdVO.setStrTel(strTel);
		stdVO.setStrAddr(strAddr);
		stdVO.setStrDept(strDept);
		stdVO.setIntGrade(intGrade);
		
		stdList.add(stdVO);
		
	}

	
	
	
	@Override
	public void list() {

		System.out.println("");
		System.out.println("학생명부");
		System.out.println("================================================================");
		System.out.println("학번\t이름\t전화번호\t주소\t학과\t\t학년");
		System.out.println("================================================================");
		
		int nSize = stdList.size();
		for(int i = 0 ; i < nSize ; i++) {
			
			StudentVO vo = stdList.get(i);
			
			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getStrName() + "\t");
			System.out.print(vo.getStrTel() + "\t");
			System.out.print(vo.getStrAddr() + "\t");
			System.out.print(vo.getStrDept() + "\t");
			System.out.printf("%d\n",vo.getIntGrade());
			System.out.println("================================================================");
		}
		
		
	}


}

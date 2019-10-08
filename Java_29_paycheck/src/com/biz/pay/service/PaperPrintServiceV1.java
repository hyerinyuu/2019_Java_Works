package com.biz.pay.service;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

/*
 *  PayReadService에서 pay.txt 파일을 읽은 정보를 가져오고
 *   => payStrList
 *  읽은정보(리스트) 를 한 사람 분의 급여를 각각 PaperMakeServiceV1에게 주입하고
 *  화폐매수를 계산한 결과를 가져와서
 *  console에 보여주기
 */
public class PaperPrintServiceV1 {

	PayReadServiceV1 pr;
	PaperMakeServiceV1 pm;
	List<List<PaperVO>> paperAllList;
	
	
	// Ex클래스에서 파일 이름을 주입할때 받을 변수
	String payFile ;
	
	public PaperPrintServiceV1() {
		// TODO 기본 생성자
		pr = new PayReadServiceV1();
		pm = new PaperMakeServiceV1();
	}

	// PaperPrintServiceV1 pp = new PaperPrintServiceV1("pay.txt"); 식으로 호출
	public PaperPrintServiceV1(String payFile) {

		// 기본생성자에 있는 pr과 pm은 한번만 생성되고 더이상 생성되지 않아서
		// payFile을 매개변수로 갖는 PaperPrintServiceV1의 인스턴스가 생성되지 않아 NULLPOINTEXCEPTION이 발생한다 
		// 따라서
		// this();는 기본생성자를 호출해서 pr객체와 pm 객체를 생성하고 인스턴스를 만들어 둔다.
		this();
		this.payFile = payFile;
		
	}

	// pp.setPayfile("pay.txt")식으로 호출
	public void setPayFile(String payFile) {
		
		this.payFile = payFile;
		
	}
	// 
	public void printPaper() throws Exception {
		
		String payPath = "src/com/biz/pay/";
		
		pr.readPay(this.payFile);
		List<String> payStrList = pr.getPayStrList();
		
		for(List<PaperVO> paperList : this.paperAllList) {
			
			PrintWriter fileOut = new PrintWriter(payPath + paperList.get(0).getMember());
			
			fileOut.println("====================================");
			fileOut.print("사원번호 : " + paperList.get(0).getMember());
			fileOut.println(", 급여액 : " + paperList.get(1).getMember());
			fileOut.println("------------------------------------");
			
			for(PaperVO pVO : paperList) {
				
			fileOut.printf("%s원권 : %d매\n", pVO.getPaper(), pVO.getCount());
			}
			fileOut.close();
		
		}
		
	}
	
	
	public void viewPaper() throws Exception {
	
		for(List<PaperVO> paperList : this.paperAllList) {

			System.out.println("====================================");
			System.out.print("사원번호 : " + paperList.get(0).getMember()  );
			System.out.println(", 급여액 : " + paperList.get(1).getMember());
			System.out.println("------------------------------------");
			
			for(PaperVO pVO : paperList) {
				System.out.printf("%s원권 : %d매\n", pVO.getPaper(), pVO.getCount());
			}
		}
		
	}	
	
	public void makePaperList() throws Exception {
		// pay.txt파일을 읽어서 payStrList로 생성하는 과정
		pr.readPay(this.payFile);
		List<String> payStrList = pr.getPayStrList();
		paperAllList = new ArrayList<List<PaperVO>>();
		
		// payStrList는 문자열(String)을 담고있는 List형이기 때문에
		// for반복문을 이용해서 한개씩 추출 가능함
		for(String pay : payStrList) {
			// pay 사번 : 급여 형식의 문자열이 들어있음.
			// pay를 사번, 급여 부분으로 분해
			
			String[] pays = pay.split(":");
			// pays[0] : 사번
			// pays[1] : 급여액
			
			// 문자열로 저장된 급여액을(pays[1]) 정수형으로 변환해서 intPay에 담기
			int intPay = Integer.valueOf(pays[1]);
			
			// 급여액을 pm 클래스에 주입을 해서 화폐매수 계산
			pm.make(intPay);
			List<PaperVO> paperList = pm.getPaperList();
			paperList.get(0).setMember(pays[0]);
			paperList.get(1).setMember(pays[1]);
			
			// paperList 리스트를 paperAllList에 추가
			paperAllList.add(paperList);
			}
			
		}
		
	
	
		
}
	


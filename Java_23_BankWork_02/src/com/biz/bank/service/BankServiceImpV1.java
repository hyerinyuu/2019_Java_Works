package com.biz.bank.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.biz.bank.domain.BankBookVO;
import com.biz.bank.util.BankInfo;

public class BankServiceImpV1 implements BankService {

	// TODO 계좌번호, 계좌정보VO가 저장될 List
	Map<String,BankBookVO> bankBookList = null;
	BankBookVO bookVO = null;
	
	// TODO 키보드 장치 선언
	Scanner scanner = null;
	PrintWriter fileOut = null;
	String bookFile;
	
	
	// TODO 생성자 method
	public BankServiceImpV1() {
		// TreeMap : key값을 중심으로 오름차순 자동정렬
		bankBookList = new TreeMap<String,BankBookVO>();
		
		//생성자에서 키보드 연결
		scanner = new Scanner(System.in);
		
	}
	
	@Override
	public void readBook(String bookFile) throws Exception {
		
		// TODO키워드는 주석문 내에서 사용되는 keyword로
		// 소스코드를 쉽게 찾아갈 수 있는 book mark를 설정한다.
		
		this.bookFile = bookFile;
		
		// TODO 잔고원장파일을 읽어서 리스트로 생성하기
		
		// 파일을 읽기 위해 기본적으로 작성해야 할 코드
		// FileReader ~~~ break;(line28 to line40 )
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(bookFile);
		buffer = new BufferedReader(fileReader);
		
		
		
		// 파일을 읽기 위해 선언한 String형 변수
		String reader = new String();
		
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			
			
		// [파일(활빈당~~.txt)에서 한줄을 읽어 reader에 저장된 문자열을 분리해 계좌정보 생성하기]
			
			// 활빈당파일을 콜론별로 분해하기 위한 코드
			String[] books = reader.split(":"); // ==> books[0] : 계좌정보
												// 	   books[1] : 최종잔액
												//     books[2] : 최종거래일자
												//     books[3] : 구분
			
			// 굳이 BOOK class에 BankInfo innerClass를 만들어서 이렇게 호출하는 이유
			// ==> 관리를 편하게 하기 위해서
			// (키워드들을 하나의 클래스에 모아서, 호출할때 BankInfo만 호출하면 쉽게 호출 가능하니까)
			// (JAVA에서는 innerclass 잘 안씀)
			
			String strNum = books[BankInfo.BOOK.NUM];		// == String strNum = books[0] 
			String strBalance = books[BankInfo.BOOK.BALANCE];
			String strLastDate = books[BankInfo.BOOK.LASTDATE];
			String strRemark = books[BankInfo.BOOK.REMARK];
			
			// 잔액은 계산을 위해 int형으로 변환
			int intBalance = Integer.valueOf(strBalance);
			
			
			// reader에서 각 항목별로 분리한 값을 BankBookVO에 담기
			BankBookVO bookVO = new BankBookVO();
			bookVO.setNum(strNum);
			bookVO.setBalance(intBalance);
			bookVO.setLastDate(strLastDate);
			bookVO.setRemark(strRemark);
			
			// 리스트에 추가
			bankBookList.put(strNum, bookVO);
			
			// bankBookList에 제대로 값이 담겼는지 확인하기 위해 VO에 toString을 추가하고 console에 표시해주는 코드
			// debugging code
			System.out.println(bookVO.toString());
		
			
		}// while end
		buffer.close();
		fileReader.close();
		
	}


	/*
	 * 키보드로 계좌번호를 입력받아서
	 * 계좌 번호가 list에 있으면 계좌정보(VO)를 추출하여 임시 보관하기
	 */
	@Override
	public void viewAcc() {
		// TODO 계좌정보 조회
		
		System.out.print("계좌번호 >> ");
		String strNum = scanner.nextLine();
		
		// bankBookList에서 strNum key value를 조회하고 그 결과를 BankBookVO에 담기
		// BankBookVO bookVO = bankBookList.get(strNum); ==> BankBookVO를 생성자에서 선언해야함
		//bankBookList에서 추출된 bookVO를 입,출금처리 method에서 사용할 수 있도록
		// 멤버변수영역으로 이동하기
		bookVO = bankBookList.get(strNum);
		
		
		// bankVO에는 계좌정보는 null값이 담기게 된다.
		// 계좌정보가 담기는 경우 ? : (키보드로 입력받은)strNum계좌가 List에 있을 때 
		// null이 담기는 경우 ? : (키보드로 입력받은)strNum계좌가 List에 없을 때
		// strNum계좌가 list에 없을때 나타날 메시지 코드
		if(bookVO == null) {
			System.out.println("계좌번호를 다시 확인해주세요");
		}
		
		
	}


	@Override
	public void input() throws Exception{
		
		// TODO 입금처리
		this.viewAcc(); // 계좌조회
		
		// 앞에서 조회환 계좌정보가 유효한지 검사하는 코드
		// viewAcc() 에서 유효하지 않은 계좌정보에 대해서는
		// 이미 메시지를 표시했으므로 여기에서는 검사만 하고 return해주면 됨
		if(bookVO == null ) return;
		
		System.out.print("입금액 >> ");
		String strInput = scanner.nextLine();
		int intInput = Integer.valueOf(strInput);
		
		// 만약 입금액이 -이면 입금 거부하는 코드
		if(intInput < 0) {
			System.out.println("입금액은 0원 이상이어야 합니다.");
			return;
		}
		
		int intBalance = bookVO.getBalance(); // 기존에 계좌에 남아있던 잔액을 intBalance로 선언
		intBalance += intInput; // intBalance에 입금액인 intInput을 더해주기
		bookVO.setBalance(intBalance);  // input이 더해진 intBalance를 최종금액으로 설정해 주기 위해 작성한 코드
		
		// 거래일자, 구분값 추가
		Date date = new Date(); // 현재 날짜 가져오기
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		String lastDate = sd.format(date);
		bookVO.setLastDate(lastDate);
		bookVO.setRemark(BankInfo.REMARK.INPUT);
		
		// 입금처리된 내역을 통장파일에 저장하기
		// 구분문자열과 입금된 금액을 파라메터로 전달
		this.accListWrite(BankInfo.REMARK.INPUT, intInput);
		
		
		// 입금처리가 완료된 후
		// 원장에 내용을 저장하는 bookWriter() method를 호출한다.
		// 여기서 하나의 문제가 발생하는데,
		// 저장할 파일 이름을 넘겨줄 방법을 모색해야한다.
		// input() method를 변경하여
		// input(String, bookFile) 형식으로 바꿀수도 있지만
		// 그렇게 하면 
		// interface, 그리고 interface를 implements한 클래스
		// 모두를 변경해야하는 대 공사가 필요하다.
		
		
		// 원하는 결과를 얻기 위해 최소한의 코드를 변경하려면
		// service 클래스에서 bookFile 멤버변수 필드를 하나 선언하고
		// readBook() method에서 bookFile변수 값을 setting 하여
		// 값을 공유하도록 설정한다.
		this.bookWrite(bookFile);
		
		
	}
	/*
	 * 1. 앞에서 조회된 계좌번호가 유효하지 않으면 method 종료
	 * 2. 키보드로 출금액을 입력받고
	 * 3. 음수이면 출금 거부하기
	 * 4. 잔액 >= 출금액 이면 출금처리
	 * 5.				아니면 출금거부
	 */

	@Override
	public void output() throws Exception {
		// TODO 출금처리
		this.viewAcc();
		
		// return이 하나인 method ==> one out method : 예전에는 권장했으나 지금은 가독성이 떨어져x
		
		// 계좌 정상조회
		if(bookVO != null) {
			System.out.print("출금액 >> ");
			String strOutPut = scanner.nextLine();
			int intOutPut = Integer.valueOf(strOutPut);
			
			if(intOutPut > 0 ) {
				int intBalance = bookVO.getBalance();
				if(intBalance > intOutPut ) {
					intBalance -= intOutPut;
					bookVO.setBalance(intBalance);
					System.out.println("출금처리완료");
					System.out.println("현재잔액 : " + intBalance);
					
					LocalDate ld = LocalDate.now();
					DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
					String lastDate = df.format(ld);
					bookVO.setLastDate(lastDate);
					bookVO.setRemark(BankInfo.REMARK.OUTPUT);
					
					this.accListWrite(BankInfo.REMARK.OUTPUT, intOutPut);
					this.bookWrite(bookFile);
					
				}else {
					System.out.println("잔액이 부족해 출금이 불가능합니다.");
				}
				
			}else {
				System.out.println("출금액은 0원 이상이어야합니다.");
				return;
			}
		}
		
	}

	 // 입출금이 완료되는 순간 bookFile에 변동내역을 저장
	// bookFile변수를 매개변수로 받아
	// 변수값을 파일명으로 하는 처리를 수행해야함.
	@Override
	public void bookWrite(String bookFile) throws Exception {
		// TODO 원장정보 파일에 저장
		
		fileOut = new PrintWriter(bookFile);
		Set<String> keysets = bankBookList.keySet();
		
		for(String s : keysets) {
			fileOut.printf("%s:%d:%s:%s\n", bankBookList.get(s).getNum(),
					bankBookList.get(s).getBalance(),
					bankBookList.get(s).getLastDate(),
					bankBookList.get(s).getRemark());
			fileOut.flush();
		}
		fileOut.close();
		
		
	}

	/*
	 * 어떤 계좌에서 입금이나 출금이 발생을 하면
	 * 해당하는 내역을 "계좌번호 파일" 에 저장하기.
	 */
	
	@Override
	public void accListWrite(String remark, int money) throws Exception {
		// TODO 거래내역 파일로 저장하기
		
		String strAccPath = "src/com/biz/bank/books/";
		
		FileWriter fileWriter;
		PrintWriter accBook;
		
		// 계좌번호로 거래내역을 저장할 파일 이름을 생성해보기
		String accBookFile = String.format("BOOK-%s.txt",bookVO.getNum());  // ==> 파일이름이 BOOK-0001.txt 형식
		
		
		// FileWriter(,true) ==> 파일이 이미 있으면 append(추가) mode로 open하고
		//						 파일이 없으면 파일을 새로 생성하라
		// 파일생성 : src/com/biz/bank/acc/BOOK-0001.txt
		fileWriter = new FileWriter(strAccPath + accBookFile,true);
		accBook = new PrintWriter(fileWriter);
		
		int intBalance = bookVO.getBalance();
		String lastDate = bookVO.getLastDate();
		
		int intInput = 0;
		int intOutput = 0;
		
		intInput = money;
		if(remark.equals(BankInfo.REMARK.OUTPUT)) {
			intInput = 0;
			intOutput = money;
		}
		// 거래일자, 구분, 입금, 출금, 현잔액
		String strWriter = String.format("%s:%s:%d:%d:%d", lastDate,remark,intInput,intOutput,intBalance );
	
		accBook.println(strWriter);
		
		
		accBook.flush();
		accBook.close();
		fileWriter.close();
		
	}
	
}

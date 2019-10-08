package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.list.exec.model.BookVO;

/*
 * 키보드에서 도서정보를 입력받아서 
 * List에 추가하고 
 * 목록보기, 정보보기
 * V2(Version2) 확장 ==> 기능이 업그레이드 된 코드
 * 사용자가 잘 못 입력했을때 재 입력할 수 있게 하는 코드 추가
 */
public class BookServiceImpV2 implements BookService {

	/*
	 * scan 객체와 bookList 객체를 선언만 하고
	 * 아직 생성(사용할 준비가)이 안된 상태 이므로
	 * 이 클래스의 어떤 method든지 호출하면
	 * null point Exception이 발생한다.
	 *  ===> scan과 bookList를 생성, 초기화를 해야함
	 */
	Scanner scan;
	List<BookVO> bookList;
	
	/*
	 * scan과 bookList를 생성, 초기화 하는 코드를
	 * 클래스의 생성자에 작성한다.
	 * ==> public BookServiceImpV2 ~~~~~
	 */
	public BookServiceImpV2() {
		scan = new Scanner(System.in);
		bookList = new ArrayList<BookVO>();
	}
	
	
	@Override
	public void input(int count) {

		// 
		for(int i = 0 ; i < count ; i++) {
			System.out.println("==============================");
			System.out.println((i+1) + "번째 도서정보 입력");
			System.out.println("==============================");
			
			try {
				this.input();
			} catch (Exception e) {
				System.out.println("** 데이터를 다시 입력하세요 **");
				i--;
				continue;
			}
			
			
		}
		
	}

	@Override
	public void input() {

		System.out.print("도서번호 >> ");
		String strNum = scan.nextLine();
		
		System.out.print("도서명 >> ");
		String strName = scan.nextLine();
		
		System.out.print("출판사 >> ");
		String strComp= scan.nextLine();
		
		System.out.print("저자 >> ");
		String strWriter= scan.nextLine();
		
		System.out.print("가격 >> ");
		String strPrice = scan.nextLine();

		int intPrice = 0;
		// 문자열형 숫자를 숫자로 변경하는 과정에서는
		// exception이 자주 발생한다.
		// ==> 예외 처리 추가
		// 1. 예외 상황이 발생할 코드를 작성
		// 2. 실행해서 예외상황이 발생하도록 테스트
		// 3. 테스트를 하면 NumberPointException이 발생함
		// 4. 예외처리를 시작
		// 	 가. try catch문을 작성
		//	 나. 예외가 발생할 코드를 try {}안쪽으로 이동
		//	 다. 예외 상황이 발생했을때 사용자에게 나타날 코드를 catch() {} 안에 작성
		
		
		try {
			intPrice = Integer.valueOf(strPrice);
		} catch (Exception e) {
			// TODO: handle exception
			/*
			 * 만약 도서가격을 입력할 때
			 * Number Point Exception이 발생해 도서정보를 저장 못했을 때
			 * 도서정보를 재입력해 저장할 수 있도록 코드 작성
			 */
			
			/*
			 * 키보드로부터 값을 입력받고
			 * 변환을 하는 등의 코드가 
			 * for() {} 반복문으로 감싸져 있다면
			 * for 반복문을 재 시작하는 continue 키워드를
			 * 사용하여 재입력을 유도할 수 있다.
			 * 하지만 지금 작성한 input() method는 for(){} 반복문에서
			 * 별도로 호출한 method이기 때문에
			 * continue 키워드 사용 불가능.
			 * 
			 * ==> 이럴때는
			 * exception이 발생을 하면, input() method에서 
			 * 호출한 곳에 exception이 발생했다고 알려준 뒤
			 * 그곳에서 처리하도록 하면 된다.
			 */
			
			System.out.println("** 가격은 숫자만 입력하세요 **");
			
			// thorw : 나(input() method를 호출한 곳으로 
			// 		exception을 넘긴다.
			// 		==  현재 발생한 exception을 네가 대신 처리해달라 라고 요청
			 throw new NumberFormatException();
			
			 
			 
			
			// 코드를 이렇게 작성할 경우에 사용자가 값을 잘 못 입력할 경우
			// 코드가 무한반복 루프에 빠지게 된다(catch문을 만나면 다시 while로 돌아가 무한 반복)
			// 그래서 if문을 작성해 종료할 수 있게 해줘야함
			// while(true) {
			//	System.out.println("연도를 다시 입력하세요(종료 : -1) >> ");
			//	String s1 = scan.nextLine();
			//	try {
			//		intPrice = Integer.valueOf(s1);
			//		if(intPubYear == -1) break;
			//		break;
			//	} catch (Exception e2) {
			//	}
		//	}
			 
			 
			 
			 
		}
		
		System.out.print("출판년도 >> ");
		String strPubYear = scan.nextLine();
		
		// 이 코드를 try문 안에 작성을 하면
		// 이 코드가 정상적으로 실행됐을 때 intPubYear가 사라져버림
		// try문 밖에서 초기화를 하고 try문 안에서 값만 설정해주기
		
		/*
		 * int intPubYear 변수를 try{} 안에서 선언을 하게되면
		 * 만약 정상적으로 코드가 수행되고
		 * try 다음줄 명령코드를 실행하는 과정에서
		 * intPubYear 변수를 참조할 수 없다.
		 * 
		 * 반드시 try가 시작되기 전에
		 * 변수를 선언하고 clear를 한 상태에서
		 * try 내에서 변수에 어떤 값을 저장하도록
		 * 코드가 작성 되어야한다.
		 * 숫자일 경우 반드시 값을 0으로 clear해줘야하고
		 * 문자일 경우에는 ""; White space로 clear해줘야함
		 */
		int intPubYear = 0;
		
		
		try {
			intPubYear = Integer.valueOf(strPubYear);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("** 년도는 숫자로만 입력하세요 **");
			throw new NumberFormatException();
		
		}
		
		BookVO bookVO = new BookVO();
		bookVO.setStrNum(strNum);
		bookVO.setStrName(strName);
		bookVO.setStrComp(strComp);
		bookVO.setStrWriter(strWriter);
		bookVO.setIntPrice(intPrice);
		bookVO.setIntPubYear(intPubYear);
		
		bookList.add(bookVO);
		
	}

	@Override
	public void list() {

		System.out.println("=================================================");
		System.out.println("도서 정보 일람표");
		System.out.println("=================================================");
		System.out.println("ISBN\t도서명\t출판사\t저자\t가격\t출판년도");
		System.out.println("-------------------------------------------------");
		
		/*
		int nSize = bookList.size();
		for(int i = 0 ; i < nSize; i++) {
			
			BookVO vo = bookList.get(i);
			
			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getStrName() + "\t");
			System.out.print(vo.getStrComp() + "\t");
			System.out.print(vo.getStrWriter() + "\t");
			System.out.printf("%5d\t",vo.getIntPrice());
			System.out.printf("%4d\n",vo.getIntPubYear());
		}
		*/ 
	
		for(BookVO vo : bookList) {
			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getStrName() + "\t");
			System.out.print(vo.getStrComp() + "\t");
			System.out.print(vo.getStrWriter() + "\t");
			System.out.printf("%5d\t",vo.getIntPrice());
			System.out.printf("%4d\n",vo.getIntPubYear());
		}
		
	}

	@Override
	public void view(int index) {

		/*
		 * System.out.println("ISBN : " + bookList.get(index).getStrNum());
		 * ==> 각 항목을 console에 표시할 때마다
		 * bookList로부터 index번째의 BookVO를 추출하고
		 * 추출된 BookVO의 getter() method를 호출하는 방식
		 * 코드의 가독성이 낮고 (확실하지는 않지만) 밑 코드보다 효율성이 떨어질 수 있음
		 */
		
		
		BookVO vo = bookList.get(index);
		/*
		 * ==> 코드 시작점에서 bookList로부터 index번째의 BookVO를 추출하여
		 * 변수에 저장해두고 getter() method만을 호출하여 값을 표시한다
		 * 코드의 가독성이 높고 코드의 효율성이 높아질것으로 예상
		 */
		
		System.out.println("======================================================");
		System.out.println("ISBN : " + vo.getStrNum());
		System.out.println("도서명 : " + vo.getStrName());
		System.out.println("출판사 : " + vo.getStrComp());
		System.out.println("저자 : " + vo.getStrWriter());
		System.out.println("가격 : " + vo.getIntPrice());
		System.out.println("출판년도 : " + vo.getIntPubYear());
		System.out.println("=======================================================");
	}

	// 도서명으로 검색하는 method
	@Override
	public void view(String strName) {

		int nSize = bookList.size();
		for(int i = 0 ; i < nSize; i++) {
			
			BookVO vo = bookList.get(i);
			String voStrName = vo.getStrName();
			
			// 도서명과 검색어(strName)이 반드시 일치하는 것만 검색
			if(voStrName.equalsIgnoreCase(strName)) {
				this.view(i);
				break; // 최초로 발견된 1개의 정보만 확인하고 마침(break 없으면 이름이 같은 모든 도서리스트 출력)
		}
			
			// 도서명 문자열중에 strName 문자열이 포함되어 있으면
			// 그 값을 표시하는 코드( == 중간문자열 검색)
			// "ABC".contains("B")
			// ==> 문자열 ABC중에 문자열 B가 포함되어있냐?
			
			if(voStrName.toUpperCase().contains(strName.toUpperCase())) {
				this.view(i);
			}
		}
	}
}

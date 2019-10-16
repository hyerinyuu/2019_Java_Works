package com.biz.lombok.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.lombok.domain.StudentVO;
import com.biz.lombok.service.StudentReadServiceV1;
import com.biz.lombok.service.StudentViewServiceABS;
import com.biz.lombok.service.StudentViewServiceV1;

/*
 * 학생정보.txt파일을 읽어서 
 * 1. 모든 학생의 리스트를 콘솔에 보이기
 * 2. 이름을 입력받아 해당하는 학생 리스트를 콘솔에 보이기
 * 3. 학년을 입력받아 해당하는 학년의 학생들만 콘솔에 보이기
 * 4. 두개의 정수를 입력받아 해당 범위의 학년에 해당하는 학생들만 콘솔에 보이기
 * 
 */
public class StudentEx_02 {

	public static void main(String[] args) {

		String fileName = "src/com/biz/lombok/학생정보.txt";
		
		StudentReadServiceV1 sRead = new StudentReadServiceV1();
		StudentViewServiceABS sView = new StudentViewServiceV1();
		Scanner scan = new Scanner(System.in);
		
		
		try {
			sRead.readStudent(fileName);
			List<StudentVO> stdList = sRead.getStdList();
			sView.setStdList(stdList);
			sView.view();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(true) {
			
			System.out.println("=========================================================");
			System.out.println("학생정보.v1");
			System.out.println("=========================================================");
			System.out.println("1.이름      2. 학년      3. 학년별        0.종료");
			System.out.println("---------------------------------------------------------");
			System.out.print("선택하세요 >> ");
			
			String strE = scan.nextLine();
			int intE = Integer.valueOf(strE);
			if(intE == 0) break;
			
			if(intE == 1) {
				System.out.print("찾으시는 학생의 이름을 입력하세요 >> ");
				String strName = scan.nextLine();
				sView.view(strName);
			}
			if(intE == 2) {
				System.out.print("찾으시는 학생의 학년을 입력하세요 >> ");
				String strGrade = scan.nextLine();
				
				try {
					sView.view(Integer.valueOf(strGrade));
				} catch (Exception e) {
					
					System.out.println("***학년은 숫자만 입력하세요***"); 
				}
			}if(intE == 3) {
				
				System.out.print("찾으시는 학생의 최소 학년을 입력하세요 >> ");
				String strLessGrade = scan.nextLine();
				
				System.out.print("찾으시는 학생의 최대 학년을 입력하세요 >> ");
				String strMaxGrade = scan.nextLine();
				
				try {
					sView.view(
							Integer.valueOf(strLessGrade), 
							Integer.valueOf(strMaxGrade));
					
				} catch (Exception e) {
					System.out.println("***학년은 숫자만 입력하세요***"); 
				
				}
				
			}
			
			
			
		}
		System.out.println("************************");
		System.out.println("업무가 종료되었습니다.");
		System.out.println("************************");
		
	}
	
	

}

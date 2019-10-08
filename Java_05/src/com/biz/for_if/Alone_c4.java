package com.biz.for_if;

public class Alone_c4 {

	public static void main(String[] args) {

		int score = 86;
		char grade;
		
		if(score > 100) {
			System.out.println("성적을 다시 확인하고 입력해주세요");
		}
		
		if(score >=90 && score <=100) {
			grade = 'A';
			System.out.println("성적 : " +  grade);
		}
		if(score >=80 && score <=89) {
			grade = 'B';
			System.out.println("성적 : " +  grade);
		}
		if(score >=70 && score <=79) {
			grade = 'C';
			System.out.println("성적 : " +  grade);
		}
		if(score >=60 && score <=69) {
			grade = 'D';
			System.out.println("성적 : " +  grade);
		}
		else if(score <=59) {
			grade = 'F';
			System.out.println("성적 : " +  grade);
			
		}
		
		
	}
	
}
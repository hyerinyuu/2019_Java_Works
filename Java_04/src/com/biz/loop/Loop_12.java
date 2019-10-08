package com.biz.loop;

public class Loop_12 {

	public static void main(String[] args) {

		
		// [이중 for문]
		for(int i = 0; i <10; i++) {			
			for(int j = 0 ; j < 10 ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
			
		}		
		/*
		 * [이중 for 반복문]
		 * 2개 이상의 for문을 반복하여 실행하는 구조(세번 이상도 사용 가능하지만 거의 사용x)
		 * 
		 * 바깥쪽 for문이 한번 실행될 때 
		 * 안쪽 for문은 10 번 반복 실행되고
		 * System.out.print("* ") 은 모두 100번 실행된다.
		 * 
		 * 안쪽 for 문이 10번 반복 실행된 후
		 * System.out.println()을 실행하여 줄바꿈 실행
		 * 
		 * 그렇게 10 * 10 까지 별 박스를 출력한다.
		 */
		System.out.println("===============================");
		
		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0 ; j < 10 ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}

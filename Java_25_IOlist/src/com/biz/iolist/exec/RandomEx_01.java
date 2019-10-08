package com.biz.iolist.exec;

public class RandomEx_01 {

	public static void main(String[] args) {

		for(int i = 0 ; i < 10 ; i ++) {
		double rnd1 = Math.random();
		// Math()는 기본적으로 double형인데
		// rnd1 = 0.nnnnnnnn~~ 형식으로 출력됨
		// rnd1에 10을 곱하면 n.nnnnnn이 됨
		// rnd1을 int로 형변환을 시켜주면 자동형변환이 일어나 소수점 이하값은 자동으로 버려짐 => n
		//
		
		
		System.out.println(rnd1);
		}
		int start = 10;
		int end = 55;
		for(int i = 0 ; i < 10 ; i++) {
			
			/*
			 * 0부터 1 미만의 값을 double형으로 생성하는 method
			 */
			double rnd1 = Math.random();
			
			// start ~ end 까지 범위의 임의 수를 생성하라
			int num = (int)(rnd1 *(end - start + 1) + start);
			System.out.println(num);
			
		}
				
			
		
		
	}
	

}

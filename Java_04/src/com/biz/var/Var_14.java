package com.biz.var;

public class Var_14 {
public static void main(String[] args) {


		int dNum = 6;
		int cNum = 2;
		
		System.out.println("======================");
		System.out.printf("구구단 %d 단\n", dNum );
		System.out.println("----------------------");
		
		System.out.printf("%d x %2d = %3d\n", 
				dNum, 
				cNum, 
				dNum * cNum++); // 6 x 2 = 12
		
		System.out.printf("%d x %2d = %3d\n", 
				dNum, 
				cNum, 
				dNum * cNum);  // 6 x 3 = 18

		System.out.printf("%d x %2d = %3d\n", 
				dNum, 
				++cNum, 
				dNum * cNum);  // 6 x 4 = 24
		
		

}
}
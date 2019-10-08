package com.biz.loop;

public class Practice {

	public static void main(String[] args) {

		// int nCount = 0;
		
		// System.out.printf("%d x %d = %d\n", 6, ++nCount, nCount * 6);
		// System.out.printf("%d x %d = %d\n", 6, ++nCount, nCount * 6);
		
		//int nCount = 0;
		//for (; nCount < 9;) {
			//System.out.printf("%d x %d = %d\n", 
				//	7,++nCount,nCount * 7);
		
		int nCount = 1;
		int nDan = 7;
		for (; nCount < 10 ;) {
			System.out.printf("%d x %d = %d\n",
					7,nCount, nCount++ * nDan);
						}
	
	
		
	}

}

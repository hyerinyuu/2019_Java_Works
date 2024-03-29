package com.biz.for_if;

public class If_06 {

	public static void main(String[] args) {

		int num = 47;
		// [if문의 중첩]
		/*
		 * 다양한 조건에 따라
		 * 명령문들을 실행할 경우에
		 * 여러번의 조건을 수행하는 방법
		 */
		
		// 1번 코드
		if(num % 3 == 0)
			System.out.println(num + "는 3의 배수");
		else if(num % 4 == 0)
			System.out.println(num + "는 4의 배수");
		else if(num % 2 == 0)
			System.out.println(num + "는 2의 배수");
		
		
		// 2번 코드
		if(num % 3 == 0)
			System.out.println(num + "는 3의 배수");
		if(num % 4 == 0)
			System.out.println(num + "는 4의 배수");
		if(num % 2 == 0)
			System.out.println(num + "는 2의 배수");
		
		
		// 이 두 코드의 결과값은 동일하나 큰 차이가 존재한다.
		// 1번 코드는 조건의 순서에 따라 실행한 후 중간에라도 조건이 성립되면
		// 나머지 아래부분은 실행하지 않고 그냥 건너뛰지만
		// 2번 코드는 순서에 따라 실행하고 중간에 조건이 성립되어도
		// 나머지 코드를 계속 실행한다
		// 따라서 2번 코드는 1번 코드보다 효율성과 경제성이 떨어진다고 볼 수 있다.
		// 
		// 하지만 num의 값이 8인 경우 1번코드는 8은 4의배수라고 실행되고 그대로 종료되지만
		// 2번 코드의 경우에는 2와 4의 배수라고 표시를해주므로
		// 두 코드를 효율성면에서만 비교해서 보지 말고
		// 상황에 따라 적절한 코드를 선택해야 한다.
		
		
		
		/*
		 * ######## 1번 코드와 2번 코드는 변수에 담긴 값이
		 * 2,3,4의 배수인가를 알아보는 같은 일을 하는 코드이다.
		 * 하지만
		 * 1번 코드는
		 * 만약 변수에 담긴 값이 3의 배수이면
		 * 		3의 배수라는 표시를 하고
		 * 		나머지 부분은 건너뚜니다.
		 * 그에 반해 2번 코드는
		 * 변수에 담긴 값이 3의 배수임을 찾았음에도 부루하고
		 * 		 4의 배수, 2의 배수인가를
		 * 		검사하는 코드가 실행된다.
		 * 
		 * 조건이 복잡해 질수록
		 * 코드실행의 효율성이 2번보다는 1번이 좋다.#######
		 */
		
		
		/*
		 * 두 코드를 효율적인 면에서만 비교하지 않고
		 * 문제풀이적 관점에서 비교해 보면
		 * 만약 어던 값이 2의 배수이면서 4의 배수인경우
		 * 1번 코드는 4의 배수인 경우만 표시를 하고
		 * 2번 코드느 4의 배수인 경우와 2의 배수인 경우 모두를 표시하므로
		 * ###제시된 문제에 따라 적절한 코드를 선택해야한다.###
		 */
		
	}

}

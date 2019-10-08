package com.biz.single.service;

// 아주 고급 기능임
// cpu 성능과 메모리가 데스크탑에 비해 낮은 안드로이드에 앱을 만들때 주로 사용
// 이거 안쓰고도 다른 좋은 방법이 많아서 실무에서는 거의 안씀

/*
 * thread 환경에서 안정성을 보장한다 == 동기화보장
 *  	동기화 보장 == 여러개의 thread가 동시에 한개의 메모리에 접근했을때 안전하게 구동할 수 있도록 보장하는 것
 *  
 *  thread 환경에서 개발자가 동기화 문제를 직접 해결하는 것은
 *  배보다 배꼽이 더 엄청나게커지는 결과를 낳게 된다(실제 만드는 project보다 훨씬 복잡하고 많은 코드를 적어야 할 수 있어서)
 *  
 *  다양한 방법으로 thread safe 하기 위해서 여러가지 도구를 사용하는데,
 *  
 *  운영체제에게 관리를 맡기는 방법도 사용했지만
 *  JVM 환경에서는 썩 좋은 패턴이 아니다.
 *  ==> 운영체제마다 메모리를 관리하는 방법이 달라서 호환성에 문제를 일으킬 수 있기 때문이다.
 *  
 *  Holder방식은 JVM의 초기화(시작) 과정에서 원자적 특성을 사용하여
 *  싱글톤클래스의 초기화와 thread에 관련된 문제에 대한 책임을 
 *  전적으로 JVM에게 일임하는 것.
 *  코드가 비교적 간단하고 매우 안정적이어서 최근에 가장 많이 사용하는 기법임
 *  
 *  결론 : 나는 관심 없으니 JVM이 알아서해라
 *   
 *  SingleTone class의 발전 과정 
 *  [SafeSingleClassV1 -> SafeLazysingleV2 -> HolderSingleClassV3]
 *   
 */

public class HolderSingleClassV3 {

	// Holder을 사용하면 사용시에 모든 변수를 공유하기 때문에 따로 사용법들이 있음
	private HolderSingleClassV3() {
	}
	
	//변수를 별도로 설정 안하고 static class를 많듦
	// Inner class : 클래스 내부에 존재하는 클래스
	private static class InnerHolder{
		public static final HolderSingleClassV3 INSTANCE 
						= new HolderSingleClassV3();
	}
	
	public static HolderSingleClassV3 getInstance() {
		return InnerHolder.INSTANCE;
	}
	
	public void viewName() {
		System.out.println("나는 싱글톤이다!");
	}
	
}

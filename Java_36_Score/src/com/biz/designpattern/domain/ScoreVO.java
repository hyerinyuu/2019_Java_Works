package com.biz.designpattern.domain;

public class ScoreVO {

	private String s_num;
	private int s_kor;
	private int s_eng;
	private int s_math;
	
	// 기본생성자
	public ScoreVO() {
	}

	/*
	 * Builder class를 매개변수로 갖는 생성자 코드 선언
	 * Builder class는 현재 ScoreVO가 가지고 있는 Inner class
	 */
	private ScoreVO(Builder builder) {
		this.s_num = builder.s_num;
		this.s_kor = builder.s_kor;
		this.s_eng = builder.s_eng;
		this.s_math = builder.s_math;
	
	
	}

	// 디버그용 toString
	@Override
	public String toString() {
		return "ScoreVO [s_num=" + s_num + ", s_kor=" + s_kor + ", s_eng=" + s_eng + ", s_math=" + s_math + "]";
	}
	
	/*
	 * [Builder 클래스를 선언]
	 * ###
	 * 1. 실제 클래스(ScoreVO)의 필드변수 복사하여 붙이기
	 * 2. 필드변수들의 setter() 생성해서 return에 void 삭제하고 Builder 붙여줌
	 * 3. this 예약어로 값 저장
	 * 		obj.s_num().s_kor().s_eng().s_math()  ==> chaining
	 * 4. setter 접두사 모두 삭제하고 첫글자 소문자로 바꾸기
	 * 5. 부모클래스(ScoreVO)를 return하는 build() method 생성하고 this를 return
	 * 6. 오류가 발생하면 create constructor을 생성
	 * 7. this 예약어로 멤버변수들을 불러와서 build()로 값 주입
	 * (this.s_num = builder.s_num)
	 * 
	 * Builder 클래스 사용법은 ScoreEx_01이나 02 참조
	 * 
	 * 
	 * 1. getter를 가지고와서 매개변수로 멤버변수들을 주입해주고(to String은 선택사항)
	 * 2. build class를 만들어 클래스 내부에 사용하고자 하는 멤버변수 입력
	 * 3. 멤버변수와 같은 이름의 method 생성
	 */
	public static class Builder {
	
		private String s_num;
		private int s_kor;
		private int s_eng;
		private int s_math;
		
		
		public Builder() {

		}


		public Builder s_num(String s_num) {
			this.s_num = s_num;
			return this;
		}


		public Builder s_kor(int s_kor) {
			this.s_kor = s_kor;
			return this;
		}


		public Builder s_eng(int s_eng) {
			this.s_eng = s_eng;
			return this;
		}


		public Builder s_math(int s_math) {
			this.s_math = s_math;
			return this;
			
		}
		
		public ScoreVO build() {
			return new ScoreVO(this);
		}
		
	}
	
}

package com.biz.classes.service.children;

import com.biz.classes.service.parents.Animal;

/*
 * Animal 클래스를 상속받은 Dog 클래스
 */
public class Dog extends Animal{

	public void setName() {
		
		// Animal을 상속받아서 name변수 사용 가능
		this.name = "몽이";
		
	}
	
	/*
	public String getName(){
		
		return this.name;
	}
	*/
	
	
}

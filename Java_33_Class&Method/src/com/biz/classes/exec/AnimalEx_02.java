package com.biz.classes.exec;

import com.biz.classes.service.children.Cat;
import com.biz.classes.service.children.Dog;
import com.biz.classes.service.parents.Animal;

public class AnimalEx_02 {

	public static void main(String[] args) {

		// dog1의 이름을 setName()을 호출해서
		
		// 부모클래스(Animal)로 선언을 하고
		// children 클래스로(dog, cat) 초기화 생성을 하는 방식(권장)
		Animal dog1 = new Dog();
		Animal cat1 = new Cat();

		// 몽이로 변경하고 싶다.
		// Animal에는 없고, Dog에는 있는
		// setName()을 호출하려면
		viewName(dog1);
		viewName(cat1);
		
		// dog1을 dog로 형변환을 하면 animal
		((Dog)dog1).setName();
		viewName(dog1);
		
		((Cat)cat1).setName();
		viewName(cat1);
	}
	
	public static void viewName(Animal animal) {
		String name = animal.getName();
		System.out.println(name);
	}

}

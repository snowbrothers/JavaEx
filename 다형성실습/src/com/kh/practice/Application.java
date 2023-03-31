package com.kh.practice;

import com.kh.practice.model.vo.Animal;
import com.kh.practice.model.vo.Cat;
import com.kh.practice.model.vo.Dog;

public class Application {

	public static void main(String[] args) {

		// Animal 타입의 객체 배열 크기 5 로 생성
		Animal[] aniArr = new Animal[5];
		
		Animal dog = new Dog("늑도리", "말티즈", 10);
		Animal cat = new Cat("호도리", "짬타", "위병소", "갈색");

		
		System.out.println("===================================");
		for(int i=0; i<5; i++) {
			// 0,1
			int index = (int)(Math.random()*2); 
			
			if(index == 1) {
				//배열이름[방번호]
				aniArr[i] = dog;
			} else {
				aniArr[i] = cat;
			}
		}
		
		//출력 
		for(Animal ani : aniArr) {
			
			// 자식 객체에서 오버리이딩 된 메서드는
			// 호출 할때 부모 메서드가 아닌 자식 메서드가 호출됨.
			ani.speak();
		}
		
		
		// 각 인덱스에 무작위로 Dog 객체 또는 Cat 객체로 생성
		// (이때, 매개변수 생성자를 이용하여 생성)
		
		// 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지의
		// 객체의 speak() 메소드 호출
		
	}

}

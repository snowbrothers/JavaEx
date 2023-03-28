package com.kh.practice2.model;

import com.kh.practice2.model.vo.Animal;
import com.kh.practice2.model.vo.Cat;
import com.kh.practice2.model.vo.Dog;

public class Application {

	public static void main(String[] args) {

		Animal dog = new Dog(" 말티즈", "포유류", 8);
		Animal cat = new Cat(" 이딴딴", "포유류", "집", "갈색");

		dog.speak();
		cat.speak();

		System.out.println();
		System.out.println("배열출력 =====================================================");
		System.out.println();

		// Animal 타입의 배열생성

		Animal[] aniArr = new Animal[5];

		while (true) {
			
			int k = 0;
			k++;
			

			for (int i = 0; i < aniArr.length; i++) {
				
				int num = (int) (Math.random() * 2 + 1);

				if (num == 1) {

					aniArr[i] = new Dog("강아지", "포유류", 7);

				} else if (num == 2){

					aniArr[i] = new Cat("고양이", "포유류", "집", "갈색");
				}

				
			}	 if(k < aniArr.length) {
				break;
			}

		}

		for (Animal ani : aniArr) {

			ani.speak();

		}

	}
}

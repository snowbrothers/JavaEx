package com.soccer;

public class GoalResult extends Shoot {

	
	//생성자
	
	public void Shooting() {
		
		
		GoalResult();
		
		
	}
	
	
	
	// 메서드
	public  void GoalResult() {

		int i=0;
		
		
		while (true) {

			super.Shoot();
			System.out.println("==========================");
			
			int result = (int) (Math.random() * 2 + 1);

			if (result == 1) {

				System.out.println(" GOAL ~~~~~~~~~~~~~~~~~~~~~ ");
				System.out.println("======================= ");
				i++;
				
			} else if(result == 2) {
				
				System.out.println(" 골키퍼의 선방 입니다 ! ! !");
				System.out.println("=======================");
			} 
				
			
			
			
			if(i == 3  ) {
				System.out.println("슈팅프로그램을 종료합니다.");
				break;
			}
			
			
		}

	}

}

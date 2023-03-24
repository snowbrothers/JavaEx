package getter.setter;

public class CarMain {

	public static void main(String[] args) {
		
		// 객체 생성
		Car car = new Car();
		
		// private 접근제한자를 이용한 경우에는
		// 필드에 직접 접근 할 수 없기때문에
		// setter 메서드 //setSpeed 로 필드의 값을 변경한다.
		car.setSpeed(0);
		
		System.out.println("현재 속도는 " + car.getSpeed() + "km");
		
		System.out.println("=====================   값 변경");
		
		car.setSpeed(50);
		System.out.println("현재 속도는 " + car.getSpeed() + "km");
		
		// 멈춤 : true / 생성되었을때 : false
		// 멈추지 않은 상태라면 멈추는 메서드를 호출 
		// 멈춘 상태라면 진행하는 메서드 호출
		
		 if(!car.isStop()){
				car.setStop(true);
		  }
		 
		
		car.setStop(true);
		System.out.println("현재 속도는 " + car.getSpeed() + "km");
		
	}
}

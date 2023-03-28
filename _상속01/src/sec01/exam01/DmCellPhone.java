package sec01.exam01;

public class DmCellPhone extends CellPhone {

	// 자식 클래스
	
	// 필드 
	int channel;
	
	
	// 생성자
	DmCellPhone(String model, String color, int channel){
		this.model = model;   // 상속받은 필드
		this.color = color;   // 상속받은 필드
		this.channel = channel;
	}
	
	
	
}

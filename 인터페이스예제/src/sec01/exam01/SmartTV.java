package sec01.exam01;

// Television 을 상속받고 있으면서 implements 를 구현한다.?
public class SmartTV extends Television implements Searchable {

	@Override
	public void turnOn() {
		System.out.println("SmartTV 를 켭니다.");
	}
	
	@Override 
	public void setVolme(int volume) {
		
		if(volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		
		} else if(volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		
		} else {
			this.volume=volume;
		
	}
		System.out.println("현재볼륨 : " + this.volume);
		}

	@Override
	public void serarch(String url) {
		System.out.println(url + "을 검색합니다.");	

	}
	

	
	
}

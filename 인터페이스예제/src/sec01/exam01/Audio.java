package sec01.exam01;

// implements << 
public class Audio implements RemoteControl, Searchable{

	// 여러개의 인터페이스 구현
	// 인터페이스 추상메서드 모두 구현
	// 모름
	
	// 메서드 오버라이드
	
	private int volume; 
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}

	@Override // 값을 받아와서 세팅
	public void setVolme(int volum) {
		
		this.volume = volum;
		
		// 인터페이스의 상수값을 이용해서 volume필드의 값을 제한.
		if(volum > MAX_VOLUME) {
			
			this.volume = MAX_VOLUME;
		
		} else if(volum < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		}
		
		
		
		System.out.println("현재 TV 볼륨 : " + this.volume);

	
		
	}

	@Override
	public void serarch(String url) {

		System.out.println(url + "을 검색합니다.");	
		
	}

}

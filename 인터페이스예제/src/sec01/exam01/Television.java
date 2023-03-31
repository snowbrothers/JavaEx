package sec01.exam01;

public abstract class Television implements RemoteControl {

	protected int volume;

	@Override
	public void turnOn() {

		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolme(int volume) {
		
		if(volume == MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		
		} else if(volume == MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		
		} else {
			this.volume=volume;
		
	}
		System.out.println(this.volume);
		}

	// get, set //
	
	
	
//	public int getVolume() {
//		return volume;
//	}
//
//	public void setVolume(int volume) {
//		this.volume = volume;
//	}

	
	
	
}

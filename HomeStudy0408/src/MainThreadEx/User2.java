package MainThreadEx;

public class User2 extends Thread{

	private Calculator cal;
	
	public void setCal(Calculator cal) {
		
		this.setName("User2");
		this.cal = cal;
		
		
	}
	
	public void run() {
		
		cal.setMemory(50);
	}
	
}

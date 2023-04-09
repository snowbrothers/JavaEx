package MainThreadEx;

public class User1 extends Thread {
	
	private Calculator cal;
	
	
	public void setCal(Calculator cal) {
		
		this.setName("User1");
		this.cal = cal;
	}
	
	
	@Override
	public void run() {

	cal.setMemory(100);
	}
}

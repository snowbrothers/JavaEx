package Q1;

import java.awt.Toolkit;

public class Tool implements Runnable {

	
	

	
	

	@Override
	public void run() {

		// 스레드가 실행할 코드를 작성
		
		Toolkit tool = Toolkit.getDefaultToolkit();
		
		
		// 반복문 
		for(int i=0; i<5; i++) {
			
			
			tool.beep();
			
			try {Thread.sleep(2000); } catch (InterruptedException e) {}
			
		}
		
	}
}

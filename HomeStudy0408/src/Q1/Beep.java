package Q1;

import java.awt.Toolkit;

public class Beep {

	
	public static void main(String[] args) {
		
		// 메인 스레드 
		
		// 툴킷 객체 얻기
		Toolkit tool = Toolkit.getDefaultToolkit();
		
		Runnable beep = new Tool();
		Thread thread = new Thread(beep);
		thread.start();
		

		for(int i=0; i<5; i++) {
		
			System.out.println("띵 - ");
			
			try {
			
				Thread.sleep(2000);
		
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
	
	}


}

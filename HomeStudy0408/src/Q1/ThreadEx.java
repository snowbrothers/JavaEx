package Q1;

public class ThreadEx {

	
	public static void main(String[] args) {
		
		Thread thread = new runEx();
		
		thread.start();
	
		
		for(int i=0; i<5; i++) {
			
			System.out.println("딘 - -");
			
			try {
				
				Thread.sleep(2000);
			
			} catch (InterruptedException e) {
			
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
}

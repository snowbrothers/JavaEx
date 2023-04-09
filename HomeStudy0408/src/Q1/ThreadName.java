package Q1;

public class ThreadName {

	
	public static void main(String[] args) {
		
		// 메인스레드 
		// .currentThread : Thread 클래스의 정적 메소드
		Thread mainThread = Thread.currentThread(); 
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName());
		
		
		
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();
	
		

		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();

		
		
	}
}

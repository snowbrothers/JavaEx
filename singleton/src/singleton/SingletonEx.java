package singleton;

public class SingletonEx {

// 접근제한자 정적필드   자신의 클래스이름   변수명 =  연산자  타입 
	private static SingletonEx singleton = new SingletonEx();
	
	private SingletonEx() {}
	
	
	static SingletonEx getInstance() {
		return singleton;
	}
	
	}


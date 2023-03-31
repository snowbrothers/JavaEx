package com.jungang;

public class HttpServletExample {

	public static void main(String[] args) {
		
		
		// 내 안에 있는 메서드 이기 때문에 타입.이름 형식으로 호출 할 필요 없음.
		method(new LoginServlet()); // 로그인 합니다.
		method(new FileDownloadServlet()); // 파일을 다운로드 합니다.
	
	}

	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}

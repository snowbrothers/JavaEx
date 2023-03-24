package com.kh.object.practice;

import java.util.Arrays;

public class NonStaticSample {
	

	
	
	
	
	public void	printLottoNumbers(){
		// 1 ~ 45 까지의 임의의 정수 6개가 중복되지 않게 발생시켜 출력하는 메소드
		// 응용 -- > 오름차순 정렬로 출력
		
		// index 0, 1, 2, 3, 4, 5
		int[] numbers = new int[6];
		int i = 0;
	
	
	while(true) {
		// num 은 45 개 중 랜덤의 숫자 
		int	num = (int)(Math.random() *45+1);
		
		// 만약 numbers[i] 의 값이 num 과 같지않다면
		// numbers[i] 에 num 을 저장 하고 i 1증가
		if(numbers[i] != num) {
			numbers[i] = num;
			i++;
		}
		if(numbers[5]!=0) {
			break;
		}
	}
		
	Arrays.sort(numbers);
	
	for(int num : numbers) {
		System.out.println(num);
	}
	
	
	
	//for(int arr2 : arr) {
		//System.out.println(arr2);
		//i++;
		
	
		//if(i <= arr.length) {
				

				//System.out.println(num);
		}
	
	
	
	
	
	
	
	public void outputChar(int num, char c) {
		// 매개변수로 전달받은 문자 c를 전달받은 num 갯수 만큼 출력하는 메소드
	}
	
	public char alphabette() {
		
		// 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
		// 주의! 소문자 대문자 모두 포함 // 임의의 알파벳을 하나 리턴
		
		return 0;
	}
	
	public String mySubstring(String str, int index1, int index2 ) {
		
		// 매개변수로 문자열과 시작 인덱스, 끝 인덱스를 전달 받고
		// 해당 인덱스 범위의 문자열을 추출하여 리턴
		// 단, 전달받은 문자열은 반드시 값이 있어야 한다. --> 없으면 null 리턴
		
		return null;
	}
	
	
	
}

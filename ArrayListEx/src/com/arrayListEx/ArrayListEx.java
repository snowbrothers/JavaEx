package com.arrayListEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {

		
		// List 는 인터페이스 직접 생성 불가
		// 리스트 선언
		List<String> list = new ArrayList<String>();
		
		// 리스트에 저장
		list.add("Java");
		list.add("JDBC");
		list.add("Servelt/JSP");
		list.add("myBATIS");
		list.add(2, "Database"); /// 데이터 추가 가능 
		
		// 삭제
		list.remove(1);
		
		//변경
		list.set(2, "oracle");
		//리스트에 저장된 총 갯수
		int size = list.size();
		System.out.println("총 갯수 : " + size);
	
	
		// 리스트에 저장된 객체 얻기
		String str = list.get(2);
		System.out.println("2번 인덱스 : " + str);

		// 인덱스는 0부터 시작
		for(int i=0; i<list.size(); i++) {
			
			str = list.get(i);
			System.out.println(i + " : " + str);
		}
	
		System.out.println("=====================");
		
		int i =0;
		for(String s : list) {
			
			System.out.println(i + ": "  + s);
			i++;
		}
	
	
	}

}

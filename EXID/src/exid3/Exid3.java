package exid3;

public class Exid3 {

	public static void main(String[] args) {
		// 자동 타입 변환
		/*byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드:" + intValue);

		intValue = 50;
		long longValue = intValue;
	    System.out.println("longValue: " +  longValue);
	    
	    longValue = 100;
	    float floatValue = longValue;*/
	    
	    int Value = 10 + 2 + 8;
	    System.out.println("Value: " + Value);
	    
	    /* 문자열 결합 연산
	    String str1 = 10 + 2 + "8";
	    System.out.println("str1: " + str1);
	    
	    String str2 = 10 + "2" + 8;
	    System.out.println("str2: " + str2);
	    
	    String str3 = "10" + 2 + 8;
	    System.out.println("str3: " + str3);
	    
	    String str4 ="10" + ( 2 + 8);
	    System.out.println("str4: " + str4); */
	    
	    //문자열을 기본 타입으로 강제 타입 변환
	    String str ="10";
	    byte value = Byte.parseByte(str);
	    System.out.println(value);
	    
	    String str1 = "200";
	    short Value1 = Short.parseShort(str1);
	    System.out.println(Value1);
	    
	    String str2 = "30000";
	    int Value2 = Integer.parseInt(str2);
	    System.out.println(Value2);
	    
	    String str3 = "4000000000";
	    long Value3 = Long.parseLong(str3);
	    System.out.println(Value3);
	    
	    String str4 = "12.345";
	    float Value4 = Float.parseFloat(str4);
	    System.out.println(Value4);
	    
	    String str5 = "12.345";
	    double Value5 = Double.parseDouble(str5);
	    System.out.println(Value5);
	    
	    String str6 = "false";
	    boolean Value6 = Boolean.parseBoolean(str6);
	    System.out.println(Value6);
	    
	    
	    
	    
	   
	    
	    
	    
	    
	    
	    
	}
	

}

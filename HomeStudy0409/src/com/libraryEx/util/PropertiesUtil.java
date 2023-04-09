package com.libraryEx.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

	public static String getProp(String confName) {
		
		FileReader fr = null;
		Properties prop = null;
		
		try {
			fr = new FileReader("conf/config.properties");
			prop = new Properties();
			
			prop.load(fr);
			
			return prop.getProperty(confName);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "";
	}
	
}

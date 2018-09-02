package com.crmpro.utilityclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

	public static String readData(String key) {
		File f= new File("./src/test/resources/config.properties");
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		Properties pro= new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return pro.getProperty(key);
		
		
	
	}

}

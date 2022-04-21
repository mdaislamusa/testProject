package com.util;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseConfig {

	public static String getConfig(String value) throws Throwable {
		String path =  "D://config.properties.txt"; //"./Config/config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		
		return prop.get(value).toString();
	}
	
}

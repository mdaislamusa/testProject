package com.test.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Zoopla {
	
	public static void getProperty() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(BaseConfig.getConfig("URL"));
	}
	

}


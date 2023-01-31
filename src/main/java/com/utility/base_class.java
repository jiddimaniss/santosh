package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base_class {

	public static WebDriver driver;
	public static config_data_provider config;
	public static Excelldata_provider excel;
	@BeforeSuite
	public void initilazitinon () throws Exception {
		 config=new config_data_provider();
		 excel=new Excelldata_provider();
	}
	
	
	@Parameters({"BrowserName"})
	@BeforeMethod
	// this code is for calling TestNg only
	public void setup(String BrowserName) {
		if(BrowserName.equalsIgnoreCase("chrome")) {
			
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(config.getQAENVIRONMENT_1());
		driver.manage().window().maximize();
		
		}
}
	
		
	@AfterMethod
	public void close() {
		driver.quit();
	}
	


}

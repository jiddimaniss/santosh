package com.utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test;
	
	public static void custom_senkeys(WebElement element,String value,String fieldname) {
		
		try{
			element.sendKeys(value);
			test.log(Status.PASS, fieldname+"=Value Succesfully Send ="+ value);
		}
		catch(Exception e){
			test.log(Status.FAIL,e.getMessage());
		}
	}
	
	public static void custom_click (WebElement element, String fieldname) {
		try {
			element.click();
			test.log(Status.FAIL,"=Value Succesfully Send ="+ fieldname);
		}
		catch(Exception e){
			test.log(Status.FAIL,e.getMessage());
		}
	}

}

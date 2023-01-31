package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class logi_page_pom {
	
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	//@FindBy(id="email")
	private WebElement txt_email;
	
	@FindBy(how=How.XPATH,using="//input[@name='pass']")
	private WebElement txt_pass;
	
	@FindBy (how=How.XPATH,using="//button[@type='submit']")
	private WebElement txt_btn;

	public WebElement gettxt_email() {
		return txt_email;
	}
	public WebElement gettxt_pass() {
		return txt_pass;
	}
	public WebElement gettxt_btn() {
		return txt_btn;
	}
		
	
}

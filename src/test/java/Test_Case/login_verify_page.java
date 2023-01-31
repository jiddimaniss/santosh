package Test_Case;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobject.logi_page_pom;
import com.utility.Library;
import com.utility.base_class;

public class login_verify_page extends base_class {
	
	@Test
	public void verify_TC_01_verifyloginpage() throws InterruptedException  {
		
		
	    logi_page_pom  login=PageFactory.initElements(driver, logi_page_pom.class); 
	    
		Library.custom_senkeys(login.gettxt_email(),excel.getstringdata("Sheet1", 0, 0), "EmailID");
		
		//Thread.sleep(3000);
		
		Library.custom_senkeys(login.gettxt_pass(),excel.getstringdata("Sheet1", 0, 1), "Password"); 
		
		//Thread.sleep(3000);
		Library.custom_click(login.gettxt_btn(),"Login");
		
	}
	
	@Test
	public void verify_TC_02_verifyloginpage() throws InterruptedException  {
		
		
	    logi_page_pom  login=PageFactory.initElements(driver, logi_page_pom.class); 
	    
		Library.custom_senkeys(login.gettxt_email(),excel.getstringdata("Sheet1", 1, 0), "EmailID");
		
		//Thread.sleep(3000);
		
		Library.custom_senkeys(login.gettxt_pass(),excel.getstringdata("Sheet1", 1, 1), "Password"); 
		
		//Thread.sleep(3000);
		Library.custom_click(login.gettxt_btn(),"Login");
		
	}
	

}

package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class config_data_provider {
	// we can consturctor and copy the config.properties path and paste here
	
	Properties pro;
	public config_data_provider() throws Exception {
		
		String file="C:\\Users\\Santosh\\eclipse-workspace\\Frame_work\\config\\config.properties";
		FileInputStream fis =new FileInputStream(file);
	    pro=new Properties ();
	    pro.load(fis);
	    
	}
	
	public String getQAENVIRONMENT_1() {
		
		return pro.getProperty("QAENVIRONMENT_1");
	}
	
     public String getQAENVIRONMENT_2() {
		
		return pro.getProperty("QAENVIRONMENT_1");
	}
     
	

}

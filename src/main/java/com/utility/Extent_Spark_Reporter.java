package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent_Spark_Reporter {

	public static  ExtentReports extent;
	
	public static ExtentReports getReports() {
		
		String reportpath="C:\\Users\\Santosh\\eclipse-workspace\\Frame_work\\Report\\index.html";
		ExtentSparkReporter report=new ExtentSparkReporter(reportpath);
		report.config().setDocumentTitle(" maven FameWork");
		report.config().setReportName("Automation test reports");
		report.config().setTheme(Theme.DARK);
		report.config().thumbnailForBase64();
		
        extent=new ExtentReports();
        extent.attachReporter(report);
        extent.setSystemInfo("project name", "famework");
        extent.setSystemInfo("QA", "Santosh");
        return extent;
        
	}
}

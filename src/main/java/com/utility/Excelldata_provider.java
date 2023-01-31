package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelldata_provider {
	
	 public XSSFWorkbook wb;
	public Excelldata_provider() throws Exception {
		String path="C:\\Users\\Santosh\\eclipse-workspace\\Frame_work\\test_data\\testdata.xlsx";
		FileInputStream file=new FileInputStream(path);
	    wb=new XSSFWorkbook (file);
		
	}
	
	public  String getstringdata(String Sheetname,int row,int cell) {
		return wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	

}

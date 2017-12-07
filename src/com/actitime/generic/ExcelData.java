package com.actitime.generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{
	//To get the data
	public static String getData(String filePath, String sheetName, int rn, int cn)
	{
		try 
		{
			FileInputStream fis = new FileInputStream(new File(filePath));
			Workbook wb = WorkbookFactory.create(fis);
			String data = wb.getSheet(sheetName).getRow(rn).getCell(cn).toString();
			return data;
		} 
		catch(Exception e)
		{
			return "";
		}
	}
	
	//To get Row count
	public static int getRowCount(String filePath, String sheetName)
	{
		try
		{
			FileInputStream fis = new FileInputStream(new File(filePath));
			Workbook wb = WorkbookFactory.create(fis);
			int rn = wb.getSheet(sheetName).getLastRowNum();
			return rn;
		}
		catch(Exception e)
		{
			return 0;
		}

	}
	
	//To get cell count
	public static short getCellCount(String filePath, String sheetName, int rn)
	{
		try 
		{
			FileInputStream fis = new FileInputStream(new File(filePath));
			Workbook wb = WorkbookFactory.create(fis);
			short cn = wb.getSheet(sheetName).getRow(rn).getLastCellNum();
			return cn;
		}
		catch (Exception e) 
		{
			return 0;
		}
	}
}

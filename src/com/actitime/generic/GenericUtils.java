package com.actitime.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils
{
	public static void selectByIndex(WebElement element, int index)
	{
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public static void selectByValue(WebElement element, String value)
	{
		Select select = new Select(element);
		select.selectByValue(value);
	}
	public static void deselectByVisibleText(WebElement element, String text)
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public static void selectByVisibleText(WebElement element, String text)
	{
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}
	public static void deselectByIndex(WebElement element, int index)
	{
		Select select = new Select(element);
		select.deselectByIndex(index);
	}
	
	public static void deselectByValue(WebElement element, String value)
	{
		Select select = new Select(element);
		select.deselectByValue(value);
	}
	public static void deselectAll(WebElement element)
	{
		Select select = new Select(element);
		select.deselectAll();
	}
	
	
}

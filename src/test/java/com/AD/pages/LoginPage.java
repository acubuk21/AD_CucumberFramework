package com.AD.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.AD.testbase.BaseClass;

public class LoginPage extends BaseClass{
	
	public WebElement username=driver.findElement(By.id("txtUsername"));
	public WebElement password=driver.findElement(By.id("txtPassword"));
	public WebElement loginBtn=driver.findElement(By.id("btnLogin"));
	
	public WebElement  syntaxLogo=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
	
	// This is from branch b1, parctice for merging

    
}
package com.Wms.pageObjects;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="/html/body/app-root/app-login/div/div/div/div/div/div/div[2]/div/form/div/div/div[2]/div[1]/div[1]/input")
WebElement Txtusername;
	
	@FindBy(xpath="/html/body/app-root/app-login/div/div/div/div/div/div/div[2]/div/form/div/div/div[2]/div[2]/div/input")
WebElement txtpassword;

	@FindBy(xpath="/html/body/app-root/app-login/div/div/div/div/div/div/div[2]/div/form/div/div/div[4]/button")
	WebElement loginbtn;
	
	public void setusername(String uname)
	{
	
	Txtusername.sendKeys(uname);
	}
	
	public void setpassword(String paswd)
	{
	
	txtpassword.sendKeys(paswd);
	}
	public void clicksubmit()
	{
		loginbtn.click();
	}
	}
	
	
	



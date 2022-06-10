package com.Wms.Testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.Wms.pageObjects.LoginPage;

import junit.framework.Assert;

public class Tc_Loginpage_001 extends Baseclass{
	
	
	
@Test
	public void logintest()
	{
		
		driver.get(url);
		
		LoginPage lp= new LoginPage(driver);
		lp.setusername(username);
		lp.setpassword(password);
		lp.clicksubmit();
		
		if (driver.getTitle().equals("Warehouse Management - Datalabs India"))
		
		{
			Assert.assertTrue(true);
			
		}
		
		else
		{
			Assert.assertTrue(false);
		
	}
	}
		
	
	
}

package com.Wms.Testcases;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;

	public class Baseclass {
		
		public String url="https://test.fruisce.in/wms//#/login";
		public String username="akasamjanardhan9@gmail.com";
		public String password="dli@1234";
		public static WebDriver driver;
		
		@BeforeClass
		public void setup()
		{
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe" );
		driver=new ChromeDriver();
		}
		
		@AfterClass
		
		public void teardown()
		{
		
		driver.quit();
	}

}

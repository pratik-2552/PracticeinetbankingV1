package com.inetbanking.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass{

	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp =new LoginPage(driver);
		lp.setUserName(username);
		logger.info("username is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		logger.info("providing customers details...");
		addcust.custName("Messi");
		addcust.custgender("male");
		addcust.custdob("05", "02", "1999");
		Thread.sleep(3000);
		addcust.custaddress("De La Creu");
		addcust.custcity("Barcelona");
		addcust.custstate("Spain");
		addcust.custpinno("101010");
		addcust.custtelephoneno("789456123");
	
		String email= randomString()+"@gmail.com";
		addcust.custemailid(email);
		
		addcust.custsubmit();
		Thread.sleep(3000);
		
		logger.info("Validation started...");
		
		boolean res=driver.getPageSource().contains("Connection failed: Access denied for user 'root'@'localhost' (using password: NO)");
		if (res==true) 
		{
			Assert.assertTrue(true);
			logger.info("test case passed");
		}
		else
		{
			logger.info("test cased failed");
		  captureScreen	(driver, "addNewCustomer");
		  Assert.assertTrue(false);
		}		
		
	}
	
	public String randomString() {
		String generatedstring =RandomStringUtils.randomAlphabetic(7);
		return generatedstring;
	}
	

	public String randomNum() {
		String generatedstring2 =RandomStringUtils.randomNumeric(7);
		return generatedstring2;
	}
	
	
	
}

package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this) ;
	}
	
	@FindBy(how =How.XPATH, using="//html//body//div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	@FindBy(how =How.XPATH, using="//input[@onkeyup='validatecustomername();']")
	@CacheLookup
	WebElement txtCustomername;
	
	@FindBy(how =How.XPATH, using="//input[@type='radio']")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(how =How.XPATH, using="//input[@name='dob']")
	@CacheLookup
	WebElement txtdob;
	
	@FindBy(how =How.XPATH, using="//textarea[@name='addr']")
	@CacheLookup
	WebElement txtaddress;
	
	@FindBy(how =How.XPATH, using="//input[@name='city']")
	@CacheLookup
	WebElement txtcity;
	
	@FindBy(how =How.XPATH, using="//input[@name='state']")
	@CacheLookup
	WebElement txtstate;
	
	@FindBy(how =How.XPATH, using="//input[@name='pinno']")
	@CacheLookup
	WebElement txtpinno;
	
	@FindBy(how =How.XPATH, using="//input[@name='telephoneno']")
	@CacheLookup
	WebElement txttelephone;
	
	@FindBy(how =How.XPATH, using="//input[@name='emailid']")
	@CacheLookup
	WebElement txtmailid;
	
	//@FindBy(how =How.XPATH, using="//input[@name='city']")
	//@CacheLookup
	//WebElement txtpassword;
	
	@FindBy(how =How.XPATH, using="//input[@value='Submit']")
	@CacheLookup
	WebElement btnsubmit;
	
	public void clickAddNewCustomer() {
		lnkAddNewCustomer.click();
	}
	
	public void custName(String cname) {
		txtCustomername.sendKeys(cname);

	}

	public void custgender(String cgender) {
		rdGender.click();
	}

	public void custdob(String mm,String dd,String yy) {
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);

	}

	public void custaddress(String caddress) {
		txtaddress.sendKeys(caddress);
	}

	public void custcity(String ccity) {
		txtcity.sendKeys(ccity);
	}

	public void custstate(String cstate) {
		txtstate.sendKeys(cstate);
	}

	public void custpinno(String cpinno) {
		txtpinno.sendKeys(String.valueOf(cpinno));
	}

	public void custtelephoneno(String ctelephoneno) {
		txttelephone.sendKeys(ctelephoneno);
	}

	public void custemailid(String cemailid) {
		txtmailid.sendKeys(cemailid);
	}


	public void custsubmit() {
		btnsubmit.click();
	}



}
	
	
	
	
	


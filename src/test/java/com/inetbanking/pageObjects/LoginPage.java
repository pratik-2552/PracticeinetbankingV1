package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath = "//input[@name='uid']")
	WebElement txtUsername; 
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement txtPassword; 
	
	@FindBy(name ="btnLogin")
	WebElement btnLogin; 
	
	@FindBy(linkText="Log out")
	WebElement linkLogout; 
	
	
	public void setUserName(String uname) {
		txtUsername.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit() {
		btnLogin.click();
	}
	
	public void clickLogout() {
		 linkLogout.click();
	}
	
	
	
	
	
	

}

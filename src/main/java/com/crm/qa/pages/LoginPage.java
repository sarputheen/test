package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath="/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")
	WebElement preloginBtn;
	
	//Initializing the Page Objects:
	public LoginPage() throws InterruptedException{
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions:
	public String validateLoginPageTitle() throws InterruptedException{
		return driver.getTitle();
		
	}
	
	@FindBy(xpath="//*[@src='/images/cogtiny1.jpg']")
	WebElement crmLogo;
	
	
	public boolean validateCRMImage() throws InterruptedException{
		
						
		return this.crmLogo.isDisplayed();
		
	}
	//Page Factory - OR:
		@FindBy(name="email")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;
		
		
		
		@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[3]")
		WebElement loginBtn;
		
		
		@FindBy(xpath="/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/li[1]/a")
		WebElement signUpBtn;
		
		
		
	public HomePage login(String un, String pwd) throws InterruptedException{
		
		
		preloginBtn.click();
		Thread.sleep(3000);
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", loginBtn);
		    	
		return new HomePage();
	}
	
}

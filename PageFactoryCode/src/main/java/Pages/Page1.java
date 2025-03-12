package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.openqa.selenium.By;

import Browser.browser;
import Locators.Page1Object;

public class Page1 extends browser{
	static Page1Object obj;
	public static String title() throws Exception {
		Thread.sleep(2000);
		return driver.getTitle();
	}
	public static void userNameEnter(String data) throws Exception{
		obj=PageFactory.initElements(driver, Page1Object.class);
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(obj.userName));
			obj.userName.sendKeys(data);
		}
		catch(Exception e)
		{
			System.out.println("Page1 - While entering Username");
		}
	}
	
	public static void userPasswordEnter(String data) throws Exception{
		
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(obj.password));
			obj.password.sendKeys(data);
		}
		catch(Exception e)
		{
			System.out.println("Page1- While entering Password");
		}
	}
	public static void clickLogin() throws Exception{
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(obj.login));
			obj.login.click();
		}
		catch(Exception e)
		{
			System.out.println("Page1- While clicking Login Button");
		}
	}

}
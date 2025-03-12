package Locators;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Browser.browser;

public class Page1Object extends browser{
	@FindBy(name="username")
	public WebElement userName;
	@FindBy(name="password")
	public WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	public WebElement login;
	
}
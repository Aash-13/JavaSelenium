package Locators;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import Browser.browser;

public class Page2Object extends browser{
	@FindBy(xpath="//header/div[1]/div[3]/ul/li/span/p")
	public WebElement UserAccount;
	@FindAll(@FindBy(xpath="//ul[@class='oxd-main-menu']/li"))
	@CacheLookup
	public List<WebElement> list;
	
}
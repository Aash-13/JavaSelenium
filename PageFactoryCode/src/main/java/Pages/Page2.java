package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browser.browser;
import Locators.Page2Object;

public class Page2 extends browser{
	public static Page2Object obj1;
	public static void clickOnMenu() {
		obj1=PageFactory.initElements(driver, Page2Object.class);
		try
		{
			wait = new WebDriverWait(driver, Duration .ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='oxd-main-menu']/li[3]/a")));
		for(int i=0;i<obj1.list.size();i++) {
			if(obj1.list.get(i).getText().contains("Leave"))
			{
				obj1.list.get(i).click();
				break;
			}
		}
		}
		catch(Exception e)
		{
			System.out.println("page2- -While clicking on menu");
		}
	}
	public static String UserCheck() throws Exception {
		obj1=PageFactory.initElements(driver, Page2Object.class);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/div[1]/div[3]/ul/li/span/p")));
		return obj1.UserAccount.getText();
	}
}
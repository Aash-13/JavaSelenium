package Browser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class browser {
	public static WebDriver driver;                   //declared object globally
	public static WebDriverWait wait;
	public static Actions act;
	/*
	 * Open the browser based on the choice
	 */

	public static void openBrowser() throws Exception {
		try {
			String choice = utility.properties("browser"); 
			if (choice.equalsIgnoreCase("Chrome"))
				driver = new ChromeDriver();
			else if (choice.equalsIgnoreCase("Edge"))
				driver = new EdgeDriver();
			else if (choice.equalsIgnoreCase("Firefox"))
				driver = new FirefoxDriver();
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("Browser - openBrowser");
		}
	}
	/*
	 * Pauses the URL of the application
	 */
	public static void navigateToUrl(String str) throws Exception {
		try {
			driver.get(str); 
		//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\");
			driver.manage().window().maximize();
			wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.titleIs("OrangeHRM"));
		} catch (Exception e) {
			System.out.println("Browser - geturl");
		}
	}
	/*
	 * Closes the Browser
	 */
	public static void closeBrowser() throws Exception {
		try {
			Thread.sleep(2000);
			driver.quit();
		} catch (Exception e) {
			System.out.println("Browser - closeBrowser");

		}

	}
}

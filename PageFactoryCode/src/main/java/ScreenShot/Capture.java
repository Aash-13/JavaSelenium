package ScreenShot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Browser.browser;

public class Capture extends browser{
	public static void screenShot(String name) throws Exception { 
		Thread.sleep(2000);
		try {

		//	TakesScreenshot driver = null;
			TakesScreenshot shot = ((TakesScreenshot) driver);

			File source = shot.getScreenshotAs(OutputType.FILE);

			String path = System.getProperty("user.dir") + "\\target\\ScreenShot\\" + name + ".png";

			File destination = new File(path);

			FileUtils.copyFile(source,destination);

		} catch (Exception e) {

			System.out.println("Screenshot");

		}

	}

}

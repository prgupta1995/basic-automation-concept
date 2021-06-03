package gobolt.com.web;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookiesTakeScrreenshot {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users//priyankagupta//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
//		driver.manage().deleteCookie(testcookie);
//		driver.manage().addCookie(cookie);
		
		driver.get("https://www.google.com/");
		//Take screenshot
		//casting driver to take screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users//priyankagupta//Desktop"));
		
		driver.quit();
		
	}

}

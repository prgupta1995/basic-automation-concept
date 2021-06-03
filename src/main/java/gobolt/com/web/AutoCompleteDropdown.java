package gobolt.com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteDropdown {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users//priyankagupta//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/");
		
		driver.findElement(By.className("close")).click();
		driver.findElement(By.className("close")).sendKeys(Keys.DOWN);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String sElement = "return document.getElementById("").value;"
//		String text = (String) js.executeScript(sElement);
//		System.out.println(text);
		driver.quit();
				
	}

}

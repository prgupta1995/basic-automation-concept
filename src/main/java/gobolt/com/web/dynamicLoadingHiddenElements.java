package gobolt.com.web;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class dynamicLoadingHiddenElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "//Users//priyankagupta//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.cssSelector("a[href='/dynamic_loading']")).click();
		driver.findElement(By.cssSelector("a[href='/dynamic_loading/1']")).click();
		driver.findElement(By.cssSelector("div#start")).click();

		// Fluent Wait
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
//				.pollingEvery(5, TimeUnit.SECONDS)
//				.ignoring(NoSuchElementException.class);
//		
//		WebElement foo = wait.until(new Function<WebDriver, WebElement>(){
//		
//		public WebElement apply(WebDriver driver) {
//			if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
//			{
//				return driver.findElement(By.cssSelector("[id='finish'] h4"));
//			}
//			else {
//				return null;
//			}
//				
//		
//		}
//	});
//		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
	}
//
}

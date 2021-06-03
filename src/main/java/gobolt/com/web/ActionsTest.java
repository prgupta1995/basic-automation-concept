package gobolt.com.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.opera.core.systems.scope.protos.ExecProtos.ActionList.Action;

public class ActionsTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//priyankagupta//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		action.moveToElement(driver.findElement(By.cssSelector("[data-nav-role='signin']"))).build().perform();
//		System.out.println("Hovered on Sign in successfully");
//		highlightElement(driver, driver.findElement(By.cssSelector("[data-nav-role='signin']")));

		WebElement move = driver.findElement(By.id("twotabsearchtextbox"));
		//hello in capital letters hello to HELLO
		action.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		//select enetered text hello by using double click
		action.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		action.moveToElement(move).contextClick().build().perform();
		
		action.moveToElement(move).moveByOffset(500, 500).click().build().perform();
//		driver.quit();
	}
	
	public static void highlightElement(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow, border: 2px solid green;');", element);
	}

}

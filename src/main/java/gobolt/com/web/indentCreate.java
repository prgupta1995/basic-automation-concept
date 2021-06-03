package gobolt.com.web;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class indentCreate {

	String baseURL= "http://ops-stg.gobolt.team/";
	String userName="GB0000";
	String Password="prod@GB789#$";
	WebDriver driver;
	
	@BeforeTest(alwaysRun=true)
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "//Users//priyankagupta//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("baseURL");
		driver.manage().window().maximize();

	}
	
	
	@Test(priority=0)
	public void login()
	{
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(userName);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(Password);
		
		WebElement privacyAccept = driver.findElement(By.cssSelector(".checkIn"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(privacyAccept));
		highlightElement(driver, privacyAccept);
		privacyAccept.click();
		
		WebElement submitBtn = driver.findElement(By.cssSelector("[type='submit']"));
		highlightElement(driver, submitBtn);
		submitBtn.click();

	}
	
	@Test(priority=1)
	public void indentCreation()
	{
		WebElement account = driver.findElement(By.cssSelector("[href*='/account/']"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.cssSelector(".ui-select-toggle"))));
		account.click();
		
		
		
	}
	@AfterTest(alwaysRun = true)
	public void afterTest()
	{
		driver.quit();
	}
	
public void highlightElement(WebDriver driver, WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	}

}

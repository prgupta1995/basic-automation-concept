package gobolt.com.web;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//priyankagupta//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Size of all the link present on the web page
		System.out.println(driver.findElements(By.tagName("a")).size());

		// Count of links available only in the footer section
		WebElement footerId = driver.findElement(By.id("gf-BIG")); // Limiting WebDriver scope
		System.out.println(footerId.findElements(By.tagName("a")).size());

		// Count of links available only in the first section of the footer
		WebElement FooterSingleSection = footerId.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(FooterSingleSection.findElements(By.tagName("a")).size());
		
		for(int i =1; i<FooterSingleSection.findElements(By.tagName("a")).size(); i++)
		{
			//Click on any link which opens in a new tab.
			String clickLinkInNewtab = Keys.chord(Keys.COMMAND, Keys.ENTER);
			FooterSingleSection.findElements(By.tagName("a")).get(i).sendKeys(clickLinkInNewtab);
			Thread.sleep(2000);
		}
			Set<String> wHandles = driver.getWindowHandles();
			Iterator<String> it = wHandles.iterator();
 		
		
		while(it.hasNext()) //It will start will 1st window, will check 1st window is available then check next window
		{
			Thread.sleep(5000);
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		driver.quit();
	}
}

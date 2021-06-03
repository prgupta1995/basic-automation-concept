package gobolt.com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//priyankagupta//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
	
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		WebElement adultDropdownTab = driver.findElement(By.cssSelector("[id='divpaxinfo']"));
//		adultDropdownTab.click();
//		
////		WebElement adultDropdown = driver.findElement(By.cssSelector(selector))
//		
//		Select sAdult = new Select(driver.findElement(By.cssSelector("[name='ctl00$mainContent$ddl_Adult']")));
//		sAdult.selectByValue("2");
////		sAdult.selectByIndex(6);
////		sAdult.selectByVisibleText("5");
//		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction")).click();
		driver.findElement(By.xpath("(//a[@value='DED'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		Thread.sleep(1000);
//		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());// checking the disabled
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("it's enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
//		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
//		WebElement optionCheckbox = driver.findElement(By.cssSelector("[name='checkBoxOption1']"));
//		optionCheckbox.click();
//		System.out.println(optionCheckbox.isSelected());
//		Thread.sleep(2000);
//		optionCheckbox.click();
//		System.out.println(optionCheckbox.isSelected());
//		List<WebElement> checkboxCount = driver.findElements(By.cssSelector("[type='checkbox']"));
//		System.out.println(checkboxCount.size());
		driver.quit();
		
	}

}

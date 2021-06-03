package gobolt.com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class clearTrip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//priyankagupta//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		WebElement drpAdults = driver.findElement(By.id("Adults"));
		Select drpAdult = new Select(drpAdults);
		drpAdult.selectByValue("5");

		WebElement drpChildern = driver.findElement(By.id("Childrens"));
		Select drpChild = new Select(drpChildern);
		drpChild.selectByIndex(2);

		driver.findElement(By.cssSelector(".blue.rArrow")).click();
		driver.findElement(By.name("airline")).sendKeys("Indigo");

		WebElement calendar = driver.findElement(By.cssSelector(".icon.ir.datePicker"));
		calendar.click();
		driver.findElement(By.cssSelector(".ui-state-active")).click();
		driver.findElement(By.id("SearchBtn")).click();

		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

		driver.quit();

	}

}

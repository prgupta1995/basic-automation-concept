package gobolt.com.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarUIAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//priyankagupta//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");

		WebElement dateField = driver.findElement(By.xpath("//input[@id='travel_date']"));
		dateField.click();

		WebElement month = driver.findElement(By.cssSelector("th.datepicker-switch"));
		while (!month.getText().contains("June")) {
			driver.findElement(By.cssSelector(".next")).click();
			System.out.println(month.getText());
		}
		System.out.println(month.getText());
		List<WebElement> dates = driver.findElements(By.className("day"));

		// Grab the common attribute, put it into a list and iterate
		int count = dates.size();

		for (int i = 0; i <= count; i++) {
			String textDate = dates.get(i).getText();
			System.out.println(textDate);
			if (textDate.equalsIgnoreCase("9")) {
				dates.get(i).click();
				System.out.println("Date " + textDate + " is selected successfully");
				break;
			}
		}
		driver.quit();
	}

}

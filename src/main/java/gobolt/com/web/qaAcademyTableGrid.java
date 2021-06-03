package gobolt.com.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qaAcademyTableGrid {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users//priyankagupta//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.xpath("//table[@class='table-display']"));
		int tableRowCount = table.findElements(By.xpath("//tr")).size();
		System.out.println("Row count of a table is- " + tableRowCount);
		
		for(int i = 1; i<=tableRowCount-2; i++) {
			String tableRowText = table.findElements(By.xpath("//tr")).get(i).getText();
			System.out.println("Row is- " + tableRowText);
		}
		
		int tableColumnCount =  table.findElements(By.xpath("//tr//th")).size();
		System.out.println("Number of Columns- " +tableColumnCount);
		
		String tableSecondRow = table.findElement(By.xpath("//tr[3]")).getText();
		System.out.println("Second Row of the table is- " +tableSecondRow);
		
		driver.quit();
	}
}

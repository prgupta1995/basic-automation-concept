package gobolt.com.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoDropdownCompleteAssignment {

	public static void main(String[] args) {

		// Enter the letters ban Verify if Lebanon option is displayed in the
		// suggestive box
		System.setProperty("webdriver.chrome.driver", "/Users//priyankagupta//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement autoCompleteDropdown = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		autoCompleteDropdown.sendKeys("ban");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='autocomplete']")));

		autoCompleteDropdown.sendKeys(Keys.ARROW_DOWN);
//		autoCompleteDropdown.sendKeys(Keys.ARROW_DOWN);
//		System.out.println(autoCompleteDropdown.getText()); 

		// Javascript DOM can extract hidden elements because selenium cannot identify
		// hidden elements - (Ajax implementation)
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String hiddenSelectedText = "return document.getElementById('autocomplete').value;";
		String text = (String) js.executeScript(hiddenSelectedText);
		
		while(!text.equalsIgnoreCase("Lebanon"))
		{
			autoCompleteDropdown.sendKeys(Keys.ARROW_DOWN);
			text = (String) js.executeScript(hiddenSelectedText);
			System.out.println(text);
		}

		System.out.println("Test case is paased location text matched with the condition-" + text);
		driver.quit();
	}

}

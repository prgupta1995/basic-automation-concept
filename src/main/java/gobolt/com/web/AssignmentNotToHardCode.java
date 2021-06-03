package gobolt.com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentNotToHardCode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//priyankagupta//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement optionSelection = driver.findElement(By.id("checkBoxOption2"));
		optionSelection.click();

		WebElement optionSelectedText = driver
				.findElement(By.xpath("//div[@id ='checkbox-example']/fieldset/label[2]"));

		String textOption = optionSelectedText.getText();
		Select dropdownSelection = new Select(driver.findElement(By.id("dropdown-class-example")));

		dropdownSelection.selectByVisibleText(textOption);

		WebElement alertExample = driver.findElement(By.cssSelector(".inputs[placeholder='Enter Your Name']"));
		alertExample.sendKeys(textOption);
		WebElement alertBtn = driver.findElement(By.id("alertbtn"));
		alertBtn.click();

		String textOptionCheckInAlert = driver.switchTo().alert().getText();

		if (textOptionCheckInAlert.contains(textOption)) {
			System.out.println(textOption + " is available in the alert message");
		}

		else {
			System.out.println(textOption + " is not available in the alert message");
		}
		driver.quit();
	}

}

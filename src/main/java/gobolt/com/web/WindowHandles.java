package gobolt.com.web;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//priyankagupta//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		WebElement parentClickhereElement = driver.findElement(By.cssSelector("a[href='/windows/new']"));
		parentClickhereElement.click();

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();

		String parentWindow = it.next();
		String childWindow = it.next();

		driver.switchTo().window(childWindow);
		WebElement childWindowText = driver.findElement(By.cssSelector("div.example"));
		System.out.println(childWindowText.getText());

		driver.switchTo().window(parentWindow);
		WebElement parentWindowText = driver.findElement(By.cssSelector(".example h3"));
		System.out.println(parentWindowText.getText());

		driver.quit();

	}

}

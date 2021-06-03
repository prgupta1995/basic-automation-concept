package gobolt.com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//priyankagupta//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
//		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='/frame_middle']")));
		
		//Frame switch using names
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		
		WebElement textMiddle = driver.findElement(By.id("content"));
		System.out.println(textMiddle.getText());
		
		driver.quit();
	}

}

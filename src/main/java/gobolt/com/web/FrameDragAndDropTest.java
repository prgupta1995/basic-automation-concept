package gobolt.com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameDragAndDropTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//Users//priyankagupta//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		//To switch on frames, f user has frame id enter frame(id)
	    
		//Count of iframes
		System.out.println(driver.findElements(By.tagName("iframe")).size());

		//Only 1 frame that will be on 0th index, switched to the frame using index
		driver.switchTo().frame(0);
		
		
        // switched to the frame using element
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
//		WebElement drag = driver.findElement(By.id("draggable"));
//		drag.click();
//		
//		WebElement drop = driver.findElement(By.id("droppable"));
//		drop.click();
		
		Actions action = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("draggable"));

		WebElement destination = driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(source, destination).build().perform();
		
		System.out.println("Dragged and dropped successfully.");
		
		//Count of total frames, frame starts with iframe tag
		
		//Will switch to normal window then can click on any other element, it will be out of iframe
		driver.switchTo().defaultContent();
		
		driver.quit();
		
		
	}

}

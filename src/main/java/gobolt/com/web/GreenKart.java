package gobolt.com.web;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenKart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//priyankagupta//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();

		// Implicit Wait
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		// Array of products needs to be added into the cart
		String[] productName = { "Cucumber", "Brocolli", "Carrot", "Tomato", "Brinjal" };

		addItems(driver, productName);
		// or
//		GreenKart obj = new GreenKart(); // when don't want to create the method addItems as static
//		obj.addItems(driver, productName);
		WebElement cartIcon = driver.findElement(By.xpath("//img[@alt='Cart']"));
		cartIcon.click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		Thread.sleep(2000);
		//highlight Element
		highlightElement(driver, driver.findElement(By.cssSelector(".promoCode")));
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".promoCode"))));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");

		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		highlightElement(driver, driver.findElement(By.cssSelector("span.promoInfo")));
		
		// Explicit wait
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("span.promoInfo"))));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	public static void addItems(WebDriver driver, String[] productName) throws InterruptedException {
		int j = 0;
		// List of elements available on one page
//		List<WebElement> productList = driver.findElements(By.xpath("//h4[@class='product-name']"));

		List<WebElement> productList = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < productList.size(); i++) {
			String productNeedtoAdd = productList.get(i).getText().split("-")[0].trim(); // productNeedtoAdd[0]
																							// productNeedtoAdd[1]

			// Create Array to array list
			List<String> productNameList = Arrays.asList(productName);
			if (productNameList.contains(productNeedtoAdd)) {
				Thread.sleep(2000);
				driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
				System.out.println("Product is added into cart--" + productNeedtoAdd);
				j++;
				if (j == productName.length)
					break;

			}

		}

	}
//	driver.quit();
	public static void highlightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 2px solid red;')", element);
	}
}


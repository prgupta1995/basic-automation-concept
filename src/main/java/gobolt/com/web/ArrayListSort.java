package gobolt.com.web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayListSort {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users//priyankagupta//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		List<WebElement> vegFruitList = driver.findElements(By.cssSelector("tr td:nth-child(2)"));

		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();

		ArrayList<String> storeVedFruitInArrayList = new ArrayList<String>();

		for (int i = 0; i <= vegFruitList.size() - 1; i++) {
			storeVedFruitInArrayList.add(vegFruitList.get(i).getText());
//			System.out.println(storeVedFruitInArrayList);

		}
		System.out.println(storeVedFruitInArrayList);

		ArrayList<String> copyStoreVedFruitInArrayList = new ArrayList<String>();

		for (int i = 0; i <= storeVedFruitInArrayList.size() - 1; i++) {
			copyStoreVedFruitInArrayList.add(storeVedFruitInArrayList.get(i));

		}
		
//		System.out.println(copyStoreVedFruitInArrayList);
		
		Collections.sort(copyStoreVedFruitInArrayList);
		Collections.reverse(copyStoreVedFruitInArrayList);
		

//		for (String s1 : storeVedFruitInArrayList) {
//			System.out.println(s1 + "- original");
//		}
//		for (String s2 : copyStoreVedFruitInArrayList) {
//			System.out.println(s2 + "- copied");
//		}
		System.out.println(copyStoreVedFruitInArrayList);

		Assert.assertTrue(storeVedFruitInArrayList.equals(copyStoreVedFruitInArrayList));

		driver.quit();
	}

}

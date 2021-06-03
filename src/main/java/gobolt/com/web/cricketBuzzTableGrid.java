package gobolt.com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricketBuzzTableGrid {

	public static void main(String[] args) {

		int sum =0;
		System.setProperty("webdriver.chrome.driver", "/Users//priyankagupta//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/22780/nz-vs-ind-3rd-odi-india-tour-of-new-zealand-2020");

		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
//Child of parent
		int tableRowsCount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int countRuns = table
				.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();

		for (int i = 0; i <= countRuns - 3; i++) {
			String runs = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();
			int runValue = Integer.parseInt(runs);
			sum = sum+runValue;

		}
//		System.out.println(sum);
// Sibiling of child
		String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extrasValue = Integer.parseInt(Extras);
		int TotalSumValue = sum + extrasValue;
		System.out.println(TotalSumValue);
		
		String totalValue = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int totalActualRuns = Integer.parseInt(totalValue);
		if(TotalSumValue==totalActualRuns)
		{
			System.out.println("Run matches " + "TotalSum" + "=" +TotalSumValue + ", Total Run" + "=" +totalActualRuns);
		}
		else
		{
			System.out.println("Run not machtes");
		}

		driver.quit();
	}

}

//package gobolt.com.web;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//public class SSLCertificationCode {
//
//	public static void main(String[] args) {
//
//		// Used for general profile
//		//new DesiredCapabilities();
//		DesiredCapabilities ch = DesiredCapabilities.chrome();
//		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true); // Accept SSL certs
////		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//
//		// Belows to your local browser
//		ChromeOptions c = new ChromeOptions();
//		c.merge(ch);
//		
//		System.setProperty("webdriver.chrome.driver", "/Users//priyankagupta//Downloads//chromedriver");
//		WebDriver driver = new ChromeDriver(c);
//	}
//
//}

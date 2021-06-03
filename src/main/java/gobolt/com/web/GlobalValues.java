package gobolt.com.web;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValues {
	
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		
		//Read File
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("Url"));
		System.out.println(prop.getProperty("browser"));
		prop.setProperty("browser", "Firefox");
		System.out.println(prop.getProperty("browser"));
		
		//Write file
		
		FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"//data.properties");
		
		//Store method is use to store information
		//change the browser from chrome to firefox
		prop.store(fos, null);
		
		
		
	}

}

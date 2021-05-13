package testeAccenture.core;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	static WebDriver driver;
	
	public Driver() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://sampleapp.tricentis.com/101/app.php");		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void acessarURL(WebDriver driver, String url) {
		driver.get(url);
	}
	
	public static void close(WebDriver driver) {
		driver.close();
		driver.quit();
	}
	
	

}

package seguroVeicular.runners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import seguroVeicular.core.Driver;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/seguro_veicular.feature",
		glue = "br.com.celinamax.steps",
		tags = {"@seguro"},
		plugin = {"pretty", "html:target/report-html", "json:target/report-json"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false
		)
public class RunnerTest {
	static WebDriver driver;
	
	@BeforeClass
	public static void iniciarTests() {		
		new Driver();
		driver = Driver.getDriver();
	}
	
	@AfterClass
	public static void close() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
	@After
	public void screenshot(Scenario scenario) throws InterruptedException {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target\\screenshots\\" +scenario.getId()+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Thread.sleep(5000);
		driver.quit();
	}
	
}



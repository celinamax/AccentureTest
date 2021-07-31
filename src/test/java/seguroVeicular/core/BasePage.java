package seguroVeicular.core;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import seguroVeicular.enums.ByValue;

public class BasePage {
	private WebDriver driver;
	private ByValue byValue;
	private String value;

	public BasePage(WebDriver driver, ByValue byValue, String value) {
		this.driver = driver;
		this.byValue = byValue;
		this.value = value;
	}

	public WebElement elementoClicavel(WebDriver driver) {
		try {
			Thread.sleep(10);
			WebDriverWait wait = new WebDriverWait(driver, 10);
			switch (byValue) {
			case XPATH:
				return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(value)));
			case ID:
				return wait.until(ExpectedConditions.presenceOfElementLocated(By.id(value)));

			case CLASS_NAME:
				return wait.until(ExpectedConditions.presenceOfElementLocated(By.className(value)));

			case CSS:
				return wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(value)));
			default:
				return null;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void click(WebDriver driver) {
		elementoClicavel(driver).click();
	}

	public void sendKeys(WebDriver driver, String string) {
		elementoClicavel(driver).sendKeys(string);
	}

	public void select(WebDriver driver, String visibleText) {
		Select select = new Select(elementoClicavel(driver));
		select.selectByVisibleText(visibleText);
	}

		
	public String getText(WebDriver driver) {
		WebElement text = elementoClicavel(driver);		
		return text.getText();
	}

	
	public void scroll(WebDriver driver) throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementoClicavel(driver));
	}
	
	public String getTitle(WebDriver driver) {
		return driver.getTitle();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public void scrollParaCima(WebDriver driver) throws InterruptedException {
//		WebElement element = elementoClicavel(driver);
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element);
//		actions.perform();
//
//	}


}

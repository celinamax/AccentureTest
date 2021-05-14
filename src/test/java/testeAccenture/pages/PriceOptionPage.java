package testeAccenture.pages;

import org.openqa.selenium.WebDriver;

import testeAccenture.core.BasePage;
import testeAccenture.enums.ByValue;

public class PriceOptionPage {
	private WebDriver driver;
	BasePage basePage;
	
	public PriceOptionPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public BasePage price = new BasePage(driver, ByValue.XPATH, "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]");
	public BasePage buttonNext = new BasePage(driver, ByValue.XPATH, "//button[@id='nextsendquote']");
	
	public void selecionarOpcaoDePreco(WebDriver driver) throws InterruptedException {
		price.click(driver);
		buttonNext.scroll(driver);
		buttonNext.click(driver);
	}
	
}

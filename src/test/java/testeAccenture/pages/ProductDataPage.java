package testeAccenture.pages;

import org.openqa.selenium.WebDriver;

import testeAccenture.core.BasePage;
import testeAccenture.enums.ByValue;

public class ProductDataPage {
	private WebDriver driver;

	public ProductDataPage(WebDriver driver) {
		this.driver = driver;
	}

	public BasePage startDate = new BasePage(driver, ByValue.XPATH, "//input[@id='startdate']");
	public BasePage insuranceSum = new BasePage(driver, ByValue.XPATH, "//*[@id='insurancesum']");
	public BasePage meritRating = new BasePage(driver, ByValue.XPATH, "//select[@id='meritrating']");
	public BasePage damageInsurance = new BasePage(driver, ByValue.XPATH, "//select[@id='damageinsurance']");
	public BasePage optionalProducts = new BasePage(driver, ByValue.XPATH, "//*[@id='insurance-form']/div/section[3]/div[5]/p/label[1]");
	public BasePage courtesyCar = new BasePage(driver, ByValue.XPATH, "//select[@id='courtesycar']");
	public BasePage buttonNext = new BasePage(driver, ByValue.XPATH, "//button[@id='nextselectpriceoption']");

	public void preencherDadosDoProduto(WebDriver driver) {
		startDate.sendKeys(driver, "08/06/2021");
		insuranceSum.select(driver, "3.000.000,00");
		meritRating.select(driver, "Super Bonus");
		damageInsurance.select(driver, "Full Coverage");
		optionalProducts.click(driver);
		courtesyCar.select(driver, "No");
		buttonNext.click(driver);
	}

}

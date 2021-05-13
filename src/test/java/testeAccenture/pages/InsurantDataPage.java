package testeAccenture.pages;

import org.openqa.selenium.WebDriver;

import testeAccenture.core.BasePage;
import testeAccenture.enums.ByValue;

public class InsurantDataPage {
	private WebDriver driver;
	
	public InsurantDataPage(WebDriver driver) {
		this.driver = driver;
	}
	

	public BasePage firstName = new BasePage(driver, ByValue.XPATH, "//input[@id='firstname']");
	public BasePage lastName = new BasePage(driver, ByValue.XPATH, "//input[@id='lastname']");
	public BasePage dateOfBirth = new BasePage(driver, ByValue.XPATH, "//input[@id='birthdate']");
	public BasePage gender = new BasePage(driver, ByValue.XPATH, "//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]");
	public BasePage streetAddress = new BasePage(driver, ByValue.XPATH, "//input[@id='streetaddress']");
	public BasePage country = new BasePage(driver, ByValue.XPATH, "//select[@id='country']");
	public BasePage zipCode = new BasePage(driver, ByValue.XPATH, "//input[@id='zipcode']");
	public BasePage city = new BasePage(driver, ByValue.XPATH, "//input[@id='city']");
	public BasePage occupation = new BasePage(driver, ByValue.XPATH, "//select[@id='occupation']");
	public BasePage hobbies = new BasePage(driver, ByValue.XPATH, "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]");
	public BasePage website = new BasePage(driver, ByValue.XPATH, "//input[@id='website']");
	public BasePage buttonNext = new BasePage(driver, ByValue.XPATH, "//button[@id='nextenterproductdata']");
	
	
	public void preencherDadosDoSeguro(WebDriver driver) throws InterruptedException {
		firstName.sendKeys(driver, "Celina");
		lastName.sendKeys(driver, "Maximiano");
		dateOfBirth.sendKeys(driver, "02/01/2000");
		gender.click(driver);
		streetAddress.sendKeys(driver, "Av José Júlio, 221, Jaguaribe");
		country.select(driver, "Brazil");
		zipCode.sendKeys(driver, "06050300");
		city.sendKeys(driver, "Osasco");
		occupation.select(driver, "Employee");
		hobbies.click(driver);
		website.sendKeys(driver, "www.celinamax.com.br");
		buttonNext.click(driver);
	}

}

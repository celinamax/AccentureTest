package testeAccenture.pages;

import org.openqa.selenium.WebDriver;

import testeAccenture.core.BasePage;
import testeAccenture.enums.ByValue;

public class SendQuotePage {
	private WebDriver driver;
	BasePage basePage;

	public SendQuotePage(WebDriver driver) {
		this.driver = driver;
	}

	public BasePage email = new BasePage(driver, ByValue.XPATH, "//input[@id='email']");
	public BasePage phone = new BasePage(driver, ByValue.XPATH, "//input[@id='phone']");
	public BasePage userName = new BasePage(driver, ByValue.XPATH, "//input[@id='username']");
	public BasePage password = new BasePage(driver, ByValue.XPATH, "//input[@id='password']");
	public BasePage confirmPassword = new BasePage(driver, ByValue.XPATH, "//input[@id='confirmpassword']");
	public BasePage comments = new BasePage(driver, ByValue.XPATH, "//textarea[@id='Comments']");
	public BasePage buttonNext = new BasePage(driver, ByValue.XPATH, "//button[@id='sendemail']");
	public BasePage buttonMsg = new BasePage(driver, ByValue.XPATH, "//button[@class='confirm']");
	public void enviarCotacao(WebDriver driver) throws InterruptedException {
		email.sendKeys(driver, "celinamax@gmail.com");
		phone.sendKeys(driver, "11996319691");
		userName.sendKeys(driver, "Celinamax");
		password.sendKeys(driver, "Max5105");
		confirmPassword.sendKeys(driver, "Max5105");
		comments.sendKeys(driver, "Include Travel Insurance");
		buttonNext.click(driver);
	}

	public String obterMsg() throws InterruptedException {
		buttonMsg.click(driver);
		return basePage.validarMensagemDeSucesso(driver);
	}

}

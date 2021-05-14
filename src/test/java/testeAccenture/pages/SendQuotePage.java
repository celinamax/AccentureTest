package testeAccenture.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import testeAccenture.core.BasePage;
import testeAccenture.enums.ByValue;

public class SendQuotePage {
	private WebDriver driver;
	BasePage basePage = new BasePage(driver, null, null);

	public SendQuotePage(WebDriver driver) {
		this.driver = driver;
	}

	public BasePage email = new BasePage(driver, ByValue.XPATH, "//input[@id='email']");
	public BasePage phone = new BasePage(driver, ByValue.XPATH, "//input[@id='phone']");
	public BasePage userName = new BasePage(driver, ByValue.XPATH, "//input[@id='username']");
	public BasePage password = new BasePage(driver, ByValue.XPATH, "//input[@id='password']");
	public BasePage confirmPassword = new BasePage(driver, ByValue.XPATH, "//input[@id='confirmpassword']");
	public BasePage comments = new BasePage(driver, ByValue.XPATH, "//textarea[@id='Comments']");
	public BasePage buttonSend = new BasePage(driver, ByValue.XPATH, "//button[@id='sendemail']");
	public BasePage messageSuccess = new BasePage(driver, ByValue.CSS,"body > div.sweet-alert.showSweetAlert.visible > h2");
	public BasePage buttonConfirm = new BasePage(driver, ByValue.XPATH, "//*[@class='sa-confirm-button-container']");

	public void  validaMsg(WebDriver driver) throws InterruptedException {
		String msg =  messageSuccess.getText(driver);	
		Assert.assertEquals("Sending e-mail success!", msg);
		buttonConfirm.click(driver);
	}

	public void enviarCotacao(WebDriver driver) throws InterruptedException {
		email.sendKeys(driver, "celinamax@gmail.com");
		phone.sendKeys(driver, "11996319691");
		userName.sendKeys(driver, "Celinamax");
		password.sendKeys(driver, "Max5105");
		confirmPassword.sendKeys(driver, "Max5105");
		comments.sendKeys(driver, "Include Travel Insurance");
		buttonSend.click(driver);				
	}
}

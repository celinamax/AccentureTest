package testeAccenture.steps;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import testeAccenture.core.Driver;
import testeAccenture.pages.InsurantDataPage;
import testeAccenture.pages.PriceOptionPage;
import testeAccenture.pages.ProductDataPage;
import testeAccenture.pages.SendQuotePage;
import testeAccenture.pages.VehiclePage;

public class TricentsVehicleSteps {
	static WebDriver driver;
	
	VehiclePage vehiclePage = new VehiclePage(driver);
	InsurantDataPage insuratDataPage = new InsurantDataPage(driver);
	ProductDataPage productDataPage = new ProductDataPage(driver);
	PriceOptionPage priceOptionPage = new PriceOptionPage(driver);
	SendQuotePage sendQuote = new SendQuotePage(driver);
	
	
	@Dado("^que o cliente acessa o site da seguradora$")
	public void queOClienteAcessaOSiteDaSeguradora() {
		new Driver();
		driver = Driver.getDriver();
	}

	@Dado("^preencha o formulário com os dados do veiculo$")
	public void preenchaOFormulárioComOsDadosDoVeiculo() throws Exception {
		vehiclePage.preencherFormulario(driver);
		Assert.assertEquals("Enter Insurant Data", driver.getTitle());
	}

	@Dado("^insira os dados do seguro$")
	public void insiraOsDadosDoSeguro() throws InterruptedException {
		insuratDataPage.preencherDadosDoSeguro(driver);
		Assert.assertEquals("Enter Product Data", driver.getTitle());
	}

	@Dado("^insira os dados do produto$")
	public void insiraOsDadosDoProduto() {
		productDataPage.preencherDadosDoProduto(driver);
		Assert.assertEquals("Select Price Option", driver.getTitle());
	}

	@Dado("^seleciona a opcao de preco$")
	public void selecionaAOpcaoDePreco() throws InterruptedException {
		priceOptionPage.selecionarOpcaoDePreco(driver);
		Assert.assertEquals("Send Quote", driver.getTitle());
	}

	@Quando("^enviar a cotacao$")
	public void enviarACotacao() throws InterruptedException {
		sendQuote.enviarCotacao(driver);
		Assert.assertEquals("Send Quote", driver.getTitle());
	}

	@Entao("^deve verificar a mensagem de sucesso$")
	public void deveVerificarAMensagemDeSucesso() throws InterruptedException {
		sendQuote.validaMsg(driver);
	}
	
	

	@After(order = 1)
	public void screenshot(Scenario scenario) {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target\\screenshots\\" +scenario.getId()+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@After(order = 0)
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}

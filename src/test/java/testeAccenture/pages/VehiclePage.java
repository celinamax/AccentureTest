package testeAccenture.pages;


import org.openqa.selenium.WebDriver;

import testeAccenture.core.BasePage;
import testeAccenture.enums.ByValue;

public class VehiclePage {
	private WebDriver driver;
	
	public VehiclePage(WebDriver driver) {
		this.driver = driver;
	}	

		
	public BasePage make = new BasePage(driver, ByValue.XPATH, "//select[@id='make']");
	public BasePage model = new BasePage(driver, ByValue.XPATH, "//select[@id='model']");
	public BasePage cylinderCapacity = new BasePage(driver, ByValue.XPATH, "//input[@id='cylindercapacity']");
	public BasePage enginePerformance = new BasePage(driver, ByValue.XPATH, "//input[@id='engineperformance']");
	public BasePage dateOfManufacture = new BasePage(driver, ByValue.XPATH, "//input[@id='dateofmanufacture']");
	public BasePage numberOfSeats = new BasePage(driver, ByValue.XPATH, "//select[@id='numberofseats']");
	public BasePage rightHandDrive = new BasePage(driver, ByValue.XPATH, "//*[@id='insurance-form']/div/section[1]/div[7]/p/label[2]");
	public BasePage numberOfSeats2 = new BasePage(driver, ByValue.XPATH, "//select[@id='numberofseatsmotorcycle']");
	public BasePage fuelType = new BasePage(driver, ByValue.XPATH, "//select[@id='fuel']");
	public BasePage payload = new BasePage(driver, ByValue.XPATH, "//input[@id='payload']");
	public BasePage totalWeight = new BasePage(driver, ByValue.XPATH, "//input[@id='totalweight']");
	public BasePage listPrice = new BasePage(driver, ByValue.XPATH, "//input[@id='listprice']");
	public BasePage licensePlateNumber = new BasePage(driver, ByValue.XPATH, "//input[@id='licenseplatenumber']");
	public BasePage annualMileage = new BasePage(driver, ByValue.XPATH, "//input[@id='annualmileage']");
	public BasePage nextButton = new BasePage(driver, ByValue.XPATH, "//button[@id='nextenterinsurantdata']");


	public void preencherFormulario(WebDriver driver) throws Exception {
		make.select(driver, "Toyota");
		model.select(driver, "Moped");
		cylinderCapacity.sendKeys(driver, "500");
		enginePerformance.sendKeys(driver, "220");
		dateOfManufacture.sendKeys(driver, "01/01/2000");
		numberOfSeats.select(driver, "8");
		rightHandDrive.click(driver);
		numberOfSeats2.select(driver, "2");
		fuelType.select(driver, "Diesel");
		payload.sendKeys(driver, "800");
		totalWeight.sendKeys(driver, "600");
		listPrice.sendKeys(driver, "98000.00");
		licensePlateNumber.sendKeys(driver, "MAX5105");
		annualMileage.sendKeys(driver, "120");
		nextButton.click(driver);
//		nextButton.scrollParaCima(driver);
	}

}

package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SizeFilteration_POM extends BasePOMPage {

	// Constructor
	public SizeFilteration_POM(WebDriver driver) {
		super(driver);
	}
	
	

	// WebElements
	@FindBy(xpath = "//span[normalize-space()='XL']")
	WebElement sizeXL;

	@FindBy(xpath = "//span[normalize-space()='M']")
	WebElement sizeM;

	@FindBy(xpath = "//span[normalize-space()='ML']")
	WebElement sizeML;

	@FindBy(xpath = "//span[@class='checkmark']")
	List<WebElement> allSizes;

	
	
	// Action methods
	public void selectOneSize() {
		sizeXL.click();
	}

	public void selectMultipleSizes() {
		WebElement[] arr = { sizeXL, sizeM, sizeML };
		for (WebElement size : arr) {
			size.click();
		}
	}

	public void selectAllSizes() {
		for (WebElement size : allSizes) {
			size.click();
		}
	}

}

package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage_POM extends BasePOMPage {

	public CartPage_POM(WebDriver driver) {
		super(driver);
	}

	
	
	// WebElements
	@FindBy(xpath = "//p[@class='sc-11uohgb-2 elbkhN']")
	WebElement productName;

	@FindBy(xpath = "//p[@class='sc-11uohgb-2 elbkhN']")
	List<WebElement> productNames;

	
	
	// Action Methods
	public String getProductName() {
		return productName.getText();
	}

	public void getProductNames() {
		for (WebElement product : productNames) {
			System.out.println(product.getText());

		}
	}
}

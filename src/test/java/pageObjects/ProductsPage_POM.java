package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage_POM extends BasePOMPage {

	// Constructor
	public ProductsPage_POM(WebDriver driver) {
		super(driver);
	}

	
	// WebElements
	@FindBy(xpath = "")
	List<WebElement> productNames;

	@FindBy(xpath = "")
	WebElement freeShipping;

	@FindBy(xpath = "")
	WebElement addToCart;

	@FindBy(xpath = "")
	List<WebElement> addMultipleProducsToCart;

	
	
	// Action Methods
	public String getProductName() {
		for (WebElement product : productNames) {
			String productName = product.getText();
			return productName;
		}
		return null;
	}

	public void freeShipping() {
		// Need to implement
	}

	public void clikAddToCart() {
		addToCart.click();
	}

	public void addingMultipleProducsToCart() {
		for (WebElement product : addMultipleProducsToCart) {
			product.click();
		}
	}
}

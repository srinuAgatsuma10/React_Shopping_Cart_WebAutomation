package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage_POM extends BasePOMPage {

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	
	// Constructor
	public ProductsPage_POM(WebDriver driver) {
		super(driver);
	}

	
	// WebElements
	@FindBy(xpath = "//div//p[@class='sc-124al1g-4 eeXMBo']")
	List<WebElement> productNames;

	@FindBy(xpath = "//div//div//div[@class=\"sc-124al1g-3 bHJSNa\"]")
	WebElement freeShipping;

	@FindBy(xpath = "//div[@class=\"sc-124al1g-2 bMffkU\"]//button")
	WebElement addToCart;

	@FindBy(xpath = "//div//div//div//button[@class=\"sc-124al1g-0 jCsgpZ\"]")
	List<WebElement> addMultipleProducsToCart;

	@FindBy(xpath = "//main[@class=\"sc-ebmerl-4 iliWeY\"]//p")
	WebElement resultsFound;

	
	
	// Action Methods
	public void getProductName() {
		for (WebElement product : productNames) {
			String productName = product.getText();
			System.out.println(productName);
		}
	}

	public void freeShipping() {
		// Need to implement
	}

	public void clikAddToCart() {
		addToCart.click();
	}

	public void addingMultipleProducsToCart() throws Exception {
		try {
			for (WebElement product : addMultipleProducsToCart) {
				wait.until(ExpectedConditions.elementToBeClickable(product)).click();;
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public int getResultsCount() {
		String[] arr = resultsFound.getText().split(" ");
		return Integer.parseInt(arr[0]);
	}
}

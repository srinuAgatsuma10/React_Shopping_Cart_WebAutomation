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
	
	@FindBy(xpath = "//div[@class='sc-1h98xa9-8 bciIxg']//p[@class='sc-1h98xa9-9 jzywDV']")
	WebElement price;
	
	@FindBy(xpath = "//div[@class='sc-11uohgb-0 hDmOrM']//button[@title='remove product from cart']")
	List<WebElement> removeProduct;

	
	
	// Action Methods
	public String getProductName() {
		return productName.getText();
	}

	public void getProductNames() {
		for (WebElement product : productNames) {
			System.out.println(product.getText());

		}
	}
	
	public float returnCartTotalPirce() {
		float cartPrice = Float.parseFloat(price.getText().substring(2));
		return cartPrice;
	}
	
	public void removePoroductFromCart() {
		for (WebElement remove : removeProduct) {
			remove.click();
		}
	}
}

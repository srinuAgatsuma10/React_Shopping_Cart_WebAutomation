package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import pageObjects.CartPage_POM;
import pageObjects.ProductsPage_POM;
import testBase.BaseClass;

public class TC4_AddToCart_1 extends BaseClass {
	
	/* Test Case : 
	 * Validate Adding one product to the cart.
	 * ExpResults : The product should added to cart and name should be same.
	 */
	
	@Test
	@Description("Validate Adding one product to the cart.")
	@Epic("EP004")
	@Feature("Feature 2 : Add to cart")
	@Story("Story : Cart functionality")
	@Step("Validate Adding product to cart.")
	@Severity(SeverityLevel.CRITICAL)
	public void addToCart() {
		
		ProductsPage_POM pp = new ProductsPage_POM(driver);
		pp.clikAddToCart();
		
		CartPage_POM cp = new CartPage_POM(driver);
		 String productName = cp.getProductName();
		
		Assert.assertEquals(productName, "Blue T-Shirt");
	}
}

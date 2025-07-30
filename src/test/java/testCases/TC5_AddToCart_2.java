package testCases;

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

public class TC5_AddToCart_2 extends BaseClass {

	/* Test Case : 
	 * Validate adding multiple products to the cart.
	 * ExpResults : Products should be added to cart in sequential order.
	 */
	
	@Test
	@Description("Validate adding multiple products to the cart.")
	@Epic("EP005")
	@Feature("Feature 2 : Add to cart")
	@Story("Story : Cart functionality")
	@Step("Validate Adding multiple product to cart.")
	@Severity(SeverityLevel.CRITICAL)
	public void addToCart() throws Exception {
		ProductsPage_POM pp = new ProductsPage_POM(driver);
		pp.addingMultipleProducsToCart();

		CartPage_POM cp = new CartPage_POM(driver);
		cp.getProductNames();

	}
}

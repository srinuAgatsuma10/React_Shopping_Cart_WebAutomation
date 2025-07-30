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

public class TC6_AddToCart_3 extends BaseClass {

	/* Test Case :
	 * Validate price in the cart after increasing quantity of the product.
	 * ExpResult : Price should be increase.
	 */
	
	@Test
	@Description("Validate price in the cart after increasing quantity of the product.")
	@Epic("EP006")
	@Feature("Feature 2 : Add to cart")
	@Story("Story : Cart functionality")
	@Step("Validate change of total amount in cart module")
	@Severity(SeverityLevel.BLOCKER)
	public void addToCart() {
		ProductsPage_POM pp = new ProductsPage_POM(driver);
		pp.clikAddToCart();

		CartPage_POM cp = new CartPage_POM(driver);
		float currentPrice = cp.returnCartTotalPirce();
		pp.clikAddToCart();
		float priceAfterAddingProduct = cp.returnCartTotalPirce();

		if (currentPrice < priceAfterAddingProduct) {
			Assert.assertTrue(true);
			System.out.println("Total price of cart : "+priceAfterAddingProduct);
		} else {
			Assert.assertTrue(false);
		}
	}
}

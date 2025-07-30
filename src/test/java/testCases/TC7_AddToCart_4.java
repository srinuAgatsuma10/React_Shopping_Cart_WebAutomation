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

public class TC7_AddToCart_4 extends BaseClass {

	/* Test Case :
	 * Validate price in the cart by adding and removing products to the cart.
	 * ExpResults : Price should be decrease.
	 */
	
	@Test
	@Description("Validate price in the cart by adding and removing products to the cart.")
	@Epic("EP007")
	@Feature("Feature 2 : Add to cart")
	@Story("Story : Cart functionality")
	@Step("Validate change of total amount in cart module")
	@Severity(SeverityLevel.BLOCKER)
	public void addToCart() throws Exception {
		ProductsPage_POM pp = new ProductsPage_POM(driver);
		pp.addingMultipleProducsToCart();

		CartPage_POM cp = new CartPage_POM(driver);
		float currentPrice = cp.returnCartTotalPirce();
		cp.removePoroductFromCart();
		float priceAfterRemovingProduct = cp.returnCartTotalPirce();

		if (priceAfterRemovingProduct < currentPrice) {
			Assert.assertTrue(true);
			System.out.println("Total price of cart : " + priceAfterRemovingProduct);
		} else {
			Assert.assertTrue(false);
		}
	}

}

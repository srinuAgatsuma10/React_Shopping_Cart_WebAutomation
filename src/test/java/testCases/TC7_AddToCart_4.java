package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage_POM;
import pageObjects.ProductsPage_POM;
import testBase.BaseClass;

public class TC7_AddToCart_4 extends BaseClass {

	/* Test Case :
	 * Validate price in the cart by adding and removing products to the cart.
	 * ExpResults : Price should be decrease.
	 */
	
	@Test
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

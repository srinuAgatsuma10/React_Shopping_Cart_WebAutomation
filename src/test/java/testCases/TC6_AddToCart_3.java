package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage_POM;
import pageObjects.ProductsPage_POM;
import testBase.BaseClass;

public class TC6_AddToCart_3 extends BaseClass {

	/* Test Case :
	 * Validate price in the cart after increasing quantity of the product.
	 * ExpResult : Price should be increase.
	 */
	
	@Test
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

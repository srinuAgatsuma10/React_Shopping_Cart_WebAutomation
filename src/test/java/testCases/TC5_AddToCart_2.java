package testCases;

import org.testng.annotations.Test;

import pageObjects.CartPage_POM;
import pageObjects.ProductsPage_POM;
import testBase.BaseClass;

public class TC5_AddToCart_2 extends BaseClass {

	/* Test Case : 
	 * Validate adding multiple products to the cart.
	 * ExpResults : Products should be added to cart in sequential order.
	 */
	
	@Test
	public void addToCart() throws Exception {
		ProductsPage_POM pp = new ProductsPage_POM(driver);
		pp.addingMultipleProducsToCart();

		CartPage_POM cp = new CartPage_POM(driver);
		cp.getProductNames();

	}
}

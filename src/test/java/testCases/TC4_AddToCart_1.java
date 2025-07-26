package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage_POM;
import pageObjects.ProductsPage_POM;
import testBase.BaseClass;

public class TC4_AddToCart_1 extends BaseClass {
	
	/* Test Case : 
	 * Adding one product to the cart.
	 * ExpResults : The product should added to cart and name should be same.
	 */
	
	@Test
	public void addToCart() {
		
		ProductsPage_POM pp = new ProductsPage_POM(driver);
		pp.clikAddToCart();
		
		CartPage_POM cp = new CartPage_POM(driver);
		 String productName = cp.getProductName();
		
		Assert.assertEquals(productName, "Blue T-Shirt");
	}
}

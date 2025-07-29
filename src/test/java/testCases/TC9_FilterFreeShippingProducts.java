package testCases;

import java.util.List;

import org.testng.annotations.Test;

import pageObjects.ProductsPage_POM;
import testBase.BaseClass;

public class TC9_FilterFreeShippingProducts extends BaseClass {

	/* Test Case :
	 * Filtering products which are available for free shipping.
	 * ExpResults : Free Shipping products should be filtered.
	 */
	
	@Test
	public void filterFreeShippinProducts() {
		ProductsPage_POM productPage = new ProductsPage_POM(driver);

		// Get products with Free shipping
		List<String> freeShippingProducts = productPage.getFreeShippingProducts();

		System.out.println("Products with Free Shipping:");
		for (String name : freeShippingProducts) {
			System.out.println("- " + name);
		}
	}
}

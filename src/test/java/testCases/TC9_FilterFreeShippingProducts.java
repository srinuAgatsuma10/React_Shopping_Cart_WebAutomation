package testCases;

import java.util.List;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import pageObjects.ProductsPage_POM;
import testBase.BaseClass;

public class TC9_FilterFreeShippingProducts extends BaseClass {

	/* Test Case :
	 * Filtering products which are available for free shipping.
	 * ExpResults : Free Shipping products should be filtered.
	 */
	
	@Test
	@Description("Filtering products which are available for free shipping.")
	@Epic("EP009")
	@Feature("Feature 3 : Free Shipping")
	@Story("Story : Free shipping filteration")
	@Step("Validate Free shipping filteration products")
	@Severity(SeverityLevel.BLOCKER)
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

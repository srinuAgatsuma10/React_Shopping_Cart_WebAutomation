package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ProductsPage_POM;
import pageObjects.SizeFilteration_POM;
import testBase.BaseClass;

public class TC3_SizeFilteration_3 extends BaseClass {
	
	/* Test Case 3 :
	 * Validate size filtering by selecting all sizes.
	 * Exp_Results :- All sized clothes should be display.
	 */
	
	@Test
	public void sizeFilteratin3() throws InterruptedException {
		SizeFilteration_POM afp = new SizeFilteration_POM(driver);
		afp.selectAllSizes();
		Thread.sleep(3000);
		ProductsPage_POM pp = new ProductsPage_POM(driver);
		pp.getProductName();
		Assert.assertEquals(pp.getResultsCount(), 16);
	}
	
}

package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ProductsPage_POM;
import pageObjects.SizeFilteration_POM;
import testBase.BaseClass;

public class TC1_SizeFilteration_1 extends BaseClass {
	/* Test Case 1 :
	 * Validate size filtering by selecting one size.
	 * Exp_Results :- XL sized clothes should be display.
	 */
	@Test
	public void sizeFilteration1() throws InterruptedException {
		
		SizeFilteration_POM afp = new SizeFilteration_POM(driver);
		afp.selectOneSize();
		Thread.sleep(1000);
		ProductsPage_POM pp = new ProductsPage_POM(driver);
		pp.getProductName();
		Assert.assertEquals(pp.getResultsCount(), 10);
	}
}

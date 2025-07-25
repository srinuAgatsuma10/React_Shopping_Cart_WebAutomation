package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ProductsPage_POM;
import pageObjects.SizeFilteration_POM;
import testBase.BaseClass;

public class TC2_SizeFilteration_2 extends BaseClass {

	@Test
	public void sizeFinteration2() throws InterruptedException {
		
		SizeFilteration_POM afp = new SizeFilteration_POM(driver);
		afp.selectMultipleSizes();;
		Thread.sleep(3000);
		ProductsPage_POM pp = new ProductsPage_POM(driver);
		pp.getProductName();
		Assert.assertEquals(pp.getResultsCount(), 12);
	}
	
}

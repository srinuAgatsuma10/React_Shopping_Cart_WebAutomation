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
import pageObjects.ProductsPage_POM;
import pageObjects.SizeFilteration_POM;
import testBase.BaseClass;

public class TC1_SizeFilteration_1 extends BaseClass {
	/* Test Case 1 :
	 * Validate size filtering by selecting one size.
	 * Exp_Results :- XL sized clothes should be display.
	 */
	@Test
	@Description("Validate size filtering by selecting one size.")
	@Epic("EP001")
	@Feature("Feature 1 : Size Filteration")
	@Story("Story : Size Filteration")
	@Step("Validate Size Filteration")
	@Severity(SeverityLevel.MINOR)
	public void sizeFilteration1() throws InterruptedException {
		
		SizeFilteration_POM afp = new SizeFilteration_POM(driver);
		afp.selectOneSize();
		Thread.sleep(1000);
		ProductsPage_POM pp = new ProductsPage_POM(driver);
		pp.getProductName();
		Assert.assertEquals(pp.getResultsCount(), 10);
	}
}

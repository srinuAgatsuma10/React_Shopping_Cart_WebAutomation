package testCases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import pageObjects.CartPage_POM;
import pageObjects.ProductsPage_POM;
import testBase.BaseClass;

public class TC8_CheckOutProduct extends BaseClass {

	/* Test Case :
	 * Validate CheckOut Functionality.
	 * ExpResults : Alert should be display with Total Price of cart.
	 */
	
	@Test
	@Description("Validate CheckOut Functionality.")
	@Epic("EP008")
	@Feature("Feature 3 : Check out")
	@Story("Story : Check out functionality")
	@Step("Validate check out funtctionality")
	@Severity(SeverityLevel.BLOCKER)
	public void checkOutPrduct() throws InterruptedException {
		ProductsPage_POM pp = new ProductsPage_POM(driver);
		pp.clikAddToCart();

		CartPage_POM cp = new CartPage_POM(driver);
		cp.checkOutProduct();

		Thread.sleep(2000);

		Alert al = driver.switchTo().alert();
		al.accept();
		System.out.println(al.getText());

	}

}

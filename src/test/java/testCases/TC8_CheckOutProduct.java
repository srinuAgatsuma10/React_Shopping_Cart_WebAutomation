package testCases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import pageObjects.CartPage_POM;
import pageObjects.ProductsPage_POM;
import testBase.BaseClass;

public class TC8_CheckOutProduct extends BaseClass {

	@Test
	public void checkOutPrduct() {
		ProductsPage_POM pp = new ProductsPage_POM(driver);
		pp.clikAddToCart();
		
		CartPage_POM cp = new CartPage_POM(driver);
		cp.checkOutProduct();
		
		Alert al = driver.switchTo().alert();
		al.accept();
		System.out.println(al.getText());
		
		// Implement Update.
		
	}
	
}

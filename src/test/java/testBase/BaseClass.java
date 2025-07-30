package testBase;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver;
	
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	// Capturing Screen Shot
		public String captureScreen(String tname) throws IOException {

			String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date(0));

			TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
			File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

			String targetFilePath = System.getProperty("user.dir") + "\\ScreenShots\\" + tname + "_" + timeStamp + ".png";
			File targetFile = new File(targetFilePath);

			sourceFile.renameTo(targetFile);

			return targetFilePath;

		}
}

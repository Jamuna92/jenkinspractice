package AUTOMATION;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollby {

		// TODO Auto-generated method stub

		WebDriver driver;
		@Test
		public void test() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\FRIENDS\\Desktop\\jamuna testing study\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.tirerack.com/content/tirerack/desktop/en/homepage.html");
			driver.manage().window().maximize();
			
			//to scrollTo full page down
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(3000);
			
			//to scrollTo full page up
			
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, -document.body.scrollHeight)");
			Thread.sleep(3000);
			
			//to scrollBy down particular pixel
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1800)");
			Thread.sleep(3000);
			
			//to scrollBy up particular pixel
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -1800)");
			Thread.sleep(3000);
			
			//to scroll unto particular object
			
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.linkText("Try Our Tire Decision Guide")));
			

		

	}

}

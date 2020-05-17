package AUTOMATION;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait {

	
public static void main(String[] args)
		
		{System.setProperty("webdriver.chrome.driver","C:\\Users\\FRIENDS\\Desktop\\jamuna testing study\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); // wait to load page fully
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS); // wai elements in the page load fully
	
	// Thread.wait - static wait have to wait compulsorily for given time
		// timeouts - dynamic wait can wait only to load elements completely.remaining time can be expelled
	
	
	
	
	
	
	
		}
	
	
	
	
	
	
}

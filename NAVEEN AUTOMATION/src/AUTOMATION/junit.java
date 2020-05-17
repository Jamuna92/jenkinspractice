package AUTOMATION;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class junit {
	WebDriver driver;
	@Before
	public void Open()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\FRIENDS\\Desktop\\jamuna testing study\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void test() {
		driver.get("https://api.cogmento.com/register/");
		
			}
	@After
	public void close()
	{
		driver.close();
	}
}

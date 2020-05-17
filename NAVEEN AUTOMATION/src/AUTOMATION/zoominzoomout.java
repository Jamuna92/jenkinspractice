package AUTOMATION;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zoominzoomout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\FRIENDS\\Desktop\\jamuna testing study\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("http://automationpractice.com/index.php");
		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='40%'");// zoom 40%
		
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='100%'"); //zoom 100%
		
		
		
		

	}

}

	
	
	


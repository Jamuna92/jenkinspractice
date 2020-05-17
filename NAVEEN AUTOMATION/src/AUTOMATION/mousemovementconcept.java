package AUTOMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemovementconcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\FRIENDS\\Desktop\\jamuna testing study\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.spicejet.com");
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();   //whenever use actions objext use build().perform()
			Thread.sleep(200);
			driver.findElement(By.linkText("SpiceMax")).click();



			
			
			// keys class operation
			//act.sendKeys(Keys.F10);

	}

}

package AUTOMATION;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\FRIENDS\\Desktop\\jamuna testing study\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			
			//explicit wait
			 WebDriverWait wait = new WebDriverWait(driver, 60);
			 wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.linkText("Log In"))));
			 
			 
			 
			 //polling wait
			 WebDriverWait wait1 = new WebDriverWait(driver, 30);
			 wait1.pollingEvery(5, TimeUnit.SECONDS);
			 
			 wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.linkText("Log In"))));
			 
			 
			 
			 
	
		
	}
	
	
	
}

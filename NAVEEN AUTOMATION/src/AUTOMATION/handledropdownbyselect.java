package AUTOMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handledropdownbyselect {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\FRIENDS\\Desktop\\jamuna testing study\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Select sel = new Select(driver.findElement(By.id("day")));
		sel.selectByValue("27");
		
		Select sec1 = new Select(driver.findElement(By.id("month")));
		sec1.selectByValue("3");
		
		Select sec2 = new Select(driver.findElement(By.id("year")));
		sec2.selectByValue("1992");
		
		
		
		

		
	}
}

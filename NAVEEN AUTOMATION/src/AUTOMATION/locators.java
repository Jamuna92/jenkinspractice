package AUTOMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\FRIENDS\\Desktop\\jamuna testing study\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	
		// 1 xpath
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("jamugoodly@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Select@123");
		driver.findElement(By.id("u_0_b")).click();
		
		//2 name
		
		driver.findElement(By.name("email")).sendKeys("jamugoodly@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Select@123");
		driver.findElement(By.id("u_0_b")).click();

		//3 id
		
		driver.findElement(By.id("email")).sendKeys("jamugoodly@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Select@123");
		driver.findElement(By.id("u_0_b")).click();
		
		//4 linkText for hyperlinks
		driver.findElement(By.linkText("Log In")).click();
		
		//5 partial linkText : use when linktext for long sentence
		driver.findElement(By.partialLinkText("New Feed")).click();
		
		//6 cssselector
		driver.findElement(By.cssSelector("#email")).sendKeys("jamugoodly@gmail.com");
		
		
		
		
		
		
	}

}

package AUTOMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed {

	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\FRIENDS\\Desktop\\jamuna testing study\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.freecrm.com/register/");
		
		//isdisplayed= applicable for all elemants
		
		try {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/form/div[6]/button")).isDisplayed();
		{
		System.out.println("True");
		}
		}
		catch (Exception e)
		{System.out.println("f");
		}
		}
}


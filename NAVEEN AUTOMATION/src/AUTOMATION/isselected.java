package AUTOMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\FRIENDS\\Desktop\\jamuna testing study\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.freecrm.com/register/");
		try {
			

			driver.findElement(By.name("terms")).isSelected();
			{
			System.out.println("f");
			}
			}
			catch (Exception e)
			{
			System.out.println("t");
				
			}
				}	
		
}

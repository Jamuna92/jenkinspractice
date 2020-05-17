package AUTOMATION;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framehandeling {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\FRIENDS\\Desktop\\jamuna testing study\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/agencyregistration.aspx");
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_btnSubmit\"]")).click();
		Alert arl = driver.switchTo().alert();
		System.out.println(arl.getText());
		String str = arl.getText();
		if(str.equals("Please enter a valid Email address"))
				{
			System.out.println("C");
			
				}
		else {
			System.out.println("F");
			}
		
		
		
		
		
		
		
		
	}
}

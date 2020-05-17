package AUTOMATION;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\FRIENDS\\Desktop\\jamuna testing study\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.freecrm.com/register/");
		String str = driver.getCurrentUrl();
		String str1 = driver.getTitle();
		
		System.out.println(str);
		if(str.equals("https://register.freecrm.com/register/"))
				{System.out.println("t");
				}
		else {
			System.out.println("f");
				}
		
		
	
	}
}

package AUTOMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class coordinationofwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\FRIENDS\\Desktop\\jamuna testing study\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://freecrm.com/");
//positon
		//Point position = driver.manage().window().getPosition();
		
	//position.getX();
//	position.getY();
		
		
	//location of eleement
	Point location = driver.findElement(By.linkText("SIGN UP")).getLocation();
		
		location.getX();
		location.getY();
		
		driver.close();

	
	
	}	
}

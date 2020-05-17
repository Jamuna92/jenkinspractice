package AUTOMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\FRIENDS\\Desktop\\jamuna testing study\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0); // switchto frame can be only written when frame is available inn webpage
		Actions act = new Actions(driver);
		act.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"))).moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).release().build().perform();
		
		
		//doubleclick() 
		//Example
		//Actions act1 = new Actions(driver);
		//act1.moveToElement(driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"))).doubleClick();
		
		
	}	
		
}

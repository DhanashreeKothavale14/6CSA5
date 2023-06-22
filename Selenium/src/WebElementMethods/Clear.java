package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Clear {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/User/Desktop/selenium/html/textbox.html");
		WebElement textBox= driver.findElement(By.id("a"));
		textBox.clear();		//it will erase data which is allready present in textbox 
		textBox.sendKeys("hello");		// it will write the data 
		
		
		
	}

}

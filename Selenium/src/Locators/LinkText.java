package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class LinkText {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fb.com");
		driver.findElement(By.linkText("Forgotten password?"));
		System.out.println("elemnt identified");
		driver.close();
		
		

	}

}

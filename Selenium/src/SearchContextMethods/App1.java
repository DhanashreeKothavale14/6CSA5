package SearchContextMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import java.util.Set;


public class App1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com");
		driver.findElement(By.tagName("input"));
		System.out.println("element 1 identified");
		
		driver.get("https://www.netflix.com");
		driver.findElement(By.tagName("img"));
		System.out.println("element 2 identified");
		
		driver.get("https://www.amazon.com");
		driver.findElement(By.tagName("a"));
		System.out.println("element 3 identified");
		
		driver.get("https://www.myntra.com");
		driver.findElement(By.tagName("input"));
		System.out.println("element 4 identified");
		
		driver.get("https://www.flipkart.com");
		driver.findElement(By.tagName("title"));
		System.out.println("element 5 identified");
		
		driver.get("https://www.fb.com");
		driver.findElement(By.tagName("input"));
		System.out.println("element 6 identified");
		
		driver.get("https://www.github.com");
		driver.findElement(By.tagName("span"));
		System.out.println("element 7 identified");
		
		driver.get("https://www.naukri.com");
		driver.findElement(By.tagName("h2"));
		System.out.println("element 8 identified");
		
		driver.get("https://web.whatsapp.com");
		driver.findElement(By.tagName("div"));
		System.out.println("element 9 identified");
		
		driver.get("https://www.instagram.com");
		driver.findElement(By.tagName("div"));
		System.out.println("element 10 identified");
		
	}

}

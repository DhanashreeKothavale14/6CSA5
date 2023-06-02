package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class LocatorId {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.fb.com");
		driver.findElement(By.id("email"));
		System.out.println("element 1 identified");
		
		driver.get("https://majhinaukri.in/current-recruitment/");
		driver.findElement(By.id("td-mobile-nav"));
		System.out.println("element 2 identified");
		
		driver.get("https://www.zomato.com");
		driver.findElement(By.id("root"));
		System.out.println("element 3 identified");
		
		driver.get("https://www.uber.com");
		driver.findElement(By.id("animation-wrapper"));
		System.out.println("element 4 identified");
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.id("divMain"));
		System.out.println("element 5 identified");
		
		driver.get("https://www.lenskart.com/");
		driver.findElement(By.id("content"));
		System.out.println("element  6 identified");
		
		driver.get("https://www.meesho.com");
		driver.findElement(By.id("__next"));
		System.out.println("element 7  identified");
		
		driver.get("https://www.google.com/gmail/about/");
		driver.findElement(By.id("cookieBar"));
		System.out.println("element 8 identified");
		
		driver.get("https://www.spicejet.com/ ");
		driver.findElement(By.id("react-root"));
		System.out.println("element 9 identified");
		
		driver.get("http://m-indicator.mobond.com/desktop/index.html");
		driver.findElement(By.id("promo"));
		System.out.println("element 10 identified");
	}

}

package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class LocatorPartialLinkText {


			public static void main(String[] args) {
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				
				driver.get("https://demowebshop.tricentis.com/");
				driver.findElement(By.partialLinkText("Jewelry"));
				System.out.println("element 1 identified");
				
				driver.get("https://www.myntra.com/shop/home-living");
				driver.findElement(By.partialLinkText("Home & Living"));
				System.out.println("element 2 identified");
				
				driver.get("https://www.guru99.com/selenium-tutorial.html");
				driver.findElement(By.partialLinkText("Software Tes"));
				System.out.println("element 3 identified");
				
				driver.get("https://www.irctc.co.in/nget/train-search");
				driver.findElement(By.partialLinkText("HOLIDA"));
				System.out.println("element 4 identified");
				
				driver.get("https://github.com/");
				driver.findElement(By.partialLinkText("Pricing"));
				System.out.println("element 5 identified");	
				
				driver.get("https://www.zomato.com/india");
				driver.findElement(By.partialLinkText("Log"));
				System.out.println("element 6 identified");	
				
				driver.get("https://www.amazon.in/");
				driver.findElement(By.partialLinkText("Mobi"));
				System.out.println("element 7 identified");	

				driver.get("https://www.pizzahut.co.in/");
				driver.findElement(By.partialLinkText("Sign"));
				System.out.println("element 8 identified");
				
				driver.get("https://www.netflix.com/in/");
				driver.findElement(By.partialLinkText(" In"));
				System.out.println("element 9 identified");
				
				driver.get("https://www.lenskart.com/");
				driver.findElement(By.partialLinkText("KIDS GLASSE"));
				System.out.println("element 10 identified");
				
				driver.close();
		
		
	}

}

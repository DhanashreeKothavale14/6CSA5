package Assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebElementMethodsAssignment3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement Register=driver.findElement(By.linkText("Register"));
		Register.click();
		
		Thread.sleep(3000);
		WebElement gender = driver.findElement(By.id("gender-female"));
		gender.click();
		
		Thread.sleep(1000);
		
		WebElement firstname = driver.findElement(By.id("FirstName"));
		firstname.sendKeys("Dhanashree");
		
		Thread.sleep(1000);
		
		WebElement lastname = driver.findElement(By.id("LastName"));
		lastname.sendKeys("p");
		
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("pqrs1478@gmail.com");
		
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("abc@123");
		
		Thread.sleep(1000);
		
		WebElement confirmpassword = driver.findElement(By.id("ConfirmPassword"));
		confirmpassword.sendKeys("abc@123");
		
		driver.findElement(By.id("register-button")).submit();

		
		
		
		
		
		
		

	}

}

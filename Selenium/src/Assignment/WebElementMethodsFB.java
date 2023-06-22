package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementMethodsFB {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		WebElement signup= driver.findElement(By.linkText("Create new account")) ;
		signup.click();
		
		Thread.sleep(3000);
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("abc");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("P");
		
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("hgf569@gmail.com");

		WebElement confirmationemail = driver.findElement(By.name("reg_email_confirmation__"));
		confirmationemail.sendKeys("hgf569@gmail.com");

		WebElement password = driver.findElement(By.id("password_step_input"));
		password.sendKeys("hgf569@gmail");
		
		WebElement gender = driver.findElement(By.className("_58mt"));
		gender.click();
		
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}

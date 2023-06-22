package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodsClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		//WebElement password = driver.findElement(By.xpath("//input[@placeholder=\"Search for restaurant, cuisine or a dish"));
		//password.click();
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder=\"Try Saree, Kurti or Search by Product Code"));
		
		password.click();

	}

}

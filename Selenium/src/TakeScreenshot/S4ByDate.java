package TakeScreenshot;


import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.WebElement;

public class S4ByDate {

	public static void main(String[] args) throws IOException {
		Date date = new Date();
		String todate=date.toString().replace(":", "-");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		WebElement username = driver.findElement(By.name("login"));
		File source = username.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/screenshot"+todate+".png");
		FileHandler.copy(source, destination);

	}

}

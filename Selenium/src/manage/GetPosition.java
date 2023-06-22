package manage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point;

public class GetPosition {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.fb.com");
		Point value = driver.manage().window().getPosition();
		System.out.println(value);

	}

}

package manage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		Dimension value = driver.manage().window().getSize();
		System.out.println(value);
	}

}

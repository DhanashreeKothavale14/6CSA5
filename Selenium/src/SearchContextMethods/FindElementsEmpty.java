
//FindElements code if the element/ tag name is not present in HTMLcode

package SearchContextMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.By;

public class FindElementsEmpty {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		List<WebElement> elements = driver.findElements(By.tagName("iput"));
		System.out.println(elements.size());
		System.out.println("element identified");
	}

}


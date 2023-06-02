
//FindElement by tagname if element/ tagname is not found in html code then it will give an exception
//org.openqa.selenium.NoSuchElementException

package SearchContextMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class FindElementException {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		driver.findElement(By.tagName("iput"));
		System.out.println("element identified");

	}

}

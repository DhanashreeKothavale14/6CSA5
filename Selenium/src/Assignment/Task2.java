// Launch multiple browsers at a same time 


package Assignment;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
/*
 *
 * @author Dhanashree
 * 
 */


public class Task2 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Google.com");
		Point p1 = new Point(50,50);
		driver.manage().window().setPosition(p1);
		Dimension d = new Dimension(450,450);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getPosition());
		
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://www.bing.com");
		Point p = new Point(570,50);
		driver1.manage().window().setPosition(p);
		Dimension d1 = new Dimension(450,450);
		driver1.manage().window().setSize(d1);
		System.out.println(driver1.manage().window().getPosition());

	}

}

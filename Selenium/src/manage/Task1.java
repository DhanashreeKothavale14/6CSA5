
// Launch multiple browsers based on users choice


package manage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice: 1.OPEN CHROME 2. OPEN EDGE");
		int ch=sc.nextInt();
		switch(ch) {
		case 1: {
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.Google.com");

		}
		break;
		case 2:{
			WebDriver driver= new EdgeDriver();
			driver.get("https://www.bing.com");

		}
		break;
		default:
		{
			System.out.println("Wrong choice");
		}
			
		}
			
		}

}


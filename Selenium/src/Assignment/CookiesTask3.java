package Assignment;

/*Scenario 1 : 
 * 1.Print all the cookies in the domain 
 * 2.Create your own cookie and add it to the domain 
 * 3.Print all the cookies in the domain 
 * 4. Delete the created cookie with deleteCookie()
 * 5.Print all the cookies in the domain 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Cookie;
import java.util.Set;

public class CookiesTask3 {
                                               
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();					//Open the browser
		driver.get("https://www.fb.com");						//open "https://www.fb.com"
		Set<Cookie> allCookies = driver.manage().getCookies();	//print cookies 
		System.out.println(allCookies.size());
		for(Cookie singleCooky:allCookies)						//get a cookie name which are present 
			System.out.println(singleCooky.getName());
		Cookie cooky1 = new Cookie("Webtechnology","6");				//create your own cookies
		Cookie cooky2 = new Cookie("Selenium","5");
		Cookie cooky3 = new Cookie("manual","3");
		driver.manage().addCookie(cooky1);						//add cookies
		driver.manage().addCookie(cooky2);
		driver.manage().addCookie(cooky3);
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());					//print all the cookies
		for(Cookie singleCooky:allCookies)
			System.out.println(singleCooky.getName());			
		driver.manage().deleteCookie(cooky3);					//delete a cookie by using variable
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());					//Print all the  Cookies
		for(Cookie singleCooky:allCookies)
			System.out.println(singleCooky.getName());

	}
}



package Assignment;

/* Scenario 2
 * 1.Print all the cookies in the domain 
 * 2. Delete the Cookie with deleteCookieNamed()
 * 3.Print all the cookies in the domain 
 */


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Cookie;
import java.util.Set;


public class CookiesTask4 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();					//Open the browser
		driver.get("https://www.fb.com");						//open "https://www.fb.com"
		Set<Cookie> allCookies = driver.manage().getCookies();	//print cookies
		System.out.println(allCookies.size());
		for(Cookie singleCooky:allCookies)						//get a cookie name which are present 
			System.out.println(singleCooky.getName());
		/*Cookie cooky1 = new Cookie("Webtechnology","6");		//create your own cookies
		driver.manage().addCookie(cooky1);						//add cookies
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());				//print Cookies
		for(Cookie singleCooky : allCookies)
			System.out.println(singleCooky.getName());*/
		driver.manage().deleteCookieNamed("fr");		//delete a cookie by name
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());					//print Cookies
		for(Cookie singleCooky : allCookies)
			System.out.println(singleCooky.getName());

	}
}




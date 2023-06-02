package Assignment;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Cookie;
import java.util.Set;


public class CookiesTask6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();					//Open the browser
		driver.get("https://www.fb.com");						//open "https://www.fb.com"
		Set<Cookie> allCookies = driver.manage().getCookies();	//print cookies
		System.out.println(allCookies.size());
		for(Cookie singleCooky:allCookies)						//get a cookie name which are present 
			System.out.println(singleCooky.getName());
		Cookie cooky1 = new Cookie("selenium","1");				//create 2  cookies 
		Cookie cooky2 = new Cookie("manual","5");
		driver.manage().addCookie(cooky1);						//add 3 cookies
		driver.manage().addCookie(cooky2);
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());					//print cookies
		for(Cookie singleCooky:allCookies)
			System.out.println(singleCooky.getName());
		driver.manage().deleteCookie(cooky2);					//delete a cookie by using variable

		driver.manage().deleteCookieNamed("selenium");			//delete a cookie by name
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());					//print Cookies
		for(Cookie singleCooky : allCookies)
			System.out.println(singleCooky.getName());
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());					//print cookies
		for(Cookie singleCooky:allCookies)
			System.out.println(singleCooky.getName());

	}
}

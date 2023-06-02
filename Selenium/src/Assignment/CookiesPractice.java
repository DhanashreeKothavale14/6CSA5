package Assignment;

/*
 * 1.Open the browser
 * 2.Print Cookies
 * 3.Create 3 cookies and add
 * 4.print Cookies
 * 5.delete a cookie by name
 * 6.print Cookies
 * 7.delete a cookie by using variable
 * 8.print cookies
 * 9.delete all cookies 
 * 10.Print Cookies
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Cookie;
import java.util.Set;

                                                         
public class CookiesPractice {

	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();					//1.Open the browser
		driver.get("https://www.fb.com");						//open "https://www.fb.com"
		Set<Cookie> allCookies = driver.manage().getCookies();	//2.print cookies
		System.out.println(allCookies.size());
		for(Cookie singleCooky:allCookies)						//get a cookie name which are present 
			System.out.println(singleCooky.getName());
		Cookie cooky1 = new Cookie("selenium","6");				//3.create 3 cookies 
		Cookie cooky2 = new Cookie("manual","5");
		Cookie cooky3 = new Cookie("java","3");
		driver.manage().addCookie(cooky1);						//3.add 3 cookies
		driver.manage().addCookie(cooky2);
		driver.manage().addCookie(cooky3);
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());					//4.print cookies
		for(Cookie singleCooky:allCookies)
			System.out.println(singleCooky.getName());
		driver.manage().deleteCookieNamed("selenium");			//5.delete a cookie by name
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());					//6.print Cookies
		for(Cookie singleCooky : allCookies)
			System.out.println(singleCooky.getName());
		driver.manage().deleteCookie(cooky3);					//7.delete a cookie by using variable
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());					//8.print cookies
		for(Cookie singleCooky:allCookies)
			System.out.println(singleCooky.getName());
		driver.manage().deleteAllCookies();						//9.delete all cookies
		allCookies = driver.manage().getCookies();
		System.out.println(allCookies.size());					//10.Print Cookies
		for(Cookie singleCooky:allCookies)
			System.out.println(singleCooky.getName());
			
	}
}


package Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class DeleteCookie {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com");
		Cookie cooky = new Cookie("selenium","4");
		driver.manage().addCookie(cooky);
		driver.manage().deleteCookie(cooky);

	}

}

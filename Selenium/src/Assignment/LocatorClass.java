package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class LocatorClass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		

		
		driver.get("https://www.coursera.org/?utm_source=gg&utm_medium=sem&utm_campaign=B2C_INDIA__branded_FTCOF__arte&utm_content=B2C&campaignid=18216928764&adgroupid=141296025832&device=c&keyword=coursera%20login&matchtype=b&network=g&devicemodel=&adpostion=&creativeid=619458216887&hide_mobile_promo&gclid=Cj0KCQjw4NujBhC5ARIsAF4Iv6etIWG1pmHOTeyTXWoZKJ4MuNKARSWJp00NAlQ2lxjtJMJrwUrRaH0aAj-IEALw_wcB");
		driver.findElement(By.className("rc-MetatagsWrapper"));
		System.out.println("element 1 identified");
		
		driver.get("https://www.linkedin.com/login");
		driver.findElement(By.className("artdeco"));
		System.out.println(" element 2 identified");

		
		driver.get("https://www.zomato.com/india");
		driver.findElement(By.className("contents-wrapper"));
		System.out.println("element 3 identified");
		
		driver.get("https://terna.qualcampus.com/Account/LogOn");
		driver.findElement(By.className("col-lg-12"));
		System.out.println("element 4 identified");
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.className("_li"));
		System.out.println(" element 5 identified");
		
		driver.get("https://github.com/");
		driver.findElement(By.className("js-site-favicon"));
		System.out.println(" element 6 identified");
		
		driver.get("https://www.foodpanda.com/");
		driver.findElement(By.className("no-js"));
		System.out.println(" element 7 identified");
		
		driver.get("https://trainings.internshala.com/?utm_source=Google-Search&utm_campaign=CT-Search-Brand-Oct22&utm_adgroup=Brand&utm_locationinterest=&utm_searchkeyword=internshala&utm_keywordid=kwd-296575527534&gclid=Cj0KCQjw4NujBhC5ARIsAF4Iv6crfdhH9-RuIag4OZ6Ss4S-iFA7geJ7O18xBf1eouunH6LUsmYqbLcaAi2LEALw_wcB");
		driver.findElement(By.className("toast-ribbon-modal-container"));
		System.out.println(" element 8 identified");
		
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.className("fonts-loaded"));
		System.out.println(" element 9 identified");
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("fonts-loaded"));
		System.out.println(" element 10 identified");


		
		
		driver.quit();
	}


}


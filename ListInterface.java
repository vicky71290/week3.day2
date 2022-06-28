package week3.day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ListInterface {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://leafground.com/pages/Link.html");
		System.out.println("Browser Opened");
		driver.manage().window().maximize();
		System.out.println("Browser Maximized");
		
		List<WebElement> ListOfLinks = driver.findElements(By.tagName("a"));
		int LinkNo = ListOfLinks.size();
		System.out.println(LinkNo);
		ListOfLinks.get(LinkNo-6).click();
		String PageTitle = driver.getTitle();
		System.out.println(PageTitle);
		driver.navigate().back();
		
		List<WebElement> ListOfLinks1 = driver.findElements(By.tagName("a"));
		int LinkNo1 = ListOfLinks1.size();
		System.out.println(LinkNo1);
		
		for(int i=2;i<=LinkNo1-4;i++) {
		
		String href1 = ListOfLinks1.get(i).getAttribute("href");
		System.out.println(href1);
		
		}
		
		driver.close();
		
	}

}

package week3.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ListClassRoomActivity {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver ();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		List<WebElement> HyperLinks = driver.findElements(By.xpath("//a"));
		HyperLinks.get(1).click();
		System.out.println("Clicked the 1st link");
		driver.navigate().back();

		for (int q = 0;q<HyperLinks.size();q++) {

			String Href = HyperLinks.get(q).getAttribute("href");
			System.out.println( Href);

		}
               
		driver.close();
		
	}

}

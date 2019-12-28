package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThreadSleepConcept {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://app.hubspot.com/login");
		Thread.sleep(5000);		
		System.out.println("Title: "+driver.getTitle());
		
		//thread sleep is not of the part of the Selenium
		//it is a static wait
		//it is used for slow down element or thread in webpage
		
		
		
		
		
		driver.quit();
	}

}

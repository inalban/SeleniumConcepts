package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
		//implicitly wait
		//this method is used to webdriver wait till the element is visible in specific time
		//it does not work for thread sleep because it is not webWlement
		//implicitly works only with webelement
		//if could not find webelement in specicfic time throw NoSuchElementException
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://app.hubspot.com/login");
		
		System.out.println(driver.getTitle());
		
	}

}

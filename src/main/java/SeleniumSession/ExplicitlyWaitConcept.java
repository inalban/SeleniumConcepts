package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWaitConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		//Explicitly wait 
		//It works webelement and non webelement
		//It is avaliable in WebDriverWait class
		//If the element does not visible in the specific time it throws TimeOutException
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://app.hubspot.com/login");
		
		WebDriverWait wait= new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("HubSpot Login") );
		
		System.out.println(driver.getTitle());
		By user=By.id("username");
		By password=By.id("password");
		By submit=By.id("loginBtn");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(user));
		driver.findElement(user).sendKeys("i.nalbantoglu@hotmail.com");
		wait.until(ExpectedConditions.presenceOfElementLocated(password));
		driver.findElement(password).sendKeys("123");
		driver.findElement(submit).click();
		
		driver.quit();
	}

}

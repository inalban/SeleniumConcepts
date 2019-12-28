package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWaitConcept2 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://app.hubspot.com/login");
		
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("HubSpot Login"));
		
		By user=By.id("username");
		By password=By.id("password");
		By submit=By.id("loginBtn");
		
		getElement(driver, user).sendKeys("i.nalbantog)lu@hotmail.com");
		getElement(driver, password).sendKeys("In123");
		getElement(driver, submit).click();
		
	}
	public static WebElement getElement(WebDriver driver, By locator){
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		WebElement elementy=driver.findElement(locator);
		return elementy;
	}
	
}

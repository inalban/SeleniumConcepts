package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWaitConcept3 {
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
		By header=By.className("private-header__heading private-header__heading--solo");
		
		getElement(driver, user, 5).sendKeys("i.nalbantoglu@hotmail.com");
		getElement(driver, password, 10).sendKeys("Tester2019");
		getElement(driver, submit,10).click();
		String text=getElement(driver, header, 5).getText();
		System.out.println(text);
		
	}
	public static WebElement getElement(WebDriver driver, By locator,int timeout){
		waitForpersenceOfElement(driver, locator, timeout);
		
		WebElement elementy=driver.findElement(locator);
		return elementy;
	}
	public static void waitForpersenceOfElement(WebDriver driver, By locator,int timeout){
		WebDriverWait wait=new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		
	}

}

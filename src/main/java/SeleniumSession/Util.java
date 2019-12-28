package SeleniumSession;
import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class Util {
	
	/**
	 * handle JS alert
	 * @param driver
	 * @return
	 */
	
	public static String getAlertText(WebDriver driver){
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		alert.accept();
		return text;
	}
	
	/**
	 * get title of the page
	 * @param driver
	 * @return
	 */
	public static String getPageTitle(WebDriver driver){
		return driver.getTitle();
	}
	
	/**
	 * get url of the page
	 * @param driver
	 * @param url
	 */
	public static void launchURL(WebDriver driver, String url){
		driver.get(url);
	}
	
	/**
	 * Lunch browser
	 * @param driver
	 * @param browseerName
	 * @return
	 */
	public static WebDriver launchBrowser(WebDriver driver,String browseerName){
		if (browseerName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/user/Downloads/chromedriver");
			driver=new ChromeDriver();
			
		}
		else if (browseerName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "/Users/user/Downloads/geckodriver");
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("Browser is not corect "+browseerName);
		}
		return driver;
	}
	
	/**
	 * click on element
	 * @param driver
	 * @param locator
	 */
	public static void clickOn(WebDriver driver, By locator){
		driver.findElement(locator).click();
	}
	
	/**
	 * Cloose browser
	 * @param driver
	 */
	public static void closeBrowser(WebDriver driver){
		driver.quit();
	}
	
	/**
	 * get element
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator){
		WebElement element=driver.findElement(locator);
		return element;
	}
}

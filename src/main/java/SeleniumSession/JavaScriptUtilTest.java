package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptUtilTest {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://app.hubspot.com/login");
		Thread.sleep(5000);
//
//		// System.out.println(driver.getTitle());
//
//		String title = JavaScriptUtil.getTitleByJS(driver);
//		System.out.println(title);
//
		WebElement element = driver.findElement(By.linkText("Sign up"));
		// element.click();

		// JavaScriptUtil.clickElementByJS(element, driver);
		// JavaScriptUtil.refreshBrowserByJS(driver);
		//
		// JavaScriptUtil.generateAlert(driver, "This is search page");

		// JavaScriptUtil.drawBorder(element, driver);
//		WebElement login = driver.findElement(By.id("loginBtn"));
//		JavaScriptUtil.sendKeysUsingJSWithID(driver, "username", "i.nalbantogluu@hotmail.com");
//		JavaScriptUtil.sendKeysUsingJSWithID(driver, "password", "IN123");
//		
//
//		String browserInfo = JavaScriptUtil.getBrowserInfo(driver);
//		System.out.println(browserInfo);

//		String textInner = JavaScriptUtil.getPageInnerText(driver);
//		System.out.println(textInner);
//
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
//
//		JavaScriptUtil.flash(username, driver);
//		username.sendKeys("i.nalbantogluu@hotmail.com");
//		JavaScriptUtil.flash(password, driver);
//		password.sendKeys("IN123");
//		JavaScriptUtil.flash(loginBtn, driver);
//		username.click();
		
//		driver.get("https://darksky.net");
//		JavaScriptUtil.scrollPageDown(driver);
		
		JavaScriptUtil.changeColor("blue", username, driver);
		
	}

}

package SeleniumSession;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Deneme {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/user/Downloads/chromedriver");
		driver=Util.launchBrowser(driver, "chrome");
		Util.launchURL(driver, "https://www.redhat.com");
System.out.println(driver.getTitle());
//		driver.findElement(By.cssSelector("li[id='utility-account']")).click();
//		WebElement element=driver.findElement(By.id("redhat-account-login-link"));
//
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("arguments[0].click();", element);

		
		
	}

}

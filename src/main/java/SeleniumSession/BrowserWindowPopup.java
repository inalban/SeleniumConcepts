package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopup {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// getWindowHandle() get the current window handle
		// getWindowHandles() get the window handles that opened(all windows)
		// switchTo().window();

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://www.popuptest.com/goodpopups.html");

		driver.findElement(By.className("black")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iterator = handles.iterator();
		String parentWindowID = iterator.next();
		System.out.println("Parent window is :" + parentWindowID);
		String childWindowID = iterator.next();
		System.out.println("Child window is : " + childWindowID);

		driver.switchTo().window(childWindowID);
		System.out.println("child window title is: " + driver.getTitle());
		// driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(parentWindowID);
		System.out.println("Parent window title is: "+driver.getTitle());

		
	}

}

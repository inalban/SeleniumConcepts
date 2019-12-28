package SeleniumSession;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForwardConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/user/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.navigate().to("http://www.amazon.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().back();

		driver.navigate().refresh();
	}

}

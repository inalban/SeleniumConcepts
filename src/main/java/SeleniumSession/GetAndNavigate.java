package SeleniumSession;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "/Users/user/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.com");
		driver.navigate().to("https://www.amazon.com");
		
		
	//get() waits for the page to load completely
		//so slower than navigate
		//navigate() we can use for back or forward in our session history
		//navigate() does not wait the page fully loaded
		
		
		
		
		
	}

}

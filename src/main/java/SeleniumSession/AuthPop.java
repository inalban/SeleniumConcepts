package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPop {
	static WebDriver driver;

	
	public static void main(String[] args) {
		//how to handle authentication pop-up
		//driver.get("https://username+password@URL");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String username="admin";
		String password="admin";
		
		//driver.get("https://"+username+":"+password"@the-internet.herokuapp.com/basic_auth");
		
	}

}

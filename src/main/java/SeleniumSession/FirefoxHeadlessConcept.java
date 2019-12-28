package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxHeadlessConcept {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		
		FirefoxOptions fop=new FirefoxOptions();
		fop.addArguments("--headless");
		
		WebDriver driver=new FirefoxDriver(fop);
		driver.get("http://www.google.com");
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
}

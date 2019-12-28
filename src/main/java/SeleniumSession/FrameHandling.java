package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.get("http://londonfreelance.org/courses/frames/index.html");
//		
//		driver.switchTo().frame(driver.findElement(By.name("main")));
//		WebElement header=driver.findElement(By.xpath("//h2[contains(.,'Title bar')]"));
//		System.out.println(header.getText());
//		
//		driver.switchTo().defaultContent();
//		System.out.println(driver.getTitle());
		
		//userId-input-field
		driver.get("https://www.chase.com");
		
		driver.switchTo().frame("logonbox");
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.id("userId-input-field"));
				username.sendKeys("Ismail");
	}

}

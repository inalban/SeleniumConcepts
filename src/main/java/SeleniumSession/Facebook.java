package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://www.facebook.com/r.php");
WebElement gander=driver.findElement(By.id("u_0_7"));
System.out.println("gander is displayed: "+gander.isDisplayed());
System.out.println("gander is enabled: "+gander.isEnabled());
System.out.println("gander is selected: "+gander.isSelected());
gander.click();

System.out.println("after click gander is selected: "+gander.isSelected());

driver.quit();
	}

}

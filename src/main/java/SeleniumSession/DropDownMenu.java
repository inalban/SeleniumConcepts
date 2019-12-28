package SeleniumSession;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenu {
	public static WebDriver driver;

	public static void main(Select args) {

		System.setProperty("webdriver.chrome.driver", "/Users/user/Downloads/chromedriver");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		Select select1 = new Select(day);
		select1.selectByVisibleText("13");

		Select select2 = new Select(month);
		select2.selectByVisibleText("Jan");

		Select select3 = new Select(year);
		select3.selectByVisibleText("1997");

	}

}
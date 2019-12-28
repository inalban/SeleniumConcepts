package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");

		WebElement contentmenu=driver.findElement(By.className("menulink"));
		
		Actions actions=new Actions(driver);
		actions.moveToElement(contentmenu).build().perform();
		
		WebElement coursesLink=driver.findElement(By.linkText("COURSES"));
		//WebElement coursesLink=driver.findElement(By.xpath("//ul[@class='submenu']//a[contains(text(), 'Courses')]"));
		coursesLink.click();
		//actions.click(coursesLink); 2. way but not stable
		
		
	}

}

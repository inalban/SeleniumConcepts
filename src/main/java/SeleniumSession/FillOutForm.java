package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.WebDriverEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FillOutForm {
static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/keyboard-events-sample-form/");
		
		Actions actions=new Actions(driver);
		WebElement target=driver.findElement(By.id("userName"));
		
		actions.sendKeys(target, "Ismail Nalbantoglu").perform();
		
		WebElement cAddress=driver.findElement(By.id("currentAddress"));
		
		actions.sendKeys(cAddress, "11 woodhollow").perform();
		
		WebElement pAddress=driver.findElement(By.id("permanentAddress"));
		actions.click(cAddress).perform();
		actions.keyDown(cAddress,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform(); 
	     actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(pAddress,Keys.CONTROL).perform();
	 
	    //Paste current address in permanant adderss text field
	     actions.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
	 
	   
	
//		WebElement submit=driver.findElement(By.id("submit"));
//		actions.click(submit).perform();
	}

}

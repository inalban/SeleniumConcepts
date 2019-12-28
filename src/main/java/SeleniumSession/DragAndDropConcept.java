package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import com.google.common.net.PercentEscaper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
        
        //Element on which need to drop.		
        WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));
		Thread.sleep(3000);
		Actions actions=new Actions(driver);
		actions.dragAndDrop(From, To).build().perform();
		
		//clickAndHold(sourceElement)
		//moveToElement(targetElement)
		//release()
		//build()
		//perform()
		//block13 ui-draggable
		//amt7
		
		WebElement source=driver.findElement(By.className("ui-draggable"));	
        
        //Element on which need to drop.		
        WebElement target=driver.findElement(By.className("amt7"));
		
		actions.clickAndHold(source).moveToElement(target).release().build().perform();
		
		
	}

}

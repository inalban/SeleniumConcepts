package SeleniumSession;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.gmail.com");
        
        driver.findElement(By.id("identifierId")).sendKeys("boblerry4@gmail.com");
        driver.findElement(By.xpath("//span[@class='CwaK9']")).click();
        
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver); //Wait<WebDriver>
        wait.pollingEvery(Duration.ofSeconds(2));   // 10 times
       //wait.pollingEvery(2, TimeUnit.SECONDS);
        //wait.withTimeout(30, TimeUnit.SECONDS);
        wait.withTimeout(Duration.ofSeconds(20));     ///will wait 20 seconds
        
        wait.until(new Function<WebDriver, WebElement>() {
        	public WebElement apply(WebDriver driver){
        		WebElement textElement = driver.findElement(By.id("headingText"));
        		if(textElement.isEnabled()){
        			System.out.println("element found");
        		}
        		return textElement;
        		
        	}
        	
		});
        
        
        
		
		
		

	}

}

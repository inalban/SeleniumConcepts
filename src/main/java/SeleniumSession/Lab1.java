package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab1 {


		public static void main(String[] args) {
			// declaration and instantiation of objects/variables
			      // WebDriverManager.chromedriver().setup();
			       WebDriver driver = new ChromeDriver();
			       String baseUrl = "http://www.foxnews.com/";
			       String expectedTitle = "Fox News - Breaking News Updates | Latest News Headlines | Photos & News Videos";
			       String actualTitle="";
			// launch Chrome browser and direct it to the Base URL
			       driver.get("http://www.foxnews.com/");
			// get the actual value of the title
			       actualTitle = driver.getTitle();
			       /*
			        * compare the actual title of the page with the expected one and print
			        * the result as "Passed" or "Failed"
			        */
			// what we test/verify is whether there exists a difference btw expected outcome and actual/existing outcome
			       /**
			        * Compares this string to the specified {@code CharSequence}.
			        * The result is {@code true} if and only if this {@code String} represents the
			        * same sequence of char values as the specified sequence.
			        * Note that if the {@code CharSequence} is a {@code StringBuffer} then the method
			        * synchronizes on it.
			        *
			        * <p>For finer-grained String comparison, refer to
			        * {@link java.text.Collator}.
			        *
			        * @param  cs
			        *         The sequence to compare this {@code String} against
			        *
			        * @return  {@code true} if this {@code String} represents the same
			        *          sequence of char values as the specified sequence, {@code
			        *          false} otherwise
			        *
			        * @since  1.5
			        */
			       if (actualTitle.contentEquals(expectedTitle)){
			           System.out.println("Test Passed!");
			       } else {
			           System.out.println("Test Failed");
			       }
			//close your browser
			       driver.close();
			// shut down your JVM
			       System.exit(0);
			       System.out.println("This line is unreachable");
			   
			
	}

}

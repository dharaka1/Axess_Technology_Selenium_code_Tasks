package Windows_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.DrbgParameters.NextBytes;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();  // intilizing chrome driver

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));//Wait method //Topic : 3

		driver.get(
				"https://www.flipkart.com/search?q=Watch&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&as-pos=1&as-type=HISTORY");

		driver.manage().window().maximize(); // maxzimize the window

		WebElement watch = wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//a[@title=\"Trending Day & Date Functioning for Boys Analog Watch  - For Men PGLC-2003\"]")));// wait method is used to Wait until given time. 
                                                                                                                       // Expected_Conditions is used to check the condition of the value and visibilityOfElementLocated is used to check the element is located in the visibility located or not 
		watch.click(); // click the element 

		Set<String> Original_Window = driver.getWindowHandles(); // To handel the the window //Topic : 4

		Iterator<String> iterator = Original_Window.iterator(); //It iterating original Window
		
		//iterator is used to to iterate next one

		String parent_Window = iterator.next(); // It handling parent window

		String child_Window = iterator.next(); //It handling Child window

		driver.switchTo().window(child_Window); //It switch to child Window 

		WebElement scroll_into_view = wait

				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Chain or leather?']")));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", scroll_into_view);   // Scrolling the window method //Topic : 6

		Thread.sleep(1000);

		WebElement Add_To_Cart = wait

				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Add to cart']")));

		Add_To_Cart.click(); 

		Thread.sleep(6000); // Thread sleep is not perfered to this concept and it waits until 6 secs is given time

		driver.quit(); // Its used to close the window

	}
}

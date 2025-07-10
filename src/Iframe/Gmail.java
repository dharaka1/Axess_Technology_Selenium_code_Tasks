package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));// Wait method //Topic : 3

		driver.get("https://www.google.com/");

		System.out.println(driver.getCurrentUrl());

		driver.manage().window().maximize(); // it is used to maximize the window
		
		// driver.manage().window().fullscreen();// it is used to size to full screen


		WebElement Gmail = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@aria-label=\"Google apps\"]")));

		Gmail.click();

		WebElement App = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@name=\"app\"]")));

		App.click();

		driver.switchTo().frame(App);// Iframe is used to handel Inner frame concept one frame to another frame.

		WebElement Click_Gmail = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Gmail']")));

		Click_Gmail.click();

		// System.out.println(driver.getPageSource()); // To get entire html code

		System.out.println(driver.getTitle()); // to get titel of the page
		
		Thread.sleep(2000);


		driver.navigate().back();
		
		Thread.sleep(2000);

	    driver.navigate().refresh();
	    
		Thread.sleep(2000);

	    
	    driver.navigate().forward();
	    
	   // driver.manage().window().minimize(); // it is used to minimize the window
	    
		// System.out.println(driver.getClass()); // To get class of the Webdriver and type of browser

		// Topic : 7
		//Thread.sleep(2000);
		
		//driver.quit();

	}
}

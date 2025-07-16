package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHower2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));

		Actions action = new Actions(driver);

		action.moveToElement(login).perform();

		WebElement profile = driver.findElement(By.xpath("//a[@title='My Profile']"));
		
		profile.click();
		
		driver.navigate().back();
		
		WebElement Mobile=driver.findElement(By.xpath("//div[text()='Vivo T4 5G']"));
		action.moveToElement(Mobile);
		Mobile.click();
		
        Thread.sleep(2000);
		driver.quit();
	}
}

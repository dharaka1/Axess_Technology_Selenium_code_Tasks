package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver(); // Topic : 1
		// WebDriver is an interface
		// driver is an object
		// ChromeDriver is used to initilize to Chrome Browser
		driver.manage().window().maximize(); // Maximize window

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html"); // Launch Url

		driver.findElement(By.xpath("//button[@id='promptBox']")).click();

		Alert alert = driver.switchTo().alert();

		String a = driver.switchTo().alert().getText();

		Thread.sleep(2000);

		System.out.println(alert.getText());

		alert.accept();

		Thread.sleep(2000);

		driver.quit();

	}
}

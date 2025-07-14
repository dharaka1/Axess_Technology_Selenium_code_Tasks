package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHower {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://magento.softwaretestingboard.com/");

		driver.manage().window().maximize();

		WebElement Signin = driver.findElement(By.xpath("(//li[@class='authorization-link'])[1]"));
		Signin.click();

		WebElement User_Name = driver.findElement(By.xpath("//input[@id='email']"));
		User_Name.sendKeys("gayathridharaka@gmail.com");

		WebElement User_Pass = driver.findElement(By.xpath("//input[@name='login[password]']"));
		User_Pass.sendKeys("Gayathri123456");

		WebElement User_Sigin = driver.findElement(By.xpath("(//button[@id='send2'])[1]"));
		User_Sigin.sendKeys(Keys.ENTER);

		WebElement Women = driver.findElement(By.xpath("//span[text()='Women']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Women).perform();
		
		WebElement Top = driver.findElement(By.xpath("//a[@id='ui-id-9']"));
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(Top).perform();

		WebElement Jacket = driver.findElement(By.xpath("//a[@id='ui-id-11']"));
		Actions actions3 = new Actions(driver);
		actions3.moveToElement(Jacket).perform();
		Thread.sleep(2000);

		Jacket.sendKeys(Keys.ENTER);

		WebElement ScrollIntoJacket = driver.findElement(By.xpath("(//span[text()='Jackets'])[3]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ScrollIntoJacket);
		
		Thread.sleep(2000);
		
		driver.quit();

	}
}

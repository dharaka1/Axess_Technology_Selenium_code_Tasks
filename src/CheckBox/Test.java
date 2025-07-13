package CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("http://test.rubywatir.com/checkboxes.php");

		driver.manage().window().maximize();

		WebElement Select_Check_Box = driver.findElement(By.xpath("//input[@value='football']"));

		Select_Check_Box.click();

		WebElement UnSelect_Check_Box = driver.findElement(By.xpath("//input[@value='netball']"));

		UnSelect_Check_Box.click();
		
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
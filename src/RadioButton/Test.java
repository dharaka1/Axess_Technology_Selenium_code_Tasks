package RadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://test.rubywatir.com/radios.php");
		
		driver.manage().window().maximize();
		
		WebElement Select_Radio_Button=driver.findElement(By.xpath("//input[@id='radioId']"));
		
		Select_Radio_Button.click();
		
		Thread.sleep(2000);
		
		driver.quit();
}
}

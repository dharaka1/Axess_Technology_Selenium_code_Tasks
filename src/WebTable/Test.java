package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		driver.manage().window().maximize();
		
		WebElement Select_Country=driver.findElement(By.xpath("(//parent::strong[text()='Canada']//preceding::input[@type='checkbox'])[31]"));
		
		Select_Country.click();
	}
}

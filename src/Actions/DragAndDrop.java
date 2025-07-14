package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		driver.manage().window().maximize();
		
		WebElement Iframe  = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		
		driver.switchTo().frame(Iframe);

		WebElement Source  = driver.findElement(By.xpath("//h5[text()='High Tatras']"));

		WebElement Target = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
		
		Actions actions=new Actions(driver);
		
		actions.dragAndDrop(Source, Target).build().perform();

		Thread.sleep(4000);
		
		driver.quit();
		
}
}

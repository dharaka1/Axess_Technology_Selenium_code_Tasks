package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");  //URL

		driver.manage().window().maximize(); // Maximize the window
		
		WebElement Iframe  = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		
		driver.switchTo().frame(Iframe); // Switch to iframe

		WebElement Source  = driver.findElement(By.xpath("//h5[text()='High Tatras']"));//source to drag

		WebElement Target = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']")); //Target to drop
		
		Actions actions=new Actions(driver); // Doing some actions 
		
		actions.dragAndDrop(Source, Target).build().perform(); //To perform to drag and drop

		Thread.sleep(4000); //4 secs wait
		
		driver.quit(); // Quit the browser
		
}
}

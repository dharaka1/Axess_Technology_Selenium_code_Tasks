package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {
		

	WebDriver driver = new ChromeDriver();

	driver.get("https://demo.automationtesting.in/Static.html");  //URL

	driver.manage().window().maximize(); // Maximize the window
	
    WebElement Source  = driver.findElement(By.xpath("//img[@src='selenium.png']"));//source to drag

	WebElement Target = driver.findElement(By.xpath("//div[@id='droparea']")); //Target to drop
	
	Actions actions=new Actions(driver); // Doing some actions 
	
	actions.dragAndDrop(Source, Target).build().perform(); //To perform to drag and drop

	Thread.sleep(4000); //4 secs wait
	
	driver.quit(); // Quit the browser
}
}
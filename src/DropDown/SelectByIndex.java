package DropDown;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SelectByIndex { //Topic : 8

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
         
		String string=" ";
		
		driver.get("https://automationtesting.co.uk/dropdown.html");
		
		driver.manage().window().maximize();


		WebElement D = driver.findElement(By.xpath("//select[@name=\"cars\"]"));

		Select s = new Select(D);

		s.selectByIndex(1);

		TakesScreenshot screen=(TakesScreenshot)driver;
		File Screen=screen.getScreenshotAs(OutputType.FILE);
		File src=new File("C:\\Users\\welcome\\git\\repository8\\Axess_Technology_Selenium_Tasks\\src"+string+"Cars.png");
		Files.copy(Screen, src);
		
		System.out.println("Cars.png");
	}
}

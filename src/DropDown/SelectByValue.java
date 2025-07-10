package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue { 

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();

		driver.get("https://formstone.it/components/dropdown/demo/");

		WebElement D = driver.findElement(By.xpath("(//select[@class=\"js-dropdown fs-dropdown-element\"])[1]"));

		Select s = new Select(D);

     	s.selectByValue("Two");

	}
}
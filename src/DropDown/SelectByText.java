package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByText {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://automationtesting.co.uk/dropdown.html");

		WebElement D = driver.findElement(By.xpath("//select[@name=\"cars\"]"));

		Select s = new Select(D);

		s.selectByVisibleText("Ford");

		// s.selectByValue("Ford");

	}
}

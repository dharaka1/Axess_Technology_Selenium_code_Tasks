package Robot_Frame_Work;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.Set.*;

public class Test2{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
		WebDriver driver= new ChromeDriver();   // Topic : 1
		//WebDriver is an interface
		//driver is an object
		//ChromeDriver is used to initilize to Chrome Browser
		String s=" "; //Intilizing String s variable without Value for Screenshorts 
		driver.manage().window().maximize(); //Maximize window
		
		Robot r=new Robot(); // Robot Frame work syntax
		
		driver.get("https://www.facebook.com/"); // Launch Url
		
		TakesScreenshot screen=(TakesScreenshot)driver;
		// Take a screenshort //Topic : 2
		
		File file=screen.getScreenshotAs(OutputType.FILE);
		//Output File to get Sceenshort
		File sc=new File("C:\\Users\\welcome\\Videos\\Axess_Technology_Selenium_Tasks\\src\\ScreenShort.file"+s+".png");//Attaching the path of screenshort where we should locate//intializing string variable and Pic type .Png .
		
        Files.copy(file, sc);//Its used to copy The file path
        
        System.out.println("Main_Page.png"); // It initiate Located Element pic name by using png.
		
        // It is passing the value the element 
        
        WebElement User_Password=driver.findElement(By.xpath("//input[@id=\"pass\"]"));
        
        User_Password.sendKeys("Gayathri1@"); 
        
        System.out.println(Keys.ARROW_DOWN );//Robot Arrow Down 

    	TakesScreenshot screen3=(TakesScreenshot)driver;  // Take a screenshort //Topic : 2
    	
        File file3=screen3.getScreenshotAs(OutputType.FILE); //Output File to get Sceenshort
        
		File sc3=new File("C:\\Users\\welcome\\Videos\\Axess_Technology_Selenium_Tasks\\src\\ScreenShort.file"+s+"User_Pass.png");//Attaching the path of screenshort where we should locate//intializing string variable and Pic type .Png .
		
        Files.copy(file3, sc3);//Its used to copy The file path
        
        System.out.println("User_Password.png"); // It initiate Located Element pic name by using png.
        
        System.out.println("Down Arrow to Password");

		
        
        
        WebElement User_name=driver.findElement(By.xpath("//input[@id=\"email\"]"));
        
        User_name.sendKeys("Dharakasundar8@Gmail.com");
        
        System.out.println(Keys.ARROW_UP);//Robot Arrow UP 

        TakesScreenshot screen2=(TakesScreenshot)driver;  // Take a screenshort //Topic : 2
        
        File file2=screen2.getScreenshotAs(OutputType.FILE); //Output File to get Sceenshort
        
		File sc2=new File("C:\\Users\\welcome\\Videos\\Axess_Technology_Selenium_Tasks\\src\\ScreenShort.file"+s+"User_Name.png");//Attaching the path of screenshort where we should locate//intializing string variable and Pic type .Png .
		
        Files.copy(file2, sc2);//Its used to copy The file path
        
        System.out.println("User_Name.png"); // It initiate Located Element pic name by using png.
        
        System.out.println("UP Arrow to User_Name");
        
	    WebElement User_Click_Login=driver.findElement(By.xpath("//button[text()=\"Log in\"]"));
        
        User_Click_Login.sendKeys(Keys.ENTER); // Entering the Click Element By using Robot Frame_Work By using enter method.5
		
        TakesScreenshot screen4=(TakesScreenshot)driver;  // Take a screenshort //Topic : 2
        
        File file4=screen3.getScreenshotAs(OutputType.FILE); //Output File to get Sceenshort
        
		File sc4=new File("C:\\Users\\welcome\\Videos\\Axess_Technology_Selenium_Tasks\\src\\ScreenShort.file"+s+"User_Login.png");//Attaching the path of screenshort where we should locate//intializing string variable and Pic type .Png .
		
        Files.copy(file4, sc4);//Its used to copy The file path
        
        System.out.println("User_Click_Login.png"); // It initiate Located Element pic name by using png.
        
        Thread.sleep(2000);
        
        driver.quit();
	}
}

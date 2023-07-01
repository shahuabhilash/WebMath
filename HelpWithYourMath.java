package WebMathAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelpWithYourMath {
	
	
	public static void main(String[]args)
	{
	
	
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (2)\\chromedriver.exe");
	 WebDriver wd= new ChromeDriver();
	 wd.get("https://www.webmath.com/index.html"); 
	 
	 
	 WebElement  HelpMath =wd.findElement(By.partialLinkText("http://www.cosmeo.com/?source=I06A00005&amp;dest=math"));
	
	{
}
	
	}
}

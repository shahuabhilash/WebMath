package WebMathAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtherStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver wd= new ChromeDriver();
		 wd.get("https://www.webmath.com/index7.html"); 
		 
		 WebElement OtherStuff=wd.findElement(By.name( "Other Stuff"));

		 OtherStuff.click();
		 
		 
		 //TC0027
		 WebElement basicmath =wd.findElement(By.name( "Basic math"));
		 wd.get("https://www.webmath.com/index7.html");
		 WebElement poly=wd.findElement(By.name( "Polynomials"));
		 wd.get("https://www.webmath.com/index7.html");
		 WebElement Stata =wd.findElement(By.name( "Statistical Calculations on Raw Data"));
		 wd.get("https://www.webmath.com/index7.html");
		 WebElement SampleData =wd.findElement(By.name( "Sample Dat"));
			 
		 }
	}



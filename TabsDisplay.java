package WebMathAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Test Case 3
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver wd= new ChromeDriver();
		 wd.get("https://www.webmath.com/index.html"); 
		 
		 WebElement  Home =wd.findElement(By.name("Home"));
		 
Home.click();

WebElement Math=wd.findElement(By.name("Math for Everyone"));

Math.click();

WebElement GeneralMath=wd.findElement(By.name("General Math"));

GeneralMath.click();
WebElement K8Math=wd.findElement(By.name("K-8 Math"));

K8Math.click();
WebElement Algebra=wd.findElement(By.name("Algebra"));

Algebra.click();
WebElement PlotsGeometry=wd.findElement(By.name("Triginometry and Calculus"));

PlotsGeometry.click();
WebElement Trignomewtry=wd.findElement(By.name("Triginometry and Calculus"));

Trignomewtry.click();
o;
}

}
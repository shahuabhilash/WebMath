package WebMathAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BackButtonClick {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver wd= new ChromeDriver();
		 wd.get("https://www.webmath.com/index.html"); 
		 
		//Using Select class for selecting value from dropdown  
	      
		 Select dropdown = new Select(wd.findElement(By.id("Choose Math Help Item")));  
		 dropdown.selectByVisibleText("Area");  
		WebElement go= wd.findElement(By.id("Go"));
		
		WebElement convert= wd.findElement(By.id("submit"));
		
		WebElement back=wd.findElement(By.id("Back"));
		
		   back.click();
		          wd.close();  
}

}


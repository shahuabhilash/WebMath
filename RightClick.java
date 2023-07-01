package WebMathAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightClick {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver wd= new ChromeDriver();
		 wd.get("https://www.webmath.com/index.html"); 
		Actions actions = new Actions(wd);
		 
		   WebElement btnElement = driver.findElement(By.id("Go"));
			 

		   actions.contextClick(btnElement).perform();
	}

}

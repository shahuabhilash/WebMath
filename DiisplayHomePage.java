package WebMathAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiisplayHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//Test Case 1 to load web mnath Home page
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver wd= new ChromeDriver();
		 wd.get("https://www.webmath.com/index.html"); 
			

	}

}

package WebMathAutomation;

import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountingCoins {
	File file =    new File("E:\\TestData\\TestData.xls");
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (2)\\chromedriver.exe");
	 WebDriver wd= new ChromeDriver();
	 wd.get("https://www.webmath.com/index.html"); 
	 Select dropdown = new Select(wd.findElement(By.id("Choose Math Help Item")));  
	 dropdown.selectByVisibleText("Coins, Counting");  
	WebElement go= wd.findElement(By.id("Go"));
	 WebElement quarters =ChromeDriver.findElement(By.name("q"));
     WebElement  dimes=driver.findElement(By.name("d")));
     WebElement dimes=driver.findElement(By.name("n"));
     WebElement  pennies= driver.findElement(By.name("p"));
     


 
     for(int i=1;i<=rowCount;i++) {
    
    	 quarters.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
    	 dimes.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
    	 dimes.sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
    	 pennies.sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
         
    FileInputStream inputStream = new FileInputStream(file);
    

    FileInputStream inputStream1 = new FileInputStream(file);
    

    HSSFWorkbook wb=new HSSFWorkbook(inputStream1);
    
  
    HSSFSheet sheet=wb.getSheet("Test DATA");
    int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
    

    int rowCount1=sheet.getLastRowNum()-sheet.getFirstRowNum();
   
    Object i;
	s.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
    Submit.click();
    
    
WebElement  ocnfirmmations = wb.findElement(By.xpath("'//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/p/input[1]"));
    
     
    HSSFCell cell = sheet.getRow(i).createCell(6);
    
    
    if (confirmationMessage.isDisplayed()) {
       
        cell.setCellValue("pass");
        
    } else {
        
        cell.setCellValue("FAIL");
    }
}
}

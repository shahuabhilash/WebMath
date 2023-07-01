package WebMathAutomation;

import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CommplexNumberCaluclation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		 File file =    new File("E:\\TestData\\TestData.xls");
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (2)\\chromedriver.exe");
			 WebDriver wd= new ChromeDriver();
			 wd.get("https://www.webmath.com/index.html"); 
			 Select dropdown = new Select(wd.findElement(By.id("Choose Math Help Item")));  
			 dropdown.selectByVisibleText("Calculution,ADDINGaLL");  
			WebElement go= wd.findElement(By.id("Go"));
	      
	        FileInputStream inputStream = new FileInputStream(file);
	        
	 
	        FileInputStream inputStream1 = new FileInputStream(file);
	        

	        HSSFWorkbook wb=new HSSFWorkbook(inputStream1);
	        
	      
	        HSSFSheet sheet=wb.getSheet("Test DATA");
	        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
	        

	        int rowCount1=sheet.getLastRowNum()-sheet.getFirstRowNum();
	        WebElement  s=wb.findElement(By.name("s"));
	        Object i;
			s.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
	        Submit.click();
	        
	        
WebElement  ocnfirmmations = wb.findElement(By.xpath("'//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/p/input"));
           
            
           HSSFCell cell = sheet.getRow(i).createCell(6);
           
           
           if (confirmationMessage.isDisplayed()) {
              
               cell.setCellValue("pass");
               
           } else {
               
               cell.setCellValue("FAIL");
           }
	}



}
	}

}

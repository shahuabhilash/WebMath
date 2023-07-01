package WebMathAutomation;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SubmitElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class InvlidDataLertValidation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File file =    new File("E:\\TestData\\TestData.xls");
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (2)\\chromedriver.exe");
			 WebDriver wd= new ChromeDriver();
			 wd.get("https://www.webmath.com/index.html"); 
			 
	        //Create an object of FileInputStream class to read excel file
	        FileInputStream inputStream = new FileInputStream(file);
	        
	        //creating workbook instance that refers to .xls file
	        FileInputStream inputStream = new FileInputStream(file);
	        
	        //creating workbook instance that refers to .xls file
	        HSSFWorkbook wb=new HSSFWorkbook(inputStream);
	        
	        //creating a Sheet object
	        HSSFSheet sheet=wb.getSheet("Test DATA");
	        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
	        
	        //get all rows in the sheet
	        int rowCount1=sheet.getLastRowNum()-sheet.getFirstRowNum();
	        WebElement  s=wb.findElement(By.name("s"));
	        Object i;
			s.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
	        Submit.click();
	        
	        
 WebElement  alertmessage = wb.findElement(By.xpath("'//*[@id=\"d-childMainContLeft\"]/div[2]/table/tbody/tr/td[2]/form/center/p[3]/input[1]"));
            
            //create a new cell in the row at index 6
            HSSFCell cell = sheet.getRow(i).createCell(6);
            
            //check if alert message is displayed
            if (confirmationMessage.isDisplayed()) {
               
                cell.setCellValue("PASS");
                
            } else {
                //if thealert messaage is not displayed , write FAIL in the excel sheet
                cell.setCellValue("FAIL");
            }
	}

}

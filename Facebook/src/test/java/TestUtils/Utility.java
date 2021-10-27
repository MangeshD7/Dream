package TestUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
public static String getExcelData(int row, int col) throws IOException{
		
		String path = "C:\\Users\\91957\\OneDrive\\Desktop\\Xpath File\\TestData.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(col).getStringCellValue();
		file.close();
		return value;
	}

	
	public static String getscreenshot(WebDriver driver) throws InterruptedException, IOException
	{
		SimpleDateFormat test = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");  
	    Date date = new Date();  
	    System.out.println(test.format(date)); 
	    
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Screenshots\\Test123"+(test.format(date))+".jpg");
		FileHandler.copy(source, dest);

		return null;
	}

}

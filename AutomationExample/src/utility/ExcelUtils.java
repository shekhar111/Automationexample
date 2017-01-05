package utility;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {
	 private static Sheet Sheet;
	 private static Workbook WBook;
	 private static Cell Cell;
	 private static Row Row;

	 //This method is to set the File path and to open the Excel file, Pass Excel Path
	 //and Sheetname as Arguments to this method
	 
	 public static void setExcelFile(String ExcelPath,String SheetName) throws Exception
	 {
		 try{
		 FileInputStream Excelfile = new FileInputStream(ExcelPath);
		 //Access test data
		 WBook=WorkbookFactory.create(Excelfile);
		 Sheet=WBook.getSheet(SheetName);
		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception while opening Excel!!!");
		 }
	 }
	 //This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num
public static String getCellData(int rowNum,int cellNum) throws Exception
{
	try{
		Cell=Sheet.getRow(rowNum).getCell(cellNum);
		/*if(Cell.getCellType()==0)
		{
			double cellNumData=Cell.getNumericCellValue();
		}
		else*/
		
		String cellStringData=Cell.getStringCellValue();
		return cellStringData;
	}
	catch(Exception e)
	{
		System.out.println("Exception in reading cell!!!");
		return "";
	}
}
//This method is to write in the Excel cell, Row num and Col num are the parameters
public static void setCellData(String result,int rowNum,int cellNum) throws Exception
{
	try{
		Row=Sheet.getRow(rowNum);
		//Cell=Sheet.getRow(rowNum).getCell(cellNum,Row.RETURN_BLANK_AS_NULL);
		Cell=Row.getCell(cellNum,Row.RETURN_BLANK_AS_NULL);
		if (Cell == null)
			{
			Cell = Row.createCell(cellNum);
			Cell.setCellValue(result);
			}
		else
		{
			Cell.setCellValue(result);
		}
		// Constant variables Test Data path and Test Data file name
		FileOutputStream fileOut = new FileOutputStream(Constant.Path_testData+Constant.File_TestData);
		WBook.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}
	catch(Exception e)
	{
		System.out.println("Exception while writing!!!");
	}
}
}


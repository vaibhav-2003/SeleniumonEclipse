package Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	XSSFWorkbook wb;
	
	public Excel()
	{
		//File src =new File("E:\Selenium\Testdata.xlxs");
		
		try
		{
			Runtime.getRuntime().exec("cmd /c taskkill /F /IM excel.exe");
		}
		catch(Exception e)
		{
			System.out.println("File not Closed");
		}
	}
	
	public String getData(int SheetIndex,int row,int column)
	{
		File src = new File("C:/eclipse/workspace/Selenium/Test_Data.xlsx");
		try
		{
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is" +e.getMessage());
		}
		String data =wb.getSheetAt(SheetIndex).getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	
	
	
	public void writeData(String lastname) throws IOException
	{
		File src = new File("C:/eclipse/workspace/Selenium/Test_Data.xlxs");
		
		
		XSSFRow excelRow = wb.getSheetAt(1).getRow(5);
		XSSFCell pdcell = excelRow.createCell(2);
		pdcell.setCellValue(lastname);
		FileOutputStream fos = new FileOutputStream(src);
		XSSFFormulaEvaluator.evaluateAllFormulaCells(wb);
		wb.getCreationHelper().createFormulaEvaluator().evaluateAll();
		wb.write(fos);
		fos.close();
		
	}
	
	 public  int getRowCount(int SheetIndex) //for returning number of rows
     {
     int row=wb.getSheetAt(SheetIndex).getLastRowNum();  //returns total row index like for 10 rows will return 9 as index starts from 0

     row=row+1;
     return row;

      }

	
	public  int getColumnCount(int SheetIndex,int row)  //for returning number of columns
    {
    int column=wb.getSheetAt(SheetIndex).getRow(row).getLastCellNum(); //returns total column index like for 10 columns will return 9 as index starts from 0

    column=column+1;
    return column;

     }


}

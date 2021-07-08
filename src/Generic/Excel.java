package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public void write(String path,int r,String data,String Sheet) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis= new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(Sheet);
		Row row = sh.createRow(r);
		Cell cell = row.createCell(0);
		cell.setCellValue(data);
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
		
	}
	
	public void read(String path,String Sheet) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(Sheet);
		int r = sh.getLastRowNum();
		for(int i=0;i<=r;i++)
		{
			Row row = sh.getRow(i);
			short c = row.getLastCellNum();
			for(int j=0;j<c;j++)
			{
				Cell cell = row.getCell(j);
				String data=cell.getStringCellValue().toString();
				System.out.println(data);
			}
			System.out.println();
		}
	}

}

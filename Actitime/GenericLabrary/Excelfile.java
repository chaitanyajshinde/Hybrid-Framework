package com.crm.Actitime.GenericLabrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelfile {
	public String excel(String sheet ,int row ,int cell  ) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./testdata/Book1.xxlsx.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return data;
	

}
}

package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
   static XSSFRow row;
	public static void readFromExcel() throws IOException {
	      FileInputStream fis = new FileInputStream(new File("emp.xlsx"));
	      
	      XSSFWorkbook workbook = new XSSFWorkbook(fis);
	      XSSFSheet spreadsheet = workbook.getSheetAt(0);
	      Iterator < Row >  rowIterator = spreadsheet.iterator();
	      
	      List list = new ArrayList();
	      while (rowIterator.hasNext()) {
	         row = (XSSFRow) rowIterator.next();
	         Iterator < Cell >  cellIterator = row.cellIterator();
	         
	         while ( cellIterator.hasNext()) {
	            Cell cell = cellIterator.next();
	            	            
             switch (cell.getCellType()) {
	               case Cell.CELL_TYPE_NUMERIC:
	                 // System.out.print(cell.getNumericCellValue() + " N\t\t ");
	                  list.add(cell.getNumericCellValue());
	                  break;
	               
	               case Cell.CELL_TYPE_STRING:
	                  //System.out.print(cell.getStringCellValue() + " S\t\t ");
	                  list.add(cell.getStringCellValue());
	                  break;
	            }
	         }
	         System.out.println();
	      }
	      fis.close();
	      workbook.close();
	      
	      for(Object o: list) {
	    	  System.out.println(o);
	      }
	   }
}
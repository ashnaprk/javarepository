package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	
	static FileInputStream f; //represent excel workbook file read
	static XSSFWorkbook w;    //excel work book entire representation
	static XSSFSheet sh;      //represent sheet in excel work book
	
	public static String readStringData(int row, int col)throws IOException { //to read string data
	f = new FileInputStream("C:\\Users\\ashna\\eclipse-workspace\\mavenproject\\src\\main\\resources\\Book1.xlsx");
	w = new XSSFWorkbook(f); //apache poi entirely add excel workbook file to memory(allocation)
	sh = w.getSheet("Sheet1");//sheet 1 reprentation in a workbook
	XSSFRow r =sh.getRow(row);  //read cell values-row
	XSSFCell c = r.getCell (col);//read cell values-col
	return c.getStringCellValue ();// getting text format
	}
	
	public static String readintegerData(int row, int col)throws IOException {  //to read integer data
	f = new FileInputStream("C:\\Users\\ashna\\eclipse-workspace\\mavenproject\\src\\main\\resources\\Book1.xlsx");
	w = new XSSFWorkbook(f);  //apache poi entirely add excel workbook file to memory(allocation)
	sh = w.getSheet("Sheet1");  //sheet 1 reprentation in a workbook
	XSSFRow r =sh.getRow (row);
	XSSFCell c = r.getCell (col);//same as above
	int val = (int)c.getNumericCellValue(); 
	return String.valueOf(val);             //convertdouble to int using typecasting return String.valueOf (val);
	                                        //convert int to string using valueOf() method
	                                        //return val;

}
}

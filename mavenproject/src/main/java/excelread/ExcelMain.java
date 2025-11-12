package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main (String args[]) throws IOException {
			String s=ExcelCode.readStringData (1, 0); //AVOID DETAILS AGE AND NAME TITLES ONLY DATA
			System.out.println(s);
			String s1=ExcelCode.readintegerData (1, 1);
			System.out.println(s1);
			String s2=ExcelCode.readStringData (2, 0); //AVOID DETAILS AGE AND NAME TITLES ONLY DATA
			System.out.println(s2);
			String s3=ExcelCode.readintegerData (2, 1);
			System.out.println(s3);
			
			}
			
	}



package excelFileRead;

import java.io.IOException;

public class MyExcelReadMain {

	public static void main(String[] args) throws IOException {
		
		String value1 = MyExcelReadCode.stringDataRead(1, 0);
		System.out.println(value1);
		
		String value2 = MyExcelReadCode.intDataRead(1, 1);
		System.out.println(value2);

	}

}

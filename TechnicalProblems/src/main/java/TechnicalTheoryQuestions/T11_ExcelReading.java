package TechnicalTheoryQuestions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class T11_ExcelReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fs=new FileInputStream("C:\\Users\\703323585\\OneDrive - Genpact\\GFGsheet.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		XSSFSheet sheet=workbook.getSheet("Narmada");
		XSSFRow row=sheet.getRow(0);
		
		Map<String,String> map=new HashMap<String,String>();
		
		
		for(int i=0;i<=sheet.getLastRowNum();i++)
		{
			String val1=(String) sheet.getRow(i).getCell(0).getStringCellValue();
			String val2=sheet.getRow(i).getCell(1).getStringCellValue();
			map.put(val1, val2);
			
		}
		
		
		for(Entry<String, String> x :map.entrySet())
		{
			System.out.println(x.getKey());
			System.out.println(x.getValue());
		}
		
//		Iterator<Map.Entry<String, String>> x=map.entrySet().iterator();
//		
//		while(x.hasNext())
//		{
//			 Map.Entry<Integer, String> new_Map
//             = (Map.Entry<Integer, String>)
//                   x.next();
//
//			//Map.Entry<String,String> ob=(Entry<String, String>) map.entrySet().iterator();
//			System.out.println(new_Map.getKey()+" : "+new_Map.getValue());
//			
//			//System.out.println(x.);
//		}
		
	}

}

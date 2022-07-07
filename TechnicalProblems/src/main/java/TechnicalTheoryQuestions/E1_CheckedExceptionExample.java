package TechnicalTheoryQuestions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E1_CheckedExceptionExample {

	/*
	 *  The FileInputStream(File filename) constructor throws the
	 *  FileNotFoundException that is checked exception.
	 *  The read() method of the FileInputStream class throws the IOException.
	 *  The close() method also throws the IOException.
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

			FileInputStream file_data = null;  
			file_data = new FileInputStream("C:/Users/ajeet/OneDrive/Desktop/Hello.txt");  //FileNotFound
			int m;  
			while(( m = file_data.read() ) != -1) {   //IO exception
			    System.out.print((char)m);  
			}  
			file_data.close(); //Io Exception
			Thread.sleep(100); //Interrupted Exception
	}

}

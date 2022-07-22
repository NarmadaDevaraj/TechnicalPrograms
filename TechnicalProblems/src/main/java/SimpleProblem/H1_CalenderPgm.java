package SimpleProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Scanner;

class Result {

	    /*
	     * Complete the 'findDay' function below.
	     *
	     * The function is expected to return a STRING.
	     * The function accepts following parameters:
	     *  1. INTEGER month
	     *  2. INTEGER day
	     *  3. INTEGER year
	     */

	    public static String findDay(int month, int day, int year) {
	     Calendar c=Calendar.getInstance();
	     c.set(year, month-1, day);
	     int  value=c.get(Calendar.DAY_OF_WEEK);
	     System.out.println(value);
	     String dayOfWeek=getDayOfWeek(value);
	     dayOfWeek=dayOfWeek.toUpperCase();
	     return  dayOfWeek;
	    }
	 public static String getDayOfWeek(int value){
	    String day = "";
	    switch(value){
	    case 1:
	        day="Sunday";
	        break;
	    case 2:
	        day="Monday";
	        break;
	    case 3:
	        day="Tuesday";
	        break;
	    case 4:
	        day="Wednesday";
	        break;
	    case 5:
	        day="Thursday";
	        break;
	    case 6:
	        day="Friday";
	        break;
	    case 7:
	        day="Saturday";
	        break;
	    }
	    return day;
	    }    
	}

	public class H1_CalenderPgm {
	    public static void main(String[] args) throws IOException {
//	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	    	Scanner scan=new Scanner(System.in);
	    	System.out.println("Enter the month MM :");
	    	String s1=scan.next();
	    	System.out.println("Enter the day DD :");
	    	String s2=scan.next();
	    	System.out.println("Enter the year yyyy :");
	    	String s3=scan.next();
	    	
	        int month = Integer.parseInt(s1);

	        int day = Integer.parseInt(s2);

	        int year = Integer.parseInt(s3);

	        String res = Result.findDay(month, day, year);
	        System.out.println(res);

//	        bufferedWriter.write(res);
//	        bufferedWriter.newLine();
//
//	        bufferedReader.close();
//	        bufferedWriter.close();
	    }
}

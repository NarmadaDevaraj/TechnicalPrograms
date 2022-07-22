package SimpleProblem;

import java.util.Scanner;

public class H2_SpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        //String split[]=s.split("\\s_?@>.*,!'");
        s=s.trim();
        if(s.isEmpty())
        {
         System.out.println(s.length());   
        }else
        {
        String split[]=s.split("[\\s@&.',_!*?$+-]+");
        
        System.out.println(split.length);
        for(int i=0;i<split.length;i++)
        {
            System.out.println(split[i]);
        }
        }
        scan.close();
	}

}

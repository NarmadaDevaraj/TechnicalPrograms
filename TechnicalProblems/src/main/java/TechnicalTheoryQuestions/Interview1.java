package TechnicalTheoryQuestions;

public class Interview1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		short num=10;
		short ans=add(2,3,num);
		System.out.println(ans);
		
		short num1=2;
		int ans1=add(1,num1,10.0);
		System.out.println(ans1);
	}
	
	public static int add(int a,short c,double d)
	{
		return (int) (a+c+d);
	}
    public static short add(int a,int c,short b)
    {
    	
    	return (short) (a+b);
    }
}

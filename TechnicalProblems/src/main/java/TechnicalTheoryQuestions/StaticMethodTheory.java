package TechnicalTheoryQuestions;

public class StaticMethodTheory {

	//int a=2;
	static int b=5;
	
//	StaticMethodTheory()
//	{
//		System.out.println("a :"+a++);
//		System.out.println("b :"+b++);
//	}
	public static void main(String[] args) {
		
		StaticMethodTheory st=new StaticMethodTheory();
		StaticMethodTheory st1=new StaticMethodTheory();
		StaticMethodTheory st2=new StaticMethodTheory();
		StaticMethodTheory.test();
		StaticMethodTheory.test();
	}
	public static void test()
	{
		int a=2;
		
		System.out.println(b++);
		System.out.println(a++);
	}
	
	

}

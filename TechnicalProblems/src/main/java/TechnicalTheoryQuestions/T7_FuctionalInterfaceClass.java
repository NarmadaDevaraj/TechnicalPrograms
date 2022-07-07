package TechnicalTheoryQuestions;

public class T7_FuctionalInterfaceClass implements T6_FunctionalInterface{

	public static void main(String[] args) {
		
		
		//T7_FuctionalInterfaceClass fic=new T7_FuctionalInterfaceClass();
		
		T6_FunctionalInterface fic=new T7_FuctionalInterfaceClass(); //Dynamic binding
		
		fic.test(); //calling abstract method 
		fic.test2();//calling default method
		T6_FunctionalInterface.test3();//calling static method
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
		System.out.println("Functional test");
	}
 
}

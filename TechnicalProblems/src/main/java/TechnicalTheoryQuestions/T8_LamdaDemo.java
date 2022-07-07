package TechnicalTheoryQuestions;

public class T8_LamdaDemo {

	public static void main(String[] args) {
		
//        T6_FunctionalInterface fic=new T7_FuctionalInterfaceClass(); //Dynamic binding
//		
//		fic.test(); //calling abstract method 
//		fic.test2();//calling default method
//		T6_FunctionalInterface.test3();//calling static method

		
		T6_FunctionalInterface fic=()-> System.out.println("Am lamda function"); //to perform small mathematicall approach eg. seasonal wishes to everybody
		fic.test(); //here its calling the syso line . its calling directly test() abstract method .dont need to give implementation
	    fic.test2(); //calling default method
	    T6_FunctionalInterface.test3(); //calling static method
		
		
		T9_FunctionalInterface1 t9Obj=(int a,int b) -> { return a+b; };
		int result =t9Obj.add(11,10);
		System.out.println(result);
	
	}

}

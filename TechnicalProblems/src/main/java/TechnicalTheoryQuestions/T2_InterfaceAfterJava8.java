package TechnicalTheoryQuestions;

//blueprint for a class
public interface T2_InterfaceAfterJava8 {
	
    default void display() //after java 8 
    {
        System.out.println("hello");
    }

    static void displayStatic()
    {
        System.out.println("hello");
    }

}

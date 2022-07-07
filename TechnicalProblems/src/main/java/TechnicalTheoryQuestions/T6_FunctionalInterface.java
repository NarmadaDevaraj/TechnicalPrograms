package TechnicalTheoryQuestions;

@FunctionalInterface
public interface T6_FunctionalInterface
{
 
	//FunctionalInterface --it should have  only one abstract method and it can have n number of default and static method
	
	//Marker interface --RandomAccess ,Serializable and clonable --it should not contain any method
	
	public abstract void test(); //abstract method
	
	default void test2()
	{
		System.out.println("i am default method");
	}
	
	static void test3()
	{
		System.out.println("i an static method");
	}
	
}

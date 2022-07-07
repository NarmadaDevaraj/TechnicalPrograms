package TechnicalTheoryQuestions;

public class T1_GarbageCollection {

	//automatically removes unused object when creating object using new keyword
	//when an object is ready for garbage collector (gc)
	
	
	T1_GarbageCollection gc1; //instance or global variable 
	
	public static void main(String[] args) {
		
		T1_GarbageCollection GC1=new T1_GarbageCollection();
		T1_GarbageCollection GC2=new T1_GarbageCollection();
		T1_GarbageCollection GC3=new T1_GarbageCollection();
		
		//GC1=null; //1)using nullify the object
		GC1=GC2;    //2)second way -Reassigning reference variable 
		GC1=null;
		//GC2=GC1.gc1;
		
		System.gc(); //it internally calls finilize method //this is static method
		
		System.out.println(GC1);
		System.out.println(GC2);
		System.out.println(GC3);
		
		//Runtime rt=new Runtime(); //it has private constructor thats called singleton class
		Runtime rt=Runtime.getRuntime(); //factory method returning an object o the same
	    rt.gc();//another way to call gc //both are internally working same System.gc() and rs.gc()
	    System.out.println(rt.freeMemory());
	    System.out.println(rt.totalMemory());
	
	}
	public void  display()
	{
		T1_GarbageCollection GC4=new T1_GarbageCollection();
		gc1=GC4;
		
	}
	public void finalize()
	{
		System.out.println("Finalize mehtod internally called by gc() method");
	}

}

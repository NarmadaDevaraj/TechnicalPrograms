package TechnicalTheoryQuestions;


	class Employee {
	     static void salary() {
	        System.out.println("Salary= 200000");
	    }
	}

	class Programmer extends Employee { 
	// Programmer class inherits from Employee class
	    static void salary() {
	        System.out.println("Bonus=50000");
	    }
	}

	class StaticMethodInheritance {
	    public static void main(String args[]) {
	    	Employee p = new Programmer();
	        p.salary(); // calls method of super class
	       //p.bonus(); // calls method of sub class
	    }
	}


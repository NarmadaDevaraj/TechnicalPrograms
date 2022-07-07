package Runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class ExecuteFailedTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestNG testng=new TestNG();
		
		List<String> list= new ArrayList<String>();
		
		list.add("C:\\Users\\703323585\\Narmada\\TechnicalQuestions\\TechnicalProblems\\test-output\\testng-failed.xml");
		
		testng.setTestSuites(list);
		
		testng.run();
		
	}

}

package SimpleProblem;

import org.openqa.selenium.JavascriptExecutor;

public class TC1_Tom_Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {3,1,2,3,2,1,4};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					//System.out.println("its less only");
				}else
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		
		//remove duplicates
		
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=0;
					//System.out.println("comimn");
				}
			}
			if(count>=1&&arr[i]!=0)
			{
				System.out.println(arr[i]);
			}
		}
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//	  js.executeScript("Window.scrollTo(0,500)");
//	
//	js.executeScript("arguement[0].scrollInToView(true);", element);
	}

}

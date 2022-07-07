package SimpleProblem;

public class I12_KavitaCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,3,4}; //op :(unique no in the array)
		int n =a.length;
		for(int i=0;i<n;i++)
		{
		int count =1;
	    for(int j=i+1;j<n;j++)
		{
		if(a[i] == a[j])
		{
		count++;
		a[j]=0;
		}
		}
		if(count>=1 && a[i]!=0){
		System.out.println(a[i]);
		}



	}

}
}
package SimpleProblem;

public class I5_PrintWithoutDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="NarmadaGuru";
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[i]='0';
					ch[j]='0';
				}
			}
			if(ch[i]!='0')
			{
				System.out.println(ch[i]);
			}
		}

	}

}

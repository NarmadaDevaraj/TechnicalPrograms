package ArrayAndArraylist;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ListWithWrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list=new ArrayList();
		//Calender c=new Calendar();
		
		list.add("narmada");
		list.add(12);
		list.add(12.89);
		list.add('a');
		list.add(Calendar.getInstance().getTime());
		
		for(Object types:list)
		{
			System.out.println("Converting wrapper="+types.getClass());
			System.out.println(types);
		}
	}

}

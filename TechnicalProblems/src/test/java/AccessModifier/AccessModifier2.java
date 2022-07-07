package AccessModifier;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AccessModifier2 {
	//
	//We can access private method using java.util.class and java .lang.reflect package

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		// TODO Auto-generated method stub

		AccessModifier2 ob=new AccessModifier2();
		//accessing private method
		Class c = Class.forName("AccessPrivateMethod");
		Object obj;
		
		obj = c.newInstance();
	    Method method = c.getDeclaredMethod("add", null);
	    method.setAccessible(true);
	    method.invoke(obj, null);
		
	}

}

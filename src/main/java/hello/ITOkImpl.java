package hello;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ITOkImpl<T> implements ITOk<T> {

	@Override
	public void v(T t) {
		Method[] method = t.getClass().getMethods();
		System.out.println("class name :" + t.getClass());
		System.out.println("mehtod size:" + method.length);
		for (Method m : method) {
			//System.out.println(m.getName());
		}
		
		try {
			pr(t);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return method.invoke(object, args);
	}

	public void pr(T obj) throws Exception {
		Class clazz = obj.getClass();
		Field[] fields = obj.getClass().getDeclaredFields();// 获得属性
		for (Field field : fields) {
			PropertyDescriptor pd = new PropertyDescriptor(field.getName(), clazz);
			Method getMethod = pd.getReadMethod();// 获得get方法
			Object o = getMethod.invoke(obj);// 执行get方法返回一个Object
			System.out.print(o);
		}
	}
}

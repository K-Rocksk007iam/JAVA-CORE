package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Test {
	private String s;

	public Test() {
		s = "HELLO";
	}

	public Test(String s) {
		this.s = s;
	}

	public void method1() {
		System.out.println("The String is " + s);
	}

	public void method2(int n) {
		System.out.println("The Number is " + n);
	}

	private void method3() {
		System.out.println("This Is Private Method ");
	}
}

public class ReflectionDemo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			InvocationTargetException, NoSuchFieldException {
		Test obj = new Test();
		System.out.println("------------------------------");

		// displays class name
		Class class1 = obj.getClass();
		System.out.println("class name is " + class1.getName());
		System.out.println("------------------------------");

		// displays constructor
		Constructor cons = class1.getConstructor();
		System.out.println(cons.getName());
		System.out.println("------------------------------");

		// only displays public methods
		Method meth[] = class1.getMethods();
		for (Method var : meth) {
			System.out.println(var.getName());
		}
		System.out.println("------------------------------");

		// calling methods
		Method met = class1.getDeclaredMethod("method1");
		met.invoke(obj);

		Method met1 = class1.getDeclaredMethod("method2", int.class);
		met1.invoke(obj, 100);
		System.out.println("------------------------------");

		// setting value for MV
		Field field = class1.getDeclaredField("s");
		field.setAccessible(true); // method is private , we have to specify
		field.set(obj, "kunal");
		System.out.println("------------------------------");
		
		// accesing the private method
		Method method12=class1.getDeclaredMethod("method3");
		method12.setAccessible(true);
		method12.invoke(obj);

	}

}
